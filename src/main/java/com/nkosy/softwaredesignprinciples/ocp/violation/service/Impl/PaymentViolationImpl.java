package com.nkosy.softwaredesignprinciples.ocp.violation.service.Impl;

import com.nkosy.softwaredesignprinciples.ocp.violation.service.PaymentViolation;

/**
 * Created by nkosy on 2015/02/27.
 */
public class PaymentViolationImpl implements PaymentViolation{

    private String sal = "";
    @Override
    public void pay(String occupation) {

        if(occupation == "Captain")
            sal = "Pay Captain";
        else
            sal = "Pay crew";
    }

    @Override
    public String print() {
        return sal;
    }
}
