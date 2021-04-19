package com.callor.method.service;

import java.util.Scanner;

public class NumberServiceV4 {

	public Integer inputNum() {

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("0~100까지 정수 입력");
			System.out.println("그러기 싫음 QUIT 입력바람");
			System.out.println("정수 >> ");
			String strNum1 = scan.nextLine();
			Integer intNum = null;
			
			if (strNum1.equals("QUIT")) {
				return null;
			} else {
				try {
					// 문자를 정수로 바꾸기
					 intNum = Integer.valueOf(strNum1);
					
				} catch (NumberFormatException e) {
					System.out.println("잘못 입력, 다시 쓰십셔");
					continue;
				}
			}
			// 변환 후 정수 범위가 맞는지 확인
			if (intNum > 100 || intNum < 0) {
				System.out.println("범위초과");
				System.out.println("0 ~ 100까지만 입력");
				continue;
			}
			return intNum;
		}
	}
}
