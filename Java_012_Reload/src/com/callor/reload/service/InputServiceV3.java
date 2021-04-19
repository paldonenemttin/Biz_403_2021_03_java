package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputServiceV3 {

	Scanner scan;
	List<Integer> intList;

	public InputServiceV3() {
		scan = new Scanner(System.in);
		intList = new ArrayList<Integer>();
	}

	public void inputNum() {

		while (true) {
			System.out.println("정수 50~150까지 입력");
			System.out.println("정수 >>");
			String strNum = scan.nextLine();
			Integer intNum = 0;
			try {
				intNum = Integer.valueOf(strNum);
			} catch (Exception e) {
				System.out.println("문자 입력 ㄴㄴ 숫자만!");
				continue;
			}
			if(intNum > 50 && intNum < 150) {
				intList.add(intNum);
				break;
			} else {
				System.out.println("정수는 50 ~ 150 까지만 입력 바람");
			}
		}

	}

}
