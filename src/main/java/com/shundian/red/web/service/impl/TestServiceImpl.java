package com.shundian.red.web.service.impl;

import com.shundian.red.web.dao.RedisDao;
import com.shundian.red.web.dao.TestDao;
import com.shundian.red.web.pojo.TestDto;
import com.shundian.red.web.pojo.UserDto;
import com.shundian.red.web.service.TestService;
import org.aspectj.weaver.ast.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TestServiceImpl implements TestService {


    @Autowired
    private RedisDao dao;

    @Autowired
    private TestDao testDao;

    @Override
    @Transactional
    public void testInsert() {
        UserDto user = new UserDto();
        user.setGuid("123213");
        user.setPassword("sdfsd");
        user.setSex("sdgsdg");
        dao.add(user);

        TestDto testDto = new TestDto();
        testDto.setId("ssfs");
        testDto.setName("sdgsdg");
        testDao.add(testDto);
    }
}
