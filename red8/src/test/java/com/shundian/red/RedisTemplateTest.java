package com.shundian.red;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-cache-redis.xml")
public class RedisTemplateTest {

	@Autowired
	private RedisTemplate<String, Object> template;
	

	
	@Test
	public void insert(){

		
		  boolean result = template.execute(new RedisCallback<Boolean>() {  
              public Boolean doInRedis(RedisConnection connection)  
                      throws DataAccessException {  
                  RedisSerializer<String> serializer = template.getStringSerializer();  
                  for(int i = 0;i<3;i++){
                      byte[] key  = serializer.serialize("asdfsdf"+i);  
                      byte[] name = serializer.serialize("sdfasdfdf"+i);  
                      connection.setNX(key, name);  
                  }  
                  return true;  
              }  
          }, false, true);
	}
	

}
