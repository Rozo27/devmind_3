package devmind.model;

import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;

@Data
@JsonRootName(value = "image")
public class Image {
    private String src;
    private String name;
    private String alignment;
}
