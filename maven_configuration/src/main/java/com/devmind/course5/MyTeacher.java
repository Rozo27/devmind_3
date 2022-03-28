package com.devmind.course5;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Antet(autor = "Cristi", data = "02.03.2022", revieweri = {"Marius", "Marcel"})
@MySecondAnnotatin()
@Component(value = "teacher")
@Getter
@AllArgsConstructor
@Setter
public class MyTeacher {

    public void saySomething() {
        System.out.println("Do your homework");
    }


//    private String name;
//    private School school;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public School getSchool() {
//        return school;
//    }
//
//    public void setSchool(School school) {
//        this.school = school;
//    }
//
//    public void updateSchool(String newName) {
//        this.school.updateName(newName);
//    }
}
