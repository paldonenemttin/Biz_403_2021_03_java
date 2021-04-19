package com.callor.apps;

import java.util.Scanner;

public class KeyInput_05 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하시오");
		System.out.println("정수 >>");
		int num = scan.nextInt();
		
		System.out.println("=================================");
		if(num % 2 == 0) {
			System.out.printf("%d는 짝수\n" , num);
		} else {
			System.out.printf("%d는 짝수 아님\n" , num);
		}
		
		//소수 판별을 하는 2 ~(자신 -1) 수로 나누었을때 나머지가 0인 경우가 한번도 없어야 한다
		int num1 = 0;
		for(num = 2; num < num1 ; num++) {
			if(num % num1 == 0) {
				break;
			}
			
			if(num1 < num) {
				System.out.println(num + "은 소수 아님");
			} else {
				System.out.println(num + "은 소수");
			}
			
		}
		
	}

}
