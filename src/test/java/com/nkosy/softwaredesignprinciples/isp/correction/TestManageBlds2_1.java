package com.nkosy.softwaredesignprinciples.isp.correction;

import com.nkosy.config.AppConfigCorrection;
import com.nkosy.softwaredesignprinciples.isp.correction.service.MaintainBlds2;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by nkosy on 2015/03/01.
 */
public class TestManageBlds2_1 {
    private MaintainBlds2 obj;

    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfigCorrection.class);
        obj= (MaintainBlds2)ctx.getBean("CEO");

    }

    @Test
    public void testManageBldngs() throws Exception {

        boolean ans = true;
        boolean val;

        val = obj.MaintainElevator();
        Assert.assertEquals(ans, val);
    }

    @After
    public void tearDown() throws Exception {


    }
}
