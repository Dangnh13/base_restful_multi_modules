package ko.alliex.energy.framework.enums;

import lombok.Getter;

import java.util.EnumSet;

@Getter
public enum ELoggedType {

    LOGOUT((short) 0), LOGGED((short) 1);

    public short code;

    // Constructor
    ELoggedType(short code) {
        this.code = code;
    }

    // Class Methods
    public static ELoggedType atCode(final short code) {
        return EnumSet.allOf(ELoggedType.class).stream()
                .filter(category -> category.code == code)
                .findFirst()
                .orElse(null);
    }
}
