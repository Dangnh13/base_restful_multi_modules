package ko.alliex.energy.framework.util;

import ko.alliex.energy.framework.enums.ESize;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AppUtil {

    private static final String REGEX_POSTAL_CODE = "^\\d{3}-\\d{4}$";

    private AppUtil() {
    }

    public static ESize calculateSizeOf(BigDecimal pKw) {
        if (pKw == null) {
            return ESize.UNKNOWN;
        }
        if (pKw.floatValue() >= 2000) {
            return ESize.EXTRA_HIGH;
        } else if (pKw.floatValue() >= 50) {
            return ESize.HIGH;
        } else if (pKw.floatValue() >= 40) {
            return ESize.LOW;
        } else {
            return ESize.OTHER;
        }
    }

    public static boolean isValidPostalCode(String postalCode) {
        Pattern pattern = Pattern.compile(REGEX_POSTAL_CODE);
        Matcher matcher = pattern.matcher(postalCode);
        return (StringUtils.isNotBlank(postalCode) && matcher.matches());
    }

    public static String formatPostalCode(String raw) {
        return new StringBuilder(raw).insert(3, '-').toString();
    }
}
