package com.nkosy.objectorientatedprinciples.encapsulation;

import com.nkosy.objectorientatedprinciples.encapsulation.service.Impl.Employee;
import com.nkosy.objectorientatedprinciples.encapsulation.service.Person;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nkosy on 2015/02/26.
 */
public class EncapsulationTest {
    Person p1;
    @org.junit.Before
    public void setUp() throws Exception {
        p1 = new Employee();
        p1.setName("Nkosikhona");

    }

    @Test
    public void testName() throws Exception {
        Assert.assertEquals("Nkosikhona", p1.getName());
    }

    @After
    public void tearDown() throws Exception {


    }
}
