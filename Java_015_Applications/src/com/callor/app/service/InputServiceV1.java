package com.callor.app.service;

import java.util.Scanner;

public class InputServiceV1 {

	Scanner scan;

	public InputServiceV1() {
		scan = new Scanner(System.in);
	}

	public Integer inputValue(String title) {

		while (true) {
			System.out.println(title + "값을 입력(입력종료:QUIT)");
			System.out.print(">>");
			String strNum = scan.nextLine();
			if (strNum.equals("QUIT")) {
				return null;
			}
			Integer intNum = null;
			try {
				intNum = Integer.valueOf(strNum);
			} catch (NumberFormatException e) {
				System.out.println("정수나 QUIT만 입력 바람");
				continue;
			}
			return intNum;
		}

	}

	public Integer inputValue(String title, int start, int end) {
		String msgTitle = String.format("%s(%d~%d) 범위", title, start, end);

		while (true) {
			Integer intNum = this.inputValue(msgTitle);

			if (intNum != null) {
				// intNum이 null값이 아닌 정수인 경우 범위 확인
				if (intNum > end || intNum < start) {
					System.out.printf("입력 범위는 %d ~ %d까지입니다", start, end);
					continue;
				}
			}
			// intNum이 null인 경우 null값을 return
			return null;
		}

	}

	public Integer inputValue(String title, int start) {

		String msgTitle = String.format("%s(~%d이상의)", title, start);
		while (true) {
			Integer intNum = this.inputValue(msgTitle);
			if (intNum != null) {
				if (intNum < 0) {
					System.out.printf("%d이상부터 입력가능",start);
					continue;
				}
				return intNum;
			}
		}
	}

}
