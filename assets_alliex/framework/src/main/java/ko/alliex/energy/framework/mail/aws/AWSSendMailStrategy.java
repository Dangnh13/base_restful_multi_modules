package ko.alliex.energy.framework.mail.aws;

import ko.alliex.energy.framework.dto.aws.AwsMailInfoRequest;
import ko.alliex.energy.framework.mail.SendMail;
import lombok.extern.slf4j.Slf4j;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import static ko.alliex.energy.framework.constant.CommonConstant.AWS_MAIL_REGION;
import static ko.alliex.energy.framework.constant.CommonConstant.SYMBOL.COMMA_SYMBOL;


@Slf4j
public class AWSSendMailStrategy implements SendMail {

    private static final int PORT = 587;

    private String username;

    private String password;

    public AWSSendMailStrategy(String username, String password){
        this.username = username;
        this.password = password;
    }


    // Create a Session object to represent a mail session with the specified properties.
    private Session createMailSession() {
        Properties props = System.getProperties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.port", PORT);
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(props);
        return session;
    }

    //Create a Message
    private MimeMessage createMessage(AwsMailInfoRequest request, Session session) throws UnsupportedEncodingException, MessagingException {
        MimeMessage msg = new MimeMessage(session);
        msg.setFrom(new InternetAddress(request.getFrom(), request.getFromName()));
        List<Address> recipients = new ArrayList<>();
        if (request.getTo().contains(COMMA_SYMBOL)) {
            String[] addresses = request.getTo().split(COMMA_SYMBOL);
            Arrays.stream(addresses).sequential().forEach(e -> {
                try {
                    recipients.add(new InternetAddress(e));
                } catch (AddressException addressException) {
                    addressException.printStackTrace();
                }
            });
            msg.setRecipients(Message.RecipientType.TO, recipients.toArray(Address[]::new));
        } else {
            msg.setRecipient(Message.RecipientType.TO, new InternetAddress(request.getTo()));
        }
        msg.setSubject(request.getSubject(), "UTF-8");
        msg.setContent(request.getBody(), "text/html;charset=UTF-8");
        if (request.getConfigset() != null && !request.getConfigset().isBlank()) {
            msg.setHeader("X-SES-CONFIGURATION-SET", request.getConfigset());
        }

        return msg;
    }

    @Override
    public boolean sendMail(Object object) {
        try {
            Session session = createMailSession();
            MimeMessage msg = null;
            AwsMailInfoRequest request = (AwsMailInfoRequest) object;
            if (session != null) {
                msg = createMessage(request, session);
            }
            Transport transport = session.getTransport();

            // Send the message.
            try {
                log.info("Sending...");
                transport.connect(AWS_MAIL_REGION, this.username, this.password);

                // Send the email.
                transport.sendMessage(msg, msg.getAllRecipients());
                log.info("Email sent!");
                return true;
            } catch (Exception ex) {
                log.error("The email was not sent.");
                log.error("Error message: " + ex.getMessage(), ex);
            } finally {
                // Close and terminate the connection.
                transport.close();
            }
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }
        return false;
    }
}