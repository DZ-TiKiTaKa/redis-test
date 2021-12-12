package com.tikitaka.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.listener.ChannelTopic;
import org.springframework.stereotype.Service;

import com.tikitaka.model.RoomMessage;

@Service
public class RedisPublisher {
	
	@Autowired
	private RedisTemplate<String, Object> redisTemplate;
	
	public void publish(ChannelTopic topic, String string) {
		redisTemplate.convertAndSend(topic.getTopic(), string);
	}

}
