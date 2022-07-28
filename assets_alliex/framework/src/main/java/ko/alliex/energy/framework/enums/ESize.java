package ko.alliex.energy.framework.enums;

import lombok.Getter;

import java.util.EnumSet;

@Getter
public enum ESize {

    EXTRA_HIGH("特高圧", ">=2000KW"),
    HIGH("高圧", "50KW <= p <2000KW"),
    LOW("低圧", "40KW <= p <50KW"),
    OTHER("低圧以下", " < 40KW"),
    UNKNOWN("不明", "NULL OR BLANK");

    public final String code;

    public final String label;

    // Constructor
    ESize(String code, String label) {
        this.code = code;
        this.label = label;
    }

    // Class Methods
    public static ESize atCode(final String code) {
        return EnumSet.allOf(ESize.class).stream()
                .filter(category -> category.code.equals(code))
                .findFirst()
                .orElse(null);
    }
}
