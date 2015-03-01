package com.nkosy.softwaredesignprinciples.ocp.violation;

import com.nkosy.config.AppConfigCorrection;
import com.nkosy.config.AppConfigViolation;
import com.nkosy.softwaredesignprinciples.ocp.violation.service.PaymentViolation;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by nkosy on 2015/02/27.
 */
public class TestPaymentViolation {
    PaymentViolation paymnt;
    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfigViolation.class);
        paymnt = (PaymentViolation)ctx.getBean("payment");

        paymnt.pay("crew");

    }

    @Test
    public void testPayment() throws Exception {
        Assert.assertEquals("Pay crew", paymnt.print());

    }

    @After
    public void tearDown() throws Exception {


    }
}
