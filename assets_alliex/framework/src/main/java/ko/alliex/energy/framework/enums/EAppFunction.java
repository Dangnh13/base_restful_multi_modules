package ko.alliex.energy.framework.enums;

import lombok.Getter;

import java.util.EnumSet;

@Getter
public enum EAppFunction {

    COMPANY("企業一覧"), //企業一覧
    POW_PLANT("発電所一覧"), //発電所一覧
    MINISTRY_POW_PLANT_DATA_EDIT("MINISTRY_POWER_PLANT"),// 経産省発電所加工一覧
    PURCHASE("PURCHASE"),
    SALE("SALE"),
    ;

    public final String code;

    // Constructor
    EAppFunction(String code) {
        this.code = code;
    }

    // Class Methods
    public static EAppFunction atCode(short code) {
        return EnumSet.allOf(EAppFunction.class).stream()
                .filter(category -> category.code.equals(code))
                .findFirst()
                .orElse(null);
    }
}
