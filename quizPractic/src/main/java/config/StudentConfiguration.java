package config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import quiz.Student;

@Configuration
public class StudentConfiguration {

    @Bean
    public Student student(){
        return new Student("StudentS", "StudentSName", 9.5);
    }

    @Bean
    @Scope("prototype")
    public Student studentPrototype(){
        return new Student("StudentP", "StudentPName", 7.5);
    }
}
