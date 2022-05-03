package devmind.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;

@Data
@JsonRootName(value = "widget")
public class Widget {
    private Boolean debug;
    private Window window;
    private Image image;
    private Text text;
}
