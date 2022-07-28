package ko.alliex.energy.jwt.exception;

public class InvalidTokenException extends TokenException {
    public InvalidTokenException(String msg, Throwable e) {
        super(msg, e);
    }

    public InvalidTokenException(String msg) {
        super(msg);
    }
}
