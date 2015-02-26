package com.nkosy.objectorientatedprinciples.polymorphism.service.Impl;

import com.nkosy.objectorientatedprinciples.polymorphism.service.Vehicle;

/**
 * Created by nkosy on 2015/02/26.
 */
public class Truck implements Vehicle{
    @Override
    public void StartEngine() {
        System.out.println("Engine Start");
    }

    @Override
    public String move() {
        return "six wheel drive";
    }
}
