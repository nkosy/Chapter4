package com.nkosy.inheritancealternative.service.impl;

import com.nkosy.inheritancealternative.service.Food;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nkosy on 2015/02/26.
 */
public class SpecialPlate implements Food {
   private List myBurger = new ArrayList();

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

    @Override
    public List getMyBurger() {
        return myBurger;
    }
}
