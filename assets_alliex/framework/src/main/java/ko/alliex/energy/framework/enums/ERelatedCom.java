package ko.alliex.energy.framework.enums;

import lombok.Getter;

import java.util.EnumSet;

@Getter
public enum ERelatedCom {

    GROUP(1),
    PARENT(2);

    public final int code;

    // Constructor
    ERelatedCom(int code) {
        this.code = code;
    }

    // Class Methods
    public static ERelatedCom atCode(int code) {
        return EnumSet.allOf(ERelatedCom.class).stream()
                .filter(category -> category.code == code)
                .findFirst()
                .orElse(null);
    }
}
