package com.shundian.red.web.controller;

import com.shundian.red.web.service.TestService;
import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {

    private final Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    TestService testService;

    @ResponseBody
    @GetMapping("/")
    public String test(){
        logger.debug("哈哈哈");
        testService.testInsert();
        logger.debug("heheh");
        return "呵呵";
    }

}
