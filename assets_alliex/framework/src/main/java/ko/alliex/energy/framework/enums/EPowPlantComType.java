package ko.alliex.energy.framework.enums;

import lombok.Getter;

import java.util.EnumSet;

@Getter
public enum EPowPlantComType {

    SOLAR_PANEL((short) 1),
    MOUNT((short) 2),
    PCS((short) 3),
    JUNCTION((short) 4),
    MONITORING((short) 5),
    CONSTRUCTION((short) 6),
    OM_CHARGE((short) 7),
    CURRENT_COLLECTOR_BOX((short) 8),
    POWER_RECEIVING_TRANSFORMING_EQUIPMENT((short) 9),
    SURVEILLANCECAMERA((short) 10),
    PYRANOMETER((short) 11),
    THERMOMETER((short) 12),
    PANELTHERMOMETER((short) 13),
    SUBSTATION((short) 14),
    ;

    public final short code;

    // Constructor
    EPowPlantComType(short code) {
        this.code = code;
    }

    // Class Methods
    public static EPowPlantComType atCode(short code) {
        return EnumSet.allOf(EPowPlantComType.class).stream()
                .filter(category -> category.code == code)
                .findFirst()
                .orElse(null);
    }
}
