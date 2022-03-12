package devmind.springapp;

import org.springframework.stereotype.Component;

@Component
public class HomeWorkService {

    public String getHomework() {
        return "Do your homework";
    }
}
