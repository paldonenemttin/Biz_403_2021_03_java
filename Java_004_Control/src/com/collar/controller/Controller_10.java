package com.collar.controller;

import java.util.Random;

/*
 *  0~ 100까지 중의 임의의 정수 5개를 만들어서 
 *  그 수가 짝수인지 아닌지를 출력
 */
public class Controller_10 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		/*
		 * 반복문을 사용하여 난수 100을 만들고
		 * 그 수가 짝수인지 아닌지 판별하는 코드
		 */
		System.out.println("==========");
		
		for(int i = 0 ; i < 100 ; i++) {
			int num = rnd.nextInt();
			if(num % 2 == 0) {
				System.out.println(num + "는 짝수");
			} else {
				System.out.println(num + "는 짝수 아님");
			}
		}

	
	}
	
	

}
