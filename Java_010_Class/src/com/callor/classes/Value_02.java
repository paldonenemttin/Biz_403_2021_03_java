package com.callor.classes;

import java.util.Scanner;

/*
 * null 값
 * 프로그래밍. 정보처리에서는어떤 항목의 데이터가
 * 있는가 없는가를 판단해야 하는 경우가 있다
 * 
 * 문자열의 경우는 값이 없는 경우를 "" 으로 표현할 수 있다
 * 숫자형일 경우 일반적으로 0이라는 값을 없는 값으로 표현 하기도 함
 * 
 * if(변수 == 0) : 없다라는 표현 사용 가능
 * 실제로 어떤 값이 0인 값을 갖는지, 아니면 아무것도 없어서 0인지 구별 못함
 * null 값을 사용하여 실제로 아무것도 없는 상태를 표현한다
 * 
 * java primitive type의 변수들은 null을 저장 못함
 * wrapper class를 사용하여 선언된 변수는 null을 저장할 수 있음
 */
public class Value_02 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print(">");
		
		//키보드에서 숫자를입력하고  enter를 누르면
		//값이 num 변수에 저장되고 다음 코드가 실행
		//Integer num = scan.nextInt();
		//System.out.println(num);
		
		//키보드에서 문자열ㅇ르 입력하고 Enter를 누르면
		//값이 str 변수에 저장되고 다음 코드가 실행
		//그냥 Enter눌러도 입력ㅇ르 종료하고
		// 다음 코드가 실행된다
		System.out.println("숫자1> ");
		String str = scan.nextLine();
		
		//"" 문자열 변수 : null 값과 유사한 성격을 갖는
		if(str == "") {
			System.out.println("아무것도 없는 값 입력");
		}
		
		System.out.println("숫자2> ");
		String str2 = scan.nextLine();
		
		
		Integer num1 = Integer.valueOf(str);
		Integer num2 = Integer.valueOf(str2);
		System.out.println(num1 + num2);
		if(num1 == 0) {
			System.out.println("num1 변수에 0이 담겨 있다");
		}
		if(num1 == null) {
			System.out.println("nem1 변수에 값이 없다");
		}
		
		
		
		
	}

}
