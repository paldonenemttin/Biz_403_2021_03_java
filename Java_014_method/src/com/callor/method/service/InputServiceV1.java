package com.callor.method.service;

import java.util.Scanner;

public class InputServiceV1 {
	
	Scanner scan;
	
	public InputServiceV1() {
		scan= new Scanner(System.in);
	}
	
	public Integer inputValue(String title, int start, int end) {
		
		while(true) {
			title = String.format("%s (%d ~ %d)", title, start, end);
			
			Integer retNum = this.inputScore(title);
			if(retNum == null) {
				return null;
			}else if(retNum < start || retNum > end) {
				System.out.println("입력값은 범위 %d ~ %d 안이어야 합니다");
				continue;
			}
			return retNum;
		}
		
	}
	
	public Integer inputScore(String title) {
		while(true) {
			System.out.printf(title + "점수를 입력하세요(입력종료");
			System.out.println(">>");
			String strNum1 = scan.nextLine();
			Integer intNum1 = 0;
			if(strNum1.equals("QUIT")) {
				return null;
			} else {
				try {
					intNum1 = Integer.valueOf(strNum1);
				} catch (NumberFormatException e) {
					System.out.println("점수나 QUIT를 입력 바람");
					continue;
				}
			}
			return intNum1;
		}
		
	}

}
