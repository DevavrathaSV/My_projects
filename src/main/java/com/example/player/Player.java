package com.example.player;

public class Player {

	private final String name;
	private int messageCount;

	public Player(String name) {
		this.name = name;
		this.messageCount = 0;
	}

	public synchronized void sendingMessage(Player receivedMsg, String message) {
		messageCount++;
		System.out.println(name + " Sent message: " + message + messageCount);
		receivedMsg.receivedMessage(this, message + messageCount);

	}

	public synchronized void receivedMessage(Player sender, String message) {
		System.out.println(name + " Received message: " + message);
	}

	public String getName() {
		return name;
	}

}
