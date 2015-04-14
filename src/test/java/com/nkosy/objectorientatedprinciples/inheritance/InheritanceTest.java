package com.nkosy.objectorientatedprinciples.inheritance;

import com.nkosy.config.AppConfigCorrection;
import com.nkosy.objectorientatedprinciples.inheritance.service.Burger;
import com.nkosy.objectorientatedprinciples.inheritance.service.impl.BigMac;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfigCorrection.class);
        myBurger = (Burger)ctx.getBean("kos");

        oder = new ArrayList();
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
