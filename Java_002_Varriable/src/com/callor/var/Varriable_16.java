package com.callor.var;

public class Varriable_16 {
	
	/*
	 * 클래스이름은 앞 대문자
	 * 변수 이름은 앞 소문자
	 */
	
	public static void main(String[] args) {
		
		/*
		 * intDan, intNum 변수를 선언하고
		 * 3단 구구단을 출력
		 */
		
		// 3단을 표시하기 위한 변수
		int intDan = 3;
		// 2 ~ 9까지의 숫자를 만들고
		// 실제 구구단을 계산하고 출력하기 위한 변수
		int intNum = 1;
		
		for(; ++intNum < 10 ;) {
			System.out.printf("%d x %d = %d\n" , intDan, intNum, intDan*intNum);
		}
				
	}

}
