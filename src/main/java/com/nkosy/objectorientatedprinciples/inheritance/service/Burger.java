package com.nkosy.objectorientatedprinciples.inheritance.service;

/**
 * Created by nkosy on 2015/02/26.
 */
public interface Burger {
    public void addCheese();
    public void addPattie();
    public void addOnions();
    public void addSauce(String sauce);
    public String serve();
}
