package com.waroy.control;


import com.waroy.base.BaseJunit4Test;
import com.waroy.controller.WelcomeHome;
import org.junit.After;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.WebApplicationContext;

import static junit.framework.TestCase.assertTrue;



/**
 * Created by waroy on 17-7-31.
 */
public class testWelcome extends BaseJunit4Test {

    private static final Logger logger = LoggerFactory.getLogger(testWelcome.class);

    @Autowired
    private WebApplicationContext context;

    @Test
    public void testWelcome(){
        WelcomeHome welcome = context.getBean(WelcomeHome.class);
        assertTrue(welcome!=null);
        assertTrue(welcome.index()=="index");
        logger.info("test end");
    }

    @Test
    public void testContext(){
        assertTrue(context!=null);
    }

    @After
    public void tearDown() {

    }
}
