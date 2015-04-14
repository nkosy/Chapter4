
package com.nkosy.softwaredesignprinciples.srp.correction;

import com.nkosy.config.AppConfigCorrection;
import com.nkosy.softwaredesignprinciples.srp.correction.service.WorkingHrzInterface;
import com.nkosy.softwaredesignprinciples.srp.correction.service.impl.WorkingHrzImplementation;
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
public class TestHrzSrp {
    WorkingHrzInterface obj;
    
    public TestHrzSrp() {
    }
    
    @Before
    public void setUp() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfigCorrection.class);
        obj = (WorkingHrzImplementation)ctx.getBean("testWRKHR");
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testHrz() {
        Assert.assertEquals("Working hours", obj.CalcWorkingHrz());
    }
}
