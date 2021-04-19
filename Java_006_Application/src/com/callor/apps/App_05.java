package com.callor.apps;

import java.util.Iterator;
import java.util.Random;

public class App_05 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int[] intNums = new int[50];
		
		for(int i =0; i < intNums.length ; i++) {
			intNums[i] = rnd.nextInt(100)+1;
		}
		
		for(int i = 0 ; i < intNums.length ; i ++) {
			//
			System.out.println(intNums[i] + "\t");
			//5번째 
			if( (i + 1) % 5 == 0) {
				System.out.println();
			}
		}
	}

}
