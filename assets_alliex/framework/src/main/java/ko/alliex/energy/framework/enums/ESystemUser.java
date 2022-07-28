package ko.alliex.energy.framework.enums;

import lombok.Getter;

import java.util.EnumSet;

@Getter
public enum ESystemUser {

    SYSTEM(0),

    /** Import master, company data from csv file */
    MC0000(1),

    /** Convert data from xslm to database */
    MC0001(2),

    /** Convert raw data in some fields pow_plant to enum key from master table */
    MC0002(3),

    /** Mapping pow_plant.pref_code to master of pref_code */
    MC0003(4),

    /** Mapping companyId into pow_plant from salesforce data source */
    MC0004(5),

    /** Update data pow_plant with the newest data */
    MC0005(6),
    
    WEBHOOK(99)
    ;

    public final int code;

    // Constructor
    ESystemUser(int code) {
        this.code = code;
    }

    // Class Methods
    public static ESystemUser atCode(short code) {
        return EnumSet.allOf(ESystemUser.class).stream()
                .filter(category -> category.code == code)
                .findFirst()
                .orElse(null);
    }
}
