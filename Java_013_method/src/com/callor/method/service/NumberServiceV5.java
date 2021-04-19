package com.callor.method.service;

import java.util.Scanner;

public class NumberServiceV5 {

	public Integer inputNum(String title) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println(title + "값을 입력하시오");
			System.out.println("QUIT : 입력종료");
			System.out.print(">>");
			String strNum = scan.nextLine();
			Integer intNum = 0;
			if (strNum.equals("QUIT")) {
				return null;
			} else {
				try {
					intNum = Integer.valueOf(strNum);

				} catch (NumberFormatException e) {
					System.out.println(title + " 정수 또는 QUIT이어야 함");
					continue;
				}

			}
			if (intNum > 100 || intNum < 0) {
				System.out.println("범위 초과 다시 입력 바람");
				continue;
			}
			return intNum;
		}
	}

}
