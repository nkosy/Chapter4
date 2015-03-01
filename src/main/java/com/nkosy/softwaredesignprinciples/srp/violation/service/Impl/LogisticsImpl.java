package com.nkosy.softwaredesignprinciples.srp.violation.service.Impl;

import com.nkosy.softwaredesignprinciples.srp.violation.service.Logistics;

/**
 * Created by nkosy on 2015/02/27.
 */
public class LogisticsImpl implements Logistics {
    int hrz = 0;
    float rate = (float) 20.00;
    @Override
    public int CalcWorkingHrz() {
        return 7*8;
    }

    @Override
    public float CalcPayment() {

        return CalcWorkingHrz() * rate;
    }
}
