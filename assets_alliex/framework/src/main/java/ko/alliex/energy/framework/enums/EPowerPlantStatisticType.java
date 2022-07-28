package ko.alliex.energy.framework.enums;

import java.util.EnumSet;

public enum EPowerPlantStatisticType {
    ACTUAL_SOLAR_RAD(1),
    PCS_ACTUAL_POW_GEN(2),
    ACTUAL_POW_SALES(3);

    public final int code;

    // Constructor
    EPowerPlantStatisticType(int code) {
        this.code = code;
    }

    // Class Methods
    public static EPowerPlantStatisticType atCode(int code) {
        return EnumSet.allOf(EPowerPlantStatisticType.class).stream()
                .filter(category -> category.code == code)
                .findFirst()
                .orElse(null);
    }

}
