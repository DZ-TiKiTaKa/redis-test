package com.tikitaka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

@Service
public class RedisService {
	
	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	
	
	public void getRedisStringValue(String key) {
		
		ValueOperations<String, String> svo = stringRedisTemplate.opsForValue();
		System.out.println(key);
		System.out.println(svo.get(key));
		System.out.println(svo.get(key));
		
		
	}
	
}
