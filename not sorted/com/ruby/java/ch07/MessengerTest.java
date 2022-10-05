package com.ruby.java.ch07;

public class MessengerTest {

	public static void main(String[] args) {
		iPhoneMessenger iphone = new iPhoneMessenger();
//		GalaxyMessenger galaxy = new GalaxyMessenger;
		Messenger.getConnection();
//		Messenger.MAX_SIZE
		System.out.println(iphone.getMessage());
		
//		System.out.println("메신저 최소 문자 크기" + Messenger.MIN_SIZE);
//		System.out.println("메신저 최대 문자 크기" + Messenger.MAX_SIZE);
		
	}

}
