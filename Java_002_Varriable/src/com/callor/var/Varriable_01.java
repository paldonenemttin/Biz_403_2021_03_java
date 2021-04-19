package com.callor.var;

public class Varriable_01 {
	
	/*
	 * 정수형 변수 num1 num2를 선언
	 * 2. 각각 33과 55를 저장하라
	 * 각 변수에 담긴 값을 사칙연산을 수행하고]
	 * sum// minus times div 를 선언하라
	 */
	public static void main(String[] args) {
		// Integer
		//  정수값을 저장할 기억장치를 예약하고
		// 그곳에 num1, num2 이름(별명)을 붙여달라
		// 각각 변수에 정수 33 정수 55를 저장하라
		// => num1 num2 변수가 초기화 되었다하고 한다
		// => num1 num2변수가 생성되었다라고 한다
		int num1 = 33;
		int num2 = 55;
		
		int sum = 0;
		int minus = 0;
		int times = 0;
		int div = 0;
		
		sum = num1 + num2;
		minus = num1 - num2;
		times = num1 * num2;
		div = num1 / num2;
		
		System.out.printf("%d + %d = %d\n" , num1, num2, sum);
		System.out.printf("%d - %d = %d\n" , num2, num1, minus);
		System.out.printf("%d * %d = %d\n" , num1, num2, times);
		System.out.printf("%d / %d = %d\n" , num2, num1, div);
				
	}

}
