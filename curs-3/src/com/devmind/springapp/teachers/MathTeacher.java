package com.devmind.springapp.teachers;

public class MathTeacher implements ITeacher{

    @Override
    public String getHomework() {
        return "Solve 100 calculus problems";
    }

}