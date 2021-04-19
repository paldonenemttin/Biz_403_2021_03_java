package com.callor.var;

public class Varriable_02 {
	
	public static void main(String[] args) {
		
		/*
		 * 변수 명명법
		 * 첫글자는 반드시 영문소문자
		 * 이어서 영문대소문자. 숫자under bar(_) 사용가능
		 *  2개 이상의 단어를 조합하여 사용권장
		 *  단어를 조합할 경우
		 *  2번째 단어부터는 첫글자를 대문자
		 *  또는 단어와 단어 사이를 under bar로 구분
		 *  
		 *  intNum1 - Camel case
		 *  int_Num_1 = snake case
		 *  int_Num1
		 *  
		 *  변수의 접수사로 변수의 타입을 설정하는 것을 권장
		 *  
		 * intNum : 헝가리언 표기법
		 * floatNum
		 * strName
		 */
		
		
		
		
		// 정수형 변수 선언과 ,clear
		// 정수형변수 intNum1, intNum2 생성
		int intNum1 = 0;//기본형
		Integer intNum2 = 0; //확장형
		
		
		// 실수형 변수 floatNum1, floatNum2 생성
		// 기억장치를 소모하는 용량이 double 보다 작다
		// 대신 정밀도는 낮다
		float flaotNum1 = 0.0f;
		float flaotNum2 = 0.0f;
		
		//정수형 변수
		//int, Integer 형보다 기장치 소모 용량이크다
		//int 형은 최대 2의 32승만큼 공간차지
		//long 형은 최대 2의 64승만큼 공간
		long longNum1 = 0;
		long longNum2 = 0;
		
		// 실수형 변수 선언과 clear
		// 실수형 변수 douNum1, douNum2 생성
		double douNum1 = 0.0;
		double douNum2 = 0.0;
		
		// 문자"열"형 변수 strName1 을 생성
		//문자"열"형 변수 strName2 을 생성
		String strName1 = " "; // " "
		String strName2 = null; 
		
		intNum1 = 30;
		intNum2 = 40;
		
		flaotNum1 = 30.0f;
		flaotNum2 = 40.2f;
		flaotNum1 = 30f;
		
		longNum1 = 30l;
		longNum2 = 40L;
		
		douNum1 = 45.0;
		douNum2 = 55.0;
		
		strName1 = "홍길동";
		strName2 = "이몽룡";
		
	}

}
