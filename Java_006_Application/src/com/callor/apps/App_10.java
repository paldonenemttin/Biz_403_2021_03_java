package com.callor.apps;

import java.util.Arrays;
import java.util.Random;

public class App_10 {
	
	public static void main(String[] args) {
		
		int[] intNums = new int[10];
		Random rnd = new Random();
		
		for(int i = 0; i < intNums.length ; i++) {
			intNums[i] = rnd.nextInt(100)+1; 
	}
		//for() 등을 사용하지 않고
		// 배열 요소를 나열하는문자열 만들기
		// Debuging 코드
		// 코드가 진행되는 동안에
		// 변수, 배열등에 저장된 값을 확인하고 싶을때 사용하는 코드
		String strView = Arrays.toString(intNums);//ctrl + shift +O 를 누르면 위에 Arrays 생김
		System.out.println("======================================");
		/*
		 * for(i) : 0 ~(배열갯수 -1)
		 * for(j) : i 값에 따라 반복횟수가 변동
		 * 
		 * i   j
		 * --------------------------------------
		 * 0   1
		 * 1   2
		 * 2   3
		 * 3   4
		 * 4   5
		 * 5   6
		 * :
		 * 
		 * 
		 * 배열의 오름차순 정렬코드
		 * 
		 */
		for(int i =0; i < intNums.length; i++) {
			
			for(int j =0; j < intNums.length;j++) {
				if(intNums[i]> intNums[j]) {
					
					int temp = intNums[i];
					intNums[i] = intNums[j];
					intNums[j] = temp;
				}
				
			}
		}
		System.out.println(Arrays.toString(intNums));

}
}