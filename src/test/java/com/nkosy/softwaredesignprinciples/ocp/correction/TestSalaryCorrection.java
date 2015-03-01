package com.nkosy.softwaredesignprinciples.ocp.correction;

import com.nkosy.config.AppConfigCorrection;
import com.nkosy.config.AppConfigViolation;
import com.nkosy.softwaredesignprinciples.ocp.correction.service.Salary;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by nkosy on 2015/02/27.
 */
public class TestSalaryCorrection {
    Salary s1;
    Salary s2;
    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfigCorrection.class);
        s1 = (Salary)ctx.getBean("capsalary");

        ApplicationContext ctxS2 = new AnnotationConfigApplicationContext(AppConfigCorrection.class);
        s2 = (Salary)ctxS2.getBean("crewsalary");

        s1.pay();
        s2.pay();

    }

    @Test
    public void testSalCorrect() throws Exception {
        Assert.assertEquals("Pay Captain", s1.print());
        Assert.assertEquals("Pay Crew", s2.print());


    }

    @After
    public void tearDown() throws Exception {


    }
}
