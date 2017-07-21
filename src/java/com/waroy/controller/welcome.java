package com.waroy.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by waroy on 17-7-21.
 */
@Controller
@RequestMapping("/home")
public class welcome {
    //添加一个日志器
    private static final Logger logger = LoggerFactory.getLogger(welcome.class);
    //映射一个action
    @RequestMapping("/")
    public  String index(){
        //输出日志文件
        logger.info("the first jsp pages");
        //返回一个index.jsp这个视图
        return "index";
    }
}
