package com.shundian.red.config;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

//@Configuration
public class FastJSONMessageConverter implements WebMvcConfigurer {

    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
        List<MediaType> supportedMediaTypes = new ArrayList<>();
        supportedMediaTypes.add(MediaType.TEXT_HTML);
        supportedMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
        supportedMediaTypes.add(MediaType.APPLICATION_FORM_URLENCODED);
        fastJsonHttpMessageConverter.setSupportedMediaTypes(supportedMediaTypes);
        converters.add(fastJsonHttpMessageConverter);
    }

//    @Override
//    public void addReturnValueHandlers(List<HandlerMethodReturnValueHandler> handlers) {
//
//        System.out.println(handlers);
//
//    }

    //    @Bean
//    public HandlerAdapter handlerAdapter(WebBindingInitializer webBindingInitializer) {
//
//        List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
//        //注入FastJSON
//        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
//        List<MediaType> supportedMediaTypes = new ArrayList<>();
//        supportedMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
//        supportedMediaTypes.add(MediaType.APPLICATION_FORM_URLENCODED);
//        supportedMediaTypes.add(MediaType.TEXT_HTML);
//        fastJsonHttpMessageConverter.setSupportedMediaTypes(supportedMediaTypes);
//        messageConverters.add(fastJsonHttpMessageConverter);
//        RequestMappingHandlerAdapter requestMappingHandlerAdapter = new RequestMappingHandlerAdapter();
//        //参数及返回值处理
//        requestMappingHandlerAdapter.setMessageConverters(messageConverters);
//        //参数校验
//        requestMappingHandlerAdapter.setWebBindingInitializer(webBindingInitializer);
//        return requestMappingHandlerAdapter;
//    }

}
