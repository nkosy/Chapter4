package com.nkosy.objectorientatedprinciples.polymorphism;

import com.nkosy.config.AppConfigCorrection;
import com.nkosy.objectorientatedprinciples.polymorphism.service.Impl.SportsCar;
import com.nkosy.objectorientatedprinciples.polymorphism.service.Impl.Suv;
import com.nkosy.objectorientatedprinciples.polymorphism.service.Impl.Truck;
import com.nkosy.objectorientatedprinciples.polymorphism.service.Vehicle;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by nkosy on 2015/02/26.
 */
public class PolymorphismTest {
    Vehicle ferrari;
    Vehicle fortuner;
    Vehicle dav;
    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfigCorrection.class);
        ferrari = (Vehicle)ctx.getBean("sportscar");

        ApplicationContext ctxSuv = new AnnotationConfigApplicationContext(AppConfigCorrection.class);
        fortuner = (Vehicle)ctx.getBean("suv");

        ApplicationContext ctxTruck = new AnnotationConfigApplicationContext(AppConfigCorrection.class);
        dav = (Vehicle)ctx.getBean("truck");
    }

    @Test
    public void testName() throws Exception {
        Assert.assertEquals("Super Charge", ferrari.move());
        Assert.assertEquals("Four wheel drive", fortuner.move());
        Assert.assertEquals("six wheel drive", dav.move());

    }

    @After
    public void tearDown() throws Exception {


    }
}
