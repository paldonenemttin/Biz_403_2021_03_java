package com.callor.method;

public class Number_01 {
	
	public static void main(String[] args) {
		
		//문자열형 숫자
		String strNum = "100";
		String strNum2 = "100.0";
		
		// 문자열 연결 연산
		System.out.println(strNum + strNum2);
		
		// strNum과 strNum2에 저장된 값으로
		// 사칙연산을 표현하고 싶다
		// 사칙연산이 가능한  type 으로 변환을 시켜야 한다
		
		/*
		 * Integer 클래스에 정의된 valueOf() static method를
		 * 호출하여 문자열형 숫자를 정수형 값으로 변환하고
		 * intNum 변수에 저장하라
		 * 
		 * static method는 클래스를객체로 생성하지 않고도 호출 가능
		 * 단, 함수 방식으로 호출 불가
		 *          클래스.method() 형식으로 호출해야함
		 */
		Integer intNum = Integer.valueOf(strNum);
		Float floatNum = Float.valueOf(strNum2);
		
		System.out.printf("%d + %f = %f\n", intNum,floatNum,intNum + floatNum);
		System.out.printf("%d + %f = %f\n", intNum,floatNum,intNum - floatNum);
		System.out.printf("%d + %f = %f\n", intNum,floatNum,intNum / floatNum);
		System.out.printf("%d + %f = %f", intNum,floatNum,intNum * floatNum);
		
	}

}
