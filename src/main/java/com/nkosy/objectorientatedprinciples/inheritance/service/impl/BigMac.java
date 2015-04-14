package com.nkosy.objectorientatedprinciples.inheritance.service.impl;

import java.util.List;

/**
 * Created by nkosy on 2015/02/26.
 */
public class BigMac extends CheeseBurger {

    public BigMac(List myBurger)
    {
        super(myBurger);
    }

    public BigMac() {
        super();
    }

    public void addSauce()
    {
        super.addSauce("Big Mac sauce");
    }
}
