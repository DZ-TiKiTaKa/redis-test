package com.tikitaka.model;

import java.io.Serializable;

public class RoomMessage implements Serializable{
	private static final long serialVersionUID = 1234542154L;
	private String roomId;
	private String name;
	private String message;
	public String getRoomId() {
		return roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	@Override
	public String toString() {
		return "RoomMessage [roomId=" + roomId + ", name=" + name + ", message=" + message + "]";
	}
	
}
