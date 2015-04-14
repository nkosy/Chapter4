package com.nkosy.objectorientatedprinciples.inheritance.service.impl;

import com.nkosy.objectorientatedprinciples.inheritance.service.Burger;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nkosy on 2015/02/26.
 */
public class CheeseBurger implements Burger {
    private List myBurger = new ArrayList();

    public CheeseBurger(List myBurger) {
        this.myBurger = myBurger;
    }

    public CheeseBurger() {

    }

    @Override
    public void addCheese() {
        myBurger.add("Cheese");
    }

    @Override
    public void addPattie() {
        myBurger.add("Pattie");
    }

    @Override
    public void addOnions() {
        myBurger.add("Onions");
    }

    @Override
    public void addSauce(String sauce) {
        myBurger.add(sauce);
    }


    @Override
    public String serve() {
        return myBurger.toString();
    }
}
