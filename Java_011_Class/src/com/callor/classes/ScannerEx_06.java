package com.callor.classes;

import java.util.Scanner;

public class ScannerEx_06 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			
		while(true) {
			System.out.println("숫자 2개를 입력하시오");
			System.out.print("숫자1 >");
			System.out.println("숫자1(QUIT:중단하기)>>");
			String strNum1 = scan.nextLine();
			if(strNum1 == "1") {
				break;
			}
			
			Integer intNum1 =0;
			Integer intNum2 = 0;
			try {
				intNum1 = Integer.valueOf(strNum1);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("숫자로 입력 부탁");
				continue;
			}
			
			System.out.println("숫자2 >");
			String strNum2 = scan.nextLine();
			
			try {
				intNum2 = Integer.valueOf(strNum2);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("숫자로 입력 부탁");
				continue;
			}
			System.out.printf("%d x %d = %d", 
					intNum1, intNum2, intNum1 * intNum2);
		}
			
			
			
			
			
		}
	}


