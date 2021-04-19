package com.collar.controller;

import java.util.Random;

public class Controller_08 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		// 어떤 명령을 n번 반복하여 수행하겠다
		for(int i = 0 ; i < 5 ; i++) {
			// 정수형 난수(임의정수를 만들어서
			// num에 저장하라
			int num = rnd.nextInt();
			//
			System.out.println(num);
		}
		
		System.out.println("====================");
		for(int i = 0 ; i < 5 ; i++) {
			// 0~99까지의 정수를 만들어라
			// 0 ~ (100 - 1)
			// 0 ~ (< 100)
			int num = rnd.nextInt(100);
			System.out.println(num);
		}
		for(int i = 0 ; i < 5 ; i++) {
			// 0~ (10 - 1) 중에서 임의의 수를 생성
			int num = rnd.nextInt(10);
			System.out.println(num);
		}
	}
	

}
