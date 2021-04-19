package com.callor.method;

import java.util.Random;

public class Mehtod_02 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		Integer num1 = rnd.nextInt();
		
		if(num1 % 3 == 0) {
			System.out.println(num1 + "3의 배수");
		}else {
			System.out.println(num1 + "3의 배수 아님");
		}
	}

}
