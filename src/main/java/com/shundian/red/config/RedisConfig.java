package com.shundian.red.config;

import com.shundian.red.TestBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class RedisConfig {

//    @Bean
    public TestBean testBean(){
        System.out.println("初始化 testBean");
        return new TestBean();
    }




}
