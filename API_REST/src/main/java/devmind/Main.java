package devmind;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import devmind.model.Random;
import devmind.model.Widget;
import lombok.SneakyThrows;
import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.util.List;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        //ex1
        ObjectMapper mapper  = new ObjectMapper();
        mapper.enable(DeserializationFeature.UNWRAP_ROOT_VALUE);
        Widget widget = mapper.readValue(new ClassPathResource("firstJson.json").getFile(), Widget.class);
        System.out.println(widget);

        //ex2
        mapper.disable(DeserializationFeature.UNWRAP_ROOT_VALUE);
        List<Random> randoms = mapper.readValue(new ClassPathResource("secondJson.json").getFile(), new TypeReference<>(){});
        randoms.stream().forEach(random-> System.out.println(random));

    }
}
