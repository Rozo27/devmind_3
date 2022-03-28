package quiz;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

@Getter
@NoArgsConstructor
public class Student {
    @Value("")
    private String firstName;
    @Value("")
    private String lastName;
    @Value("")
    private Double grade;

    @Autowired
    public Student(String firstName, String lastName, Double grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    @Autowired
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Autowired
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Autowired
    public void setGrade(Double grade) {
        this.grade = grade;
    }
}
