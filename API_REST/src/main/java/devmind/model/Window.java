package devmind.model;

import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;

@Data
@JsonRootName(value = "window")
public class Window {
    private String title;
    private String name;
    private Double width;
    private Double height;
}
