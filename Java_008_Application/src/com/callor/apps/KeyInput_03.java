package com.callor.apps;

import java.util.Scanner;
/*
 * 키보드를 통해 2개의 정수를 입력받아 변수에 각각 저장하고 
 * 변수에 저장된 정수의 4칙연산을 수행하여 출력
 * 키보드로 입력 받기 전에 Prompt를 출력
 */
public class KeyInput_03 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("========================");
		System.out.print("정수1 >>");
		int num = scan.nextInt();
		
		System.out.println("정수2 >>");
		int num1 = scan.nextInt();
		
		int sum = num + num1;
		int minus = num - num1;
		int nanum = num / num1;
		int gob = num * num1;
		
		System.out.println("=========================");
		System.out.printf("%d + %d = %d\n" , num,num1,sum );
		System.out.printf("%d - %d = %d\n" , num, num1, minus);
		System.out.printf("%d * %d = %d\n" , num, num1 , gob );
		System.out.printf("%d / %d = %d\n", num, num1 , nanum);
		System.out.println("=======================");
	}

}
