package ko.alliex.energy.jwt.dto.dxo;

import ko.alliex.energy.dto.common.DXO;
import ko.alliex.energy.dto.common.PRM;
import lombok.Builder;
import lombok.Data;

import java.lang.reflect.InvocationTargetException;

@Data
@Builder
public class LoginDxo extends DXO {
    private String email;
    private String password;

    @Override
    public <T extends PRM> T toPrm() throws IllegalAccessException, InstantiationException, InvocationTargetException {
        return null;
    }
}
