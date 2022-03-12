package devmind.springapp;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component("myTeacher")
public class JavaTeacher implements ITeacher{
    @Autowired
    private WisdomWordsService wisdomWordsService;

    @Autowired(required = false)
    private HomeWorkService homeWorkService;
    int age;

    @Override
    public String getHomework() {
        return this.homeWorkService.getHomework();
    }

    @Override
    public String getWisdom() {
        return wisdomWordsService.getMessage();
    }
}