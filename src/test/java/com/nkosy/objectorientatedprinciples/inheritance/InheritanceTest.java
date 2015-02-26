package com.nkosy.objectorientatedprinciples.inheritance;

import com.nkosy.objectorientatedprinciples.inheritance.service.Burger;
import com.nkosy.objectorientatedprinciples.inheritance.service.Impl.BigMac;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nkosy on 2015/02/26.
 */
public class InheritanceTest {
    Burger myBurger;
    List oder;
    @Before
    public void setUp() throws Exception {
        oder = new ArrayList();
        myBurger = new BigMac(oder);
        myBurger.addCheese();
        myBurger.addOnions();
        myBurger.addPattie();
        myBurger.addSauce("BigMac Sc");
    }

    @Test
    public void testName() throws Exception {
        Assert.assertEquals("[Cheese, Onions, Pattie, BigMac Sc]", myBurger.serve());
    }

    @After
    public void tearDown() throws Exception {


    }
}
