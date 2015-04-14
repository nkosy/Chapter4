/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nkosy.softwaredesignprinciples.plk.violation;

import com.nkosy.config.AppConfigViolation;
import com.nkosy.softwaredesignprinciples.plk.violation.service.impl.Report;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Nkosy
 */
public class TestReportPlk {
    Report obj;
    public TestReportPlk() {
    }
    
    @Before
    public void setUp() {
         ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfigViolation.class);
        obj= (Report)ctx.getBean("DIY");
    }
    
    @After
    public void tearDown() {
    }

   @Test
   public void testPlk() {
       String expected = "Printing...";
       
        Assert.assertEquals(expected, obj.PrintReport());
   }
}
