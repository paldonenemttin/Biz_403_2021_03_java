package com.callor.method.service;

import java.util.Scanner;

public class NumberServiceV2 {

	Scanner scan;

	public NumberServiceV2() {
		scan = new Scanner(System.in);
	}
	
	/*
	 * 정수를 키보드에서 입력받아
	 * 정수를  return 하거나
	 * QUIT를 입력하면 null을 return: AND >> Integer
	 * void 대신 Integer
	 */

	public Integer inputNum() {

		System.out.println("정수 0 ~ 100까지 중에 입력");
		System.out.println("QUIT 입력하면 종료");
		System.out.print(">>");
		String strNum = scan.nextLine();
		if(strNum.equals("QUIT")) {
			return null;
		}else {
			Integer intNum = Integer.valueOf(strNum);
			return intNum;
		}
	}

}
