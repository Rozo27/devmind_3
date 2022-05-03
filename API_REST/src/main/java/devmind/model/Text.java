package devmind.model;

import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;

@Data
@JsonRootName(value = "text")
public class Text {
    private String data;
    private Integer size;
    private String style;
}
