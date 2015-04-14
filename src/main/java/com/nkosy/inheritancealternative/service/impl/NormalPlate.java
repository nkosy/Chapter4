package com.nkosy.inheritancealternative.service.impl;

import com.nkosy.inheritancealternative.service.Food;

/**
 * Created by nkosy on 2015/02/26.
 */
public class NormalPlate {
    private Food plate = new SpecialPlate();

    public void addSauce()
    {
        plate.addSauce("BigMac Sc");
    }

    public Food getPlate() {
        return plate;
    }
}
