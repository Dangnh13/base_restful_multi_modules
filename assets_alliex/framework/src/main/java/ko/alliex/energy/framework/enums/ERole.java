package ko.alliex.energy.framework.enums;

import lombok.Getter;

import java.util.EnumSet;

@Getter
public enum ERole {

    SYS_ADMIN("sys_admin"),
    ADMIN("admin"),
    EDITOR("editor"),
    READER("reader"),
    OM_EDITOR("om_editor"),
    ;

    public final String code;

    // Constructor
    ERole(String code) {
        this.code = code;
    }

    // Class Methods
    public static ERole atCode(short code) {
        return EnumSet.allOf(ERole.class).stream()
                .filter(category -> category.code.equals(code))
                .findFirst()
                .orElse(null);
    }
}
