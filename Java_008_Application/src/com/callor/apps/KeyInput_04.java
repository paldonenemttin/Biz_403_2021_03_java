package com.callor.apps;

import java.util.Scanner;
/*
 * 정수형 배열 5개를 생성
 * 키보드를 통해서 정수 5개를 입력 받아 배열에 저장
 * 배열에 입력된 정수들의 리스트와 합을 계산하여 출력
 * 입력 Prompt와 출력 문의 UI를 만들어서 출력
 */
public class KeyInput_04 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		int[] num = new int[5];
		
		System.out.println("정수 값을 키보드로 입력하고 Enter를 쳐주세요");
		for(int i = 0 ; i < num.length; i++) {
			int nums = i + 1;
			System.out.printf("정수%d >>" , nums);
			num[i] = scan.nextInt();
		}
		
		
		
		
				
	}

}
