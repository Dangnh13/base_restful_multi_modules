package ko.alliex.energy.framework.dto;

import lombok.Data;

import java.io.File;
import java.io.Serializable;

@Data
public class FileInfo implements Serializable {
    private String originalFilename;
    private File file;
}
