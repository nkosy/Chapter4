package com.nkosy.objectorientatedprinciples.encapsulation.service.impl;

import com.nkosy.objectorientatedprinciples.encapsulation.service.Person;

/**
 * Created by nkosy on 2015/02/26.
 */
public class Employee implements Person {
    private String name;
    private int age;
    private String occupation;

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

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void trythis()
    {

    }
}
