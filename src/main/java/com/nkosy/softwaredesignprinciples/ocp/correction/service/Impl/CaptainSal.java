package com.nkosy.softwaredesignprinciples.ocp.correction.service.Impl;

import com.nkosy.softwaredesignprinciples.ocp.correction.service.Salary;

/**
 * Created by nkosy on 2015/02/27.
 */
public class CaptainSal implements Salary {
    private String sal = " ";
    @Override
    public void pay() {
        sal = "Pay Captain";
    }

    @Override
    public String print() {
        return sal;
    }
}
