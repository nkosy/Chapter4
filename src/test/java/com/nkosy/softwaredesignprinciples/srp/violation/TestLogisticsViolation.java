package com.nkosy.softwaredesignprinciples.srp.violation;

import com.nkosy.config.AppConfigCorrection;
import com.nkosy.config.AppConfigViolation;
import com.nkosy.softwaredesignprinciples.srp.violation.service.impl.LogisticsImpl;
import com.nkosy.softwaredesignprinciples.srp.violation.service.Logistics;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by nkosy on 2015/02/27.
 */
public class TestLogisticsViolation {
    Logistics l1;
    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfigViolation.class);
        l1= (LogisticsImpl)ctx.getBean("logistics");

    }

    @Test
    public void testLogistics() throws Exception {
       Assert.assertEquals(1120.0, l1.CalcPayment(), 5);

    }

    @After
    public void tearDown() throws Exception {


    }
}
