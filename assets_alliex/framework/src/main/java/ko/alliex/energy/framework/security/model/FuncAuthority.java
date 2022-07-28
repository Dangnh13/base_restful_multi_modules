package ko.alliex.energy.framework.security.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class FuncAuthority {

    private static final String FUNC_ITEM = "items";

    @JsonIgnore
    private Integer moduleId;

    private String moduleIdentifier;

    @JsonIgnore
    private String moduleName;

    @JsonProperty(FUNC_ITEM)
    private List<FuncItem> funcItems;
}
