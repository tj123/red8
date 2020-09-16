package com.shundian.red.web.dao.impl;

import com.shundian.red.web.dao.TestDao;
import com.shundian.red.web.pojo.TestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TestDaoImpl implements TestDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void add(TestDto testDto) {
        jdbcTemplate.update("insert into test value(?,?)", testDto.getId(), testDto.getName());
    }
}
