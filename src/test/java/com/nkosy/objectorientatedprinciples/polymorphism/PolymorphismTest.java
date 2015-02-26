package com.nkosy.objectorientatedprinciples.polymorphism;

import com.nkosy.objectorientatedprinciples.polymorphism.service.Impl.SportsCar;
import com.nkosy.objectorientatedprinciples.polymorphism.service.Impl.Suv;
import com.nkosy.objectorientatedprinciples.polymorphism.service.Impl.Truck;
import com.nkosy.objectorientatedprinciples.polymorphism.service.Vehicle;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by nkosy on 2015/02/26.
 */
public class PolymorphismTest {
    Vehicle ferrari;
    Vehicle fortuner;
    Vehicle dav;
    @Before
    public void setUp() throws Exception {
        ferrari = new SportsCar();
        fortuner = new Suv();
        dav = new Truck();
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
