package com.example.liquibasedemo;


public class CustomerDto {
    private String name;
   

    private Integer age;

    public CustomerDto(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    public CustomerDto(){};
     public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
