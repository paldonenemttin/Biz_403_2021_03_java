package com.callor.fine;

public class MainEx_07 {

	/*
	 * ====================================== 5단 구구단
	 * -------------------------------------- 
	 * 5 x 1 = 5 
	 * 5 x 2 = 10 
	 * . 
	 * . 
	 * .
	 * 
	 * ======================================
	 */

	public static void main(String[] args) {

		for (int i = 0; i < 9; i++) {
			int dan = 1;
			dan += i;
			System.out.printf("5 x %d = %d\n", dan, dan * 5);

		}
	}

}
