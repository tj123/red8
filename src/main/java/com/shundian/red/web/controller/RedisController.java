package com.shundian.red.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shundian.red.common.Result;
import com.shundian.red.web.pojo.UserDto;
import com.shundian.red.web.service.RedisService;



@Controller
@RequestMapping("/redis")
public class RedisController {

    Logger logger = LoggerFactory.getLogger(RedisController.class);

	@Autowired
	private RedisService service;

	@RequestMapping("/test")
	public String test(){
		return "test";
	}

	@RequestMapping("/list")
	@ResponseBody
	public Result<?> list(){
	    logger.debug("这是一个嵯峨山上石搜索");
		Result<Object> res = new Result<>();
		return res.setData(service.listUser());
	}

    @RequestMapping("/l2")
    @ResponseBody
	public Result<?> l2(){
	    logger.error("hhaha", new Exception("sdgsdg"));
	    return new Result<>();
    }

	@RequestMapping("/addi")
	public String addInit(){
		return "add";
	}

	@RequestMapping("/add")
	@ResponseBody
	public Result<?> add(UserDto user){
		Result<Object> res = new Result<>();
		service.add(user);
		return res.setData(user);
	}
}
