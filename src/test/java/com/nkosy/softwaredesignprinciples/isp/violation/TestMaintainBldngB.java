package com.nkosy.softwaredesignprinciples.isp.violation;

import com.nkosy.config.AppConfigViolation;
import com.nkosy.softwaredesignprinciples.isp.violation.service.impl.MaintainBldB;
import com.nkosy.softwaredesignprinciples.isp.violation.service.MaintainBlds;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by nkosy on 2015/03/01.
 */
public class TestMaintainBldngB {
    private MaintainBlds obj;

    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfigViolation.class);
        obj= (MaintainBldB)ctx.getBean("MBA");

    }

    @Test
    public void testName() throws Exception {
        boolean ans = false;
        boolean val;

        val = obj.MaintainElevator();
        Assert.assertEquals(ans, val);


    }

    @After
    public void tearDown() throws Exception {


    }
}
