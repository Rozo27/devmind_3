package com.devmind.springapp.teachers;

import com.devmind.springapp.homework.IHomework;

public class JavaTeacher implements ITeacher {

    IHomework homework;
    public JavaTeacher(IHomework homework){
        this.homework  = homework;
    }
    @Override
    public String getHomework() {
        return "Create 100 classes for grade:"+this.homework.getGrade();
    }

}