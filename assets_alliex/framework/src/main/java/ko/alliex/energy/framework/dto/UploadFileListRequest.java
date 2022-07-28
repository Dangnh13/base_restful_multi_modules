package ko.alliex.energy.framework.dto;

import lombok.Builder;
import lombok.Data;
import org.apache.commons.collections.CollectionUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class UploadFileListRequest {
    private List<FileInfo> fileInfoList;
    private String bucketName;
    private File directory;

    public List<File> getFiles() {
        List<File> files = new ArrayList<>();
        if (CollectionUtils.isNotEmpty(fileInfoList)) {
            fileInfoList.forEach(f -> {
                files.add(f.getFile());
            });
        }
        return files;
    }
}
