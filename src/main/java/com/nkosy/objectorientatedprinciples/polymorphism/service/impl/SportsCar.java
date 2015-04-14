package com.nkosy.objectorientatedprinciples.polymorphism.service.impl;

import com.nkosy.objectorientatedprinciples.polymorphism.service.Vehicle;

/**
 * Created by nkosy on 2015/02/26.
 */
public class SportsCar implements Vehicle{

    @Override
    public void StartEngine() {
        System.out.println("Engine started");
    }

    @Override
    public String move() {
        return "Super Charge";
    }
}
