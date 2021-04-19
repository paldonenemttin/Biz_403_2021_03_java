package com.callor.classes;

import java.util.Scanner;

public class ScannerEx_03 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		/*
		 * 
		 */
		System.out.println("두개의 숫자를 입력");
		System.out.println("숫자 1>>");
		String strNum1 = scan.nextLine();
		Integer intNum1 = Integer.valueOf(strNum1);
		
		System.out.print("숫자 2>>");
		String strNum2 = scan.nextLine();
		Integer intNum2 = Integer.valueOf(strNum2);
		
		System.out.printf("%d + %d = %d\n", intNum1, intNum2 , intNum1 + intNum2);
		System.out.printf("%d - %d = %d\n", intNum1, intNum2 , intNum1 - intNum2);
		System.out.printf("%d * %d = %d\n", intNum1, intNum2 , intNum1 * intNum2);
		System.out.printf("%d / %d = %d", intNum1, intNum2 , intNum1 / intNum2);
		
	}

}
