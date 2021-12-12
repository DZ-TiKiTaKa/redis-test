package com.tikitaka.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.apache.commons.logging.Log;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.data.redis.listener.ChannelTopic;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tikitaka.model.RoomMessage;
import com.tikitaka.redis.RedisPublisher;
import com.tikitaka.redis.RedisSubscriber;

@RequestMapping("/pubsub")
@Controller
public class PubSubController {
//    private final RedisMessageListenerContainer redisMessageListener = new RedisMessageListenerContainer();
//    private final RedisPublisher redisPublisher = new RedisPublisher();
//    private final RedisSubscriber redisSubscriber = new RedisSubscriber();
//    // topic 이름으로 topic정보를 가져와 메시지를 발송할 수 있도록 Map에 저장
//    private Map<String, ChannelTopic> channels;

    public void test() {
    	System.out.println("pubsob!!");
    }
    
//    @PostConstruct
//    public void init() {
//        // topic 정보를 담을 Map을 초기화
//        channels = new HashMap<>();
//    }
//
//    // 유효한 Topic 리스트 반환
//    @GetMapping("/room")
//    public Set<String> findAllRoom() {
//        return channels.keySet();
//    }
//
//    // 신규 Topic을 생성하고 Listener등록 및 Topic Map에 저장
//    @PutMapping("/room/{roomId}")
//    public void createRoom(@PathVariable String roomId) {
//        ChannelTopic channel = new ChannelTopic(roomId);
//        redisMessageListener.addMessageListener((MessageListener) redisSubscriber, channel);
//        channels.put(roomId, channel);
//    }
//
//    // 특정 Topic에 메시지 발행
//    @PostMapping("/room/{roomId}")
//    public void pushMessage(@PathVariable String roomId, @RequestParam String name, @RequestParam String message) {
//        ChannelTopic channel = channels.get(roomId);
//        redisPublisher.publish(channel, RoomMessage.class.getName());
//    }
//
//    // Topic 삭제 후 Listener 해제, Topic Map에서 삭제
//    @DeleteMapping("/room/{roomId}")
//    public void deleteRoom(@PathVariable String roomId) {
//        ChannelTopic channel = channels.get(roomId);
//        redisMessageListener.removeMessageListener((MessageListener) redisSubscriber, channel);
//        channels.remove(roomId);
//    }
}