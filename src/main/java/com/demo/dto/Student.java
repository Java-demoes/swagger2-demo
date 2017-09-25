package com.demo.dto;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by Preetham on 26/09/17.
 */

public class Student {
    @ApiModelProperty(notes = "The name of student")
    private String name;
    @ApiModelProperty(notes = "The age of student")
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
