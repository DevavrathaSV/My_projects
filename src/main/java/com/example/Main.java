package com.example;

import com.example.player.Player;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player initiator = new Player("initiator");
		Player instance2 = new Player("Instance2");

		for (int i = 0; i < 10; i++) {
			initiator.sendingMessage(instance2, "Hello from first_instance - count: ");
		}
		System.exit(0);
	}

}
