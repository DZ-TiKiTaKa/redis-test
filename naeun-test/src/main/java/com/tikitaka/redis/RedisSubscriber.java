package com.tikitaka.redis;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tikitaka.model.RoomMessage;

import jdk.internal.org.jline.utils.Log;

@Service
public class RedisSubscriber implements MessageListener{
	
	private final ObjectMapper objectMapper = new ObjectMapper();
	private final RedisTemplate redisTemplate = new RedisTemplate();
	
	public void onMessage(Message message, byte[] pattern) {
		String body = (String)redisTemplate.getStringSerializer().deserialize(message.getBody());
		RoomMessage roomMessage;
		
		try {
			roomMessage = objectMapper.readValue(body, RoomMessage.class);
			Log.info("Room - message : ", roomMessage.toString());
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	@Override
	public void onMessage(Message message) {
		// TODO Auto-generated method stub
		
	}
	
	

}
