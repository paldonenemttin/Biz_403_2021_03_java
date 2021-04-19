package com.callor.method;

import com.callor.method.service.NumberServiceV1;

public class NumberEx_01 {

	public static void main(String[] args) {

		NumberServiceV1 vsV1 = new NumberServiceV1();

		// 두개의 매개변수를 갖는 addNum(0 method에게
		// 정수 두개를 전달하고
		// 그 결과를 retNum 변수에 담아라(저장해달라)
		Integer retNum = vsV1.addNum(21, 20);
		if (retNum == null) {
			System.out.println("결과는 짝수 아님");
		} else {
			System.out.printf("결과 [%s] 는 짝수", retNum);
		}
		
		/*
		 * addNum(float num1, float num2) method는
		 * return type이 Float이기 때문에
		 * return 되는 결과 값을 저장하는 변수(retNum1)도
		 * 반드시 float, Float이어야 함
		 */
		//Integer retNum1 = vsV1.addNum(20.2f, 22.5f);
		Float retNum1 = vsV1.addNum(20.2f, 22.5f);
		// NullPonterExecption 발생
		//float retNum1 = vsV1.addNum(20.2f, 22.5f);
		
		/*
		 * 변수를 선언하는 방식에
		 * primitive 방식과 wrapper class 방식이 있다
		 * 
		 * 특히 숫자를 다루는 경우에
		 * 항상 숫자값만  저장된는 보장이 있을 경우에는
		 *   primitive 방식으로 선언해도 아무런 문제가 없다
		 *   
		 *   java나 DB(DataBase)와 연동되는 프로젝트를구현할땐
		 *   null(널)이라는 특별한 값을 항상 인삭해야 한다
		 *   어떤 결과가 null 값을 갖게 되는 경우
		 *   primitive 방식에서는 취급이 불가능하다
		 *   
		 *   이럴땐 변수를 선언할때  wrapper class 방식을 사용하는 것이
		 *   바람직하다
		 */
		
		 //객체지향 특징중 다형형
		 // method의 중복 선언이라고도 한다
		  
		 //같은 이름의 method가 한개의 클래스에 중복 선언되어도
		 // 전달하는 값의 type에 따라 java는 자동으로
		 //매개변수 형식과 일치하는 method를 찾아서 연결해준다
		 
		//public Float addNum(int num1 , float num2)가 호출될것이고
		vsV1.addNum(20, 32.0f);
		
		//public Float addNum(int num1, int num2)가 호출될 것
		vsV1.addNum(20,25);

	}
}
