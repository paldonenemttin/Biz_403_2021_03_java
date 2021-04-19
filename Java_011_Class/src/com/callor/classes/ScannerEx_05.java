package com.callor.classes;

import java.util.Scanner;

public class ScannerEx_05 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print(">>");
		String str1 = scan.nextLine();
		System.out.println("입력한 문자열 :" + str1);
		if(str1.equals("end")) {
			System.out.println("안녕");
		}else {
			System.out.println("반가워");
		}
	}

}
