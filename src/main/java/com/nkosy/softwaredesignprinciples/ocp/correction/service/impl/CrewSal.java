package com.nkosy.softwaredesignprinciples.ocp.correction.service.impl;

import com.nkosy.softwaredesignprinciples.ocp.correction.service.Salary;

/**
 * Created by nkosy on 2015/02/27.
 */
public class CrewSal implements Salary {
    private String sal = " ";
    @Override
    public void pay() {
        sal = "Pay Crew";
    }

    @Override
    public String print() {
        return sal;
    }
}
