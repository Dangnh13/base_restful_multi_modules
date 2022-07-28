package ko.alliex.energy.framework.util;

import ko.alliex.energy.framework.enums.EOrder;
import ko.alliex.energy.framework.validation.annotation.ValueOfEnum;
import lombok.Data;

@Data
public class Ordering {
    private String field;

    @ValueOfEnum(enumClass = EOrder.class)
    private String order;
}
