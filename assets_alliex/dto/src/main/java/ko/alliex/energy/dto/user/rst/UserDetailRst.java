package ko.alliex.energy.dto.user.rst;

import ko.alliex.energy.domain.entity.generator.Users;
import lombok.Data;

import java.util.List;

@Data
public class UserDetailRst extends Users {
    private String roleName;
    private List<ModuleDetailRst> moduleDetails;
}
