package com.callor.method;

import java.util.Scanner;

import com.callor.method.service.NumberServiceV2;

public class Method_04 {
	
	public static void main(String[] args) {
		
		/*
		 * 입력을 받느데 정수 0~100
		 * 또는 문자열 QUIT
		 * 다른 type의 데딩터를 동시에 취급하기 위해서는
		 * 기본 type을 String 형으로 설정한느 것이 편하다
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("0부터 100까지의 정수 하나를 입력하시오(입력중단 : QUIT)");
		System.out.println("정수 >> ");
		//모든 입력을  type으로 하라
		// 입력받은 문자열을  strNum();에 저장하라
		String str1 = scan.nextLine();
		if (str1.equals("QUIT")) {
			System.out.println("입력 종료");
		} else {
			//QUIT가 아닌 다른 값이 입력되면 
			//일단 입력된 값을 정수형으로 변환해보자
			// 변환된 정수값을 변수에 저장
			int intNum1 = Integer.valueOf(str1);
			Integer intNum2 = Integer.valueOf(str1);
			
			System.out.println("입력된 정수 : "+ intNum2);
	
		
		
	}

}
}