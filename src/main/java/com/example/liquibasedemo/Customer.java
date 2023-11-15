package com.example.liquibasedemo;

import java.util.Random;

import jakarta.annotation.Generated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

@jakarta.persistence.Entity

public class Customer {

    @Id
    private Integer id;

    private String name;
    private Integer age;

   
    public Customer(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public Customer(){};

     public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @PrePersist
    private void generateId(){
        if(id == null){
            id = new Random().nextInt(1000);
        }
    }
}