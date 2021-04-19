package com.callor.classes.service;

public class MethodService {
	
	// 변수는 같은 { } 구역 내에서는 같은 이름으로 중복 선언 불가
	
	// method는 같은클래스의 {  }구역 내에서는 원칙적으로 같은 이름으로 중복 선언 불가
	// 예외 상황에서는 가능
	//              method의 매개 변수의 있고 없고
	//              매개 변수의 갯수 차이
	//              메개변수의 type의 차이
	public void method(int num) {
		System.out.println("여긴 1번 method");
	}
	public void method(int num, int num1) {
	}
	
	/*
	 * method코드를 작성 할때 매개 변수를 선언하면 
	 * 이 method를 호출 할때 반드시 매개 변수에 해당하는 값을 전달 해야 한다
	 * 선언된 매개변수의 갯수, type이 일치 하도록 값을 전달 해야만 한다
	 * 그렇지 않으면 method를 호출한 곳에 오류가 발생
	 * 
	 * 객체.method(30,30.0f)
	 */
	public void method(float num, int num1) {
	}
	
	public void method(int num, float num1) {	
	}
	
	public void method() {
		
	}

}
