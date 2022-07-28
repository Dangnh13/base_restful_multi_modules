package ko.alliex.energy.dto.user.rst;

import ko.alliex.energy.domain.entity.generator.ApiMaster;
import ko.alliex.energy.domain.entity.generator.ModuleMaster;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class ModuleDetailRst extends ModuleMaster {
    private List<ApiMaster> apiMasters;
}
