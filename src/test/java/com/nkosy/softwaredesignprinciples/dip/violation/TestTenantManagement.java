package com.nkosy.softwaredesignprinciples.dip.violation;

import com.nkosy.config.AppConfigViolation;
import com.nkosy.softwaredesignprinciples.dip.violation.service.TenantManagement;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nkosy on 2015/03/01.
 */
public class TestTenantManagement {
    private static TenantManagement obj;
    private List tenantList = new ArrayList();

    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfigViolation.class);
        obj= (TenantManagement)ctx.getBean("testTM");

        obj.AddTenant("VanSchaik", tenantList);
        obj.AddTenant("NCC", tenantList);
        obj.AddTenant("e-TV", tenantList);

    }

    @Test
    public void testTM() throws Exception {
        String expected = "[VanSchaik, NCC, e-TV]";
        Assert.assertEquals(expected, obj.DisplayTenants(tenantList));

        obj.RemoveTenant("NCC", tenantList);
        expected = "[VanSchaik, e-TV]";
        Assert.assertEquals(expected, obj.DisplayTenants(tenantList));
    }

    @After
    public void tearDown() throws Exception {


    }
}
