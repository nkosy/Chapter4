package com.nkosy.objectorientatedprinciples.encapsulation.service;

/**
 * Created by nkosy on 2015/02/26.
 */
public interface Person {
    public void setName(String name);

    public String getName();

    public int getAge();

    public void setAge(int age);

    public String getOccupation();

    public void setOccupation(String occupation);
}
