package devmind.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;

@Data
public class Random {
    private Integer random;

    @JsonProperty("random double")
    private Double randomDouble;

    @JsonProperty("email from expression")
    private String email;

    @JsonProperty("array")
    ArrayList<String> names;

    @JsonProperty("array of objects")
    ArrayList<RandomObj> objects;

}
