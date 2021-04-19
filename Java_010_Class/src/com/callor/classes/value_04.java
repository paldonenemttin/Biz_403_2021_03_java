package com.callor.classes;

public class value_04 {
	/*
	 * main() method에서 같은 클래스내의 다른 method를 호출하여 코드를 실행하려면
	 * 반드시 호출되는 method도 static이어야 한다
	 */
	public static void main(String[] args) {
		System.out.println(3/0);
		Integer result = divid(30,40);
		result = divid(30, 0);
		if(result == null) {
			System.out.println("나눗셈을 수행 할 수 없음");
		} else {
			System.out.println(result);
		}
	}
	
	private static Integer divid(float num , float num1) {
		return 0;
	}
	
	private static Integer add(int num1, int num2) {
		if(num1 == 0 || num2 == 0) {
			return null;
		}else {
			return num1 / num2;
		}
	}
	
	/*
	 * 0과 0을 나눗셈연산을 수행하면 문제가 발생한다
	 * divid() ㅡ도생dp 2개의 
	 */

}
