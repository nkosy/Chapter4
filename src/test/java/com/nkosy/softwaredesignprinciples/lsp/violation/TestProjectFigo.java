/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nkosy.softwaredesignprinciples.lsp.violation;

import com.nkosy.config.AppConfigViolation;
import com.nkosy.softwaredesignprinciples.lsp.correction.services.impl.ProjectStrathavon;
import com.nkosy.softwaredesignprinciples.lsp.violation.service.impl.ProjectFigo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Nkosy
 */
public class TestProjectFigo {
    ProjectFigo obj;
    
    public TestProjectFigo() {
    }
    
    @Before
    public void setUp() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfigViolation.class);
        obj= (ProjectFigo)ctx.getBean("testPF");
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void hello() {
        boolean ans = true;
        boolean val;
        
        val = obj.MaintainElevator();
        assertEquals(ans, val);
    }
}
