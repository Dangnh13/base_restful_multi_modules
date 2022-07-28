package ko.alliex.energy.dto.common;

import lombok.Data;

import java.lang.reflect.InvocationTargetException;

@Data
public abstract class DXO {

    public abstract <T extends PRM> T toPrm() throws IllegalAccessException, InstantiationException, InvocationTargetException;

}
