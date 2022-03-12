package devmind.springapp;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Setter
@Component
public class MathTeacher implements ITeacher{
    @Autowired
    private WisdomWordsService wisdomWordsService;

    private static final String MATH_TEACHER_PREFIX = "Math teacher says: ";

    @Override
    public String getHomework() {
        return "Solve 100 calculus problems";
    }

    @Override
    public String getWisdom() {
        if (wisdomWordsService == null) {
            throw new RuntimeException("some message");
        }
        return MATH_TEACHER_PREFIX + wisdomWordsService.getMessage();
    }

    public void setWisdomWordsService(WisdomWordsService wisdomWordsService) {
        this.wisdomWordsService = wisdomWordsService;
    }
}