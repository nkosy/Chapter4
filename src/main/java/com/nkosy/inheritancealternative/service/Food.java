package com.nkosy.inheritancealternative.service;

import java.util.List;

/**
 * Created by nkosy on 2015/02/26.
 */
public interface Food {
    public void addCheese();
    public void addPattie();
    public void addOnions();
    public void addSauce(String sauce);
    public String serve();
    public List getMyBurger();
}
