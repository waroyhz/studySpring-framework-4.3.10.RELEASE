package com.waroy.control;


import com.waroy.base.BaseJunit4Test;
import com.waroy.controller.WelcomeHome;
import org.junit.After;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.WebApplicationContext;

import static junit.framework.TestCase.assertTrue;



/**
 * Created by waroy on 17-7-31.
 */
public class testWelcome extends BaseJunit4Test {

    @Autowired
    private WebApplicationContext context;

    @Test
    public void testWelcome(){
        WelcomeHome welcome = context.getBean(WelcomeHome.class);
        assertTrue(welcome!=null);
        assertTrue(welcome.index()=="index");
    }

    @Test
    public void testContext(){
        assertTrue(context!=null);
    }

    @After
    public void tearDown() {

    }
}
