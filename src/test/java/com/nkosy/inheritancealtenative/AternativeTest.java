package com.nkosy.inheritancealtenative;

import com.nkosy.config.AppConfigCorrection;
import com.nkosy.inheritancealternative.service.Food;
import com.nkosy.inheritancealternative.service.impl.NormalPlate;
import com.nkosy.objectorientatedprinciples.inheritance.service.impl.BigMac;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by nkosy on 2015/02/26.
 */
public class AternativeTest {
    NormalPlate f1;
    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfigCorrection.class);
        f1 = (NormalPlate)ctx.getBean("alternative");

        f1.getPlate().addPattie();
        f1.getPlate().addOnions();
        f1.getPlate().addCheese();
        f1.getPlate().addSauce("BigMac Sc");
    }

    @Test
    public void testName() throws Exception {
        Assert.assertEquals("[Pattie, Onions, Cheese, BigMac Sc]", f1.getPlate().serve());
    }

    @After
    public void tearDown() throws Exception {


    }
}
