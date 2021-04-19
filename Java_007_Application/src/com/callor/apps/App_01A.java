package com.callor.apps;

import java.util.Random;

public class App_01A {
	
	public static void main(String[] args) {
		
		int[] intNum = new int[20];
		
		Random rnd = new Random();
		
		for(int i = 0 ; i < intNum.length ; i++) {
			intNum[i] = rnd.nextInt(51)+50;
		}
		 
		
		for(int arr = 0; arr < intNum.length ; arr++) {
			
			int num =0;
			int numP = intNum[arr];
			for(num = 2 ; num < intNum.length ; num++) {
				if(numP % num == 0) {
					break;
				}
			}
			if(num < numP ) {
				System.out.println(numP + "는 소수가 아님");
			} else {
				System.out.println(numP + "는 소수");
			}
		}
		
	}

}
