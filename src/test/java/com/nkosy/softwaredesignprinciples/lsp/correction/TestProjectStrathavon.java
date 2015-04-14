/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nkosy.softwaredesignprinciples.lsp.correction;

import com.nkosy.config.AppConfigCorrection;
import com.nkosy.softwaredesignprinciples.lsp.correction.services.impl.ProjectStrathavon;
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
public class TestProjectStrathavon {
    private ProjectStrathavon obj;
    
    public TestProjectStrathavon() {
    }
    
    @Before
    public void setUp() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfigCorrection.class);
        obj= (ProjectStrathavon)ctx.getBean("PSTV");
    }
    
    @After
    public void tearDown() {
        
    }

    @Test
     public void testProjectStrathavon() {
         String expected = "Elevator Maintanance has been done!";
        Assert.assertEquals(expected, obj.PrintDetails());
     }
}
