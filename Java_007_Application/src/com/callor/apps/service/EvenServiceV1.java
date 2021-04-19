package com.callor.apps.service;

import java.util.Random;

//클래스 선언문(시작하는 곳)
public class EvenServiceV1 {
	
	int[] intNums;
	
	/*생성자 method
	 * 클래스를 선언하면
	 * 자동으로 만들어지는  method
	 * 별도의 코드가 필요 없으면 만들지 않아도 된다 
	 */
	// new EventServiceV1() 코드에서 호출되는 method
	// 생성자  method에는 클래스영역의 변수들을
	// 초기화 생성하기 위한 코드들이 작성된다
	public EvenServiceV1() {
		
		intNums = new int[100]; // 생성은 생성자에서
		
	}
	
	/*
	 *  1시간에 90km를 갈 수 있는 속도로 달려라
	 *  >> 90km/h
	 *  
	 */
	public void makeNums() {
		
		Random rnd = new Random();
		
		// intNums 배열 갯수만큼 코드를 반복 실행하라
		for(int i = 0 ; i < intNums.length ; i++) {
			
			intNums[i] = rnd.nextInt(100)+1;
		}
		
	}
	

	
	/*
	 * 짝수(Even) 홀수(Odd)
	 */
	public void printEven() {
		
		int nCount = 0;
		System.out.println("============================");
		System.out.println("짝수들의 리스트");
		System.out.println("----------------------------");
		
		//intNums 배열 전체를 뒤져서
		//짝수가 있으면 찾아서 출력하라
		for(int i = 0; i < intNums.length ; i++) {
			
			if(intNums[i] % 2 ==0) {
				System.out.println(intNums[i]);
				nCount++;
			}
		}
	}
	
	public void sumEven() {
		int intSum = 0;
		for(int i = 0; i < intNums.length ; i++) {
			if(intNums[i] % 2 == 0) {
				intSum += intNums[i];
			}
		}
		
		System.out.println("--------------------------------------");
		System.out.println("총합 : " + intSum);
		System.out.println("--------------------------------------");
		
	}

}
