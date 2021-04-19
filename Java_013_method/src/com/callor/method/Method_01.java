package com.callor.method;

import java.util.Random;
import java.util.Scanner;

public class Method_01 {
	/*
	 * Random(난수) 수를 1개 생성하여 3의 배수인지 확인
	 */
	public static void main(String[] args) {
		/*
		 * Random 클래스를 사용하여  rnd 객체를 선언하고
		 * Random() 생성자 method를 호출하여 객체를 생성(초기화)하기
		 * 
		 * 객체를 선언만 하고 생성(초기화)을 하지 않고 객체.method를 호출하면
		 * NullPointerException이 발생
		 * NullPointerException: 객체에 아직 실체가 없다
		 */
		Random rnd = null;
		rnd = new Random();
		Random rnd1 = new Random();
		/*
		 * Scanner 클래스를 사용하여  scan객체를 선언하고
		 * Scanner() 생성자 method를 호출하여  scan 객체를 생성함
		 * Scanner() 생성자는 객체를 생성할때  System.in(키보드 입력장치)를 연결할 수 있도록
		 * 매개변수에 정보를 전달해 주어야 한다
		 */
		Scanner scan = new Scanner(System.in);
		
		/*
		 * String 클래스를 사용하여 str1 객체를 생성한다
		 * String 클래스는 클래스이면서 변수적인 성질을 갖는 특별한 클래스
		 * 사용법이 클래스 방식이면서 일반적인 변수처럼 사용 가능
		 * wrapper 클래스들도 이러한 성질을 는다
		 */
		String str1 = new String();// 저장되는 값 : ""
		String str2 = new String("대한민국"); //저장값 : "대한민국"
		String str3 = "우리나라";
		
		/*
		 * int 형 변수와 Integer wrapper를 사용하여 만든 변수
		 * 사용하는 기본 방법은 동일
		 * Integer는 클래스격인 특성을 갖고 있다보니
		 * new Integer() 생성자를 사용하여 변수를 만들면
		 * 다소 엉뚱하게 작동되는 경우가 잇다
		 * 지금은 Integer() 생성자를 사용하여 변수를 만들지 못하도록 하고 잇다
		 * 
		 * 숫자형 변수는 생성자를 사용하여 변수를 만들지 말자!
		 */
		Integer int1 = 30; //new Integer();는 사용 금지
		
		Integer intNum = rnd.nextInt(100)+1;
		
		
		/*
		 * int1에 저장된 정수가 3의 배수인가?
		 */
		int1 = rnd.nextInt(100)+1;
		/*
		 * if조건문을 사용하여 어떤 조건을 검사했을때 조건에 완전히 일치하는 경우에는
		 * ~~하다 ~~다 라고 표현하고
		 * 조건에 일치하지 않는  else를 사용하여 표현할땨는
		 * 딱 맞아 떨어지는 어떤 조건을 찾기가 어렵기 때문에
		 * ~~가 아니다라고 표현하는 것이 좋다
		 */
		if(int1 % 3 == 0) {
			System.out.println(int1 + "은 3의 배수");
		}else {
			System.out.println(int1 + "은 3의 배수가 아님");
		}
		/*
		 * 어떤수가 짝수인가를 조건검사하고 짝수이면 짝수이다라고 표현하고  
		 * else이면 홀수이다라고 표현 가능하지만
		 * 코드를 작성할댜ㅐ 조건으로 명시한 이외의 경우는 가급적 
		 * ~~이 아니다라고 표현하자
		 */
		if(int1 % 2 == 0) {
			System.out.println(int1 + "은 짝수");
		}else {
			System.out.println(int1 + "은 홀수");
			System.out.println(int1 + "은 짝수 아님");
		}
		
		
		
		
	}

}
