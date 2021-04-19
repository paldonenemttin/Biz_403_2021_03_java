package com.collar.controller;

public class Controller_02 {
	
	public static void main(String[] args) {
		
		/*
		 * boolean(Boolean)
		 *      true,false 2가지 경우의 값을 갖는 특별한 형태
		 * 태입연산자(=) 오른쪽의 연산을 수행하여
		 *      3 ==3( == ; 동등연산자,일치연산자)
		 * 결과를 bYes 변수에 담아라
		 * 
		 * 동등연산자 : 두 값이 같냐?
		 *  결과는 true 또는 false가 나온다
		 */
		boolean bYes = 3 == 3;//true
		bYes = 15 % 3 == 0;//true
		
		int intNum = 15;
		// intNum에 담긴 값이 3의 배수이냐?
		System.out.println(intNum % 3 ==0);
		// intNum에 담긴 값이 5의 배수이냐?
		System.out.println(intNum % 5 ==0);
		
		// intNum에 담긴 값이 3의 배수이면서
		//                 5의 배수인가
		;
		
		// %3 == 0 AND %5 == 0; ?
		
		//&& : AND 관계 연산자
		bYes = intNum %3 == 0 && intNum % 5 == 0;
		
		intNum = 12;
		
		//intNum에 담긴 값이 3의 배수이거나
		//      5의 배수인가?
		// || : or 연산자
		bYes = intNum % 3 == 0 || intNum % 5 == 0;
		
		/*
		 * 관계연산자
		 * 2가지 이상의 비교연사(==,<,>,<=,>=,!=)을
		 * 동시에 수행하기 위한 연산
		 * 
		 */
		// &&는 true : 1, false 0으로 하는 곱셈
		//     연산을 기억하면 된다
		bYes = true && true;//true
		bYes = true && false;//false
		bYes = false && false;//false
		bYes = false && true;//false
		
		// ||(filter기호) 는 true :1, false 0으로 덧셈을 연산
		bYes = true || true;//1 + 1 = 1(있다):true
		bYes = true || false;// 1+ 0 = 1 : true
		bYes = false || true;// 0 + 1 = true
		bYes = false || false;// 0 + 0 = false
		
	}

}
