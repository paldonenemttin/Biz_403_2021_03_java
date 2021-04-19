package com.callor.classes;

import java.util.Scanner;

public class ScannerEx_04 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("2개의 숫자를 입력");
		System.out.println("단 QUIT를 입력하면 중단");
		
		System.out.println("숫자 1>>");
		String strNum = scan.nextLine();
		if(strNum.equals("QUIT")) {
			return;
		}
		
		try {
			Integer intNum = Integer.valueOf(strNum);
			System.out.println("입력한 숫자의 제곱 : " + intNum * intNum);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("입력한 값이 숫자가 아니어서 실행불가");
		}
		
		
	}

}
