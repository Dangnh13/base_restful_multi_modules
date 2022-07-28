package ko.alliex.energy.framework.enums;

import lombok.Getter;

import java.util.EnumSet;

@Getter
public enum EConFlict {

    CON_FLICT((short) 1),
    NOT_CON_FLICT((short) 0);

    public final short code;

    // Constructor
    EConFlict(short code) {
        this.code = code;
    }

    // Class Methods
    public static EConFlict atCode(short code) {
        return EnumSet.allOf(EConFlict.class).stream()
                .filter(category -> category.code == code)
                .findFirst()
                .orElse(null);
    }
}
