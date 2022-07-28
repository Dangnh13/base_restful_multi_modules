package ko.alliex.energy.dto.common;

import java.lang.reflect.InvocationTargetException;

public abstract class REQUEST {

    public abstract <T extends DXO> T toDxo() throws IllegalAccessException, InstantiationException, InvocationTargetException;

}
