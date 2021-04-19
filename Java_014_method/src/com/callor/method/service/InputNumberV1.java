package com.callor.method.service;

import java.util.Scanner;

public class InputNumberV1 {

	// Scanner class는 키보드 자원을 연동하여
	// 키보드로부터 값을 입력 받기 위한 클래스이다
	// 이 클래스는 컴퓨터의 자원을 사용하는 관리가
	// 매우 엄격하게 필요한 클래스이다
	// 사용방법에 따라 오류가 발생하거나
	// 심지어 컴퓨터 시스템이 멈추는 현상이 발생 가능
	// 이러한 클래스는 사용할때 상당한 주의가 필요

	// Scanner클래스를 main() method가 아닌 Service 등의 클래스에서
	// 사용할땐 클래스 영역에 선언ㅇ르 하고
	// 클래스의 생성자에서 생성(초기화)하는 것이 좋다
	protected Scanner scan;

	public InputNumberV1() {
		scan = new Scanner(System.in);
	}

	// 문자열, 정수, 정수 매개변수를 갖는 method 선언
	
	// 문자열과 범위(start ~ end) 값을 전달받아
	// prompt문자열을 생성하고
	// inputValue(String title) method 를 호출하여
	// 값을 입력 받도록하고
	// return된 값에 따라
	//       null이 return되면 그냥 return해버리고
	//       정수 값이 return되면 start, end 값 범위에
	//          있는 값인지 유효성 검사를 하고
	//       범위를 벗어나면 다시 입력하도록 반복한다
	public Integer inputValue(String title, int start, int end) {

		while (true) {
			// title 변수값을
			// "새우깡"(0~100) 문자열로 다시 생성
			title = String.format("%s (%d ~%d)", title, start, end);
			
			Integer retNum = this.inputValue(title);
			if (retNum == null) {
				return null;
			} else if (retNum < start || retNum > end) {
				System.out.printf("입력값은 %d ~ %d" + 
			                 "범위 이어야 합니다\n", start, end);
				continue;
			}
			return retNum;
		}
	}

	/*
	 * String title 매개변수를 받고
	 * 정수 값이나 QUIT가 입력되는지 확인을 하고
	 * 잘못 입력된 값이 있으면 다시 입력받도록 하는 method
	 */
	public Integer inputValue(String title) {

		while (true) {
			System.out.printf("[%s]값을 입력하세요(입력중지:QUIT)", title);
			System.out.printf("[%s]값 >>", title);
			String strNum1 = scan.nextLine();
			Integer intNum1 = 0;

			if (strNum1.equals("QUIT")) {
				return null;
			} else {
				try {
					intNum1 = Integer.valueOf(strNum1);
				} catch (NumberFormatException e) {
					System.out.println("정수나 QUIT를 입력 바람");
					continue;
				}
			}
			return intNum1;

		}

	}

}
