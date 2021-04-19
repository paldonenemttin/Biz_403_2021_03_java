package com.collar.controller;

public class Controller_04 {
	
	public static void main(String[] srgs) {
		
		int intSum3 = 0;
		int intSum4 = 0;
		int intSum5 = 0;
		
		for(int i = 0 ; i < 100 ; i++) {
			int num = i + 1;
			if(num % 3 ==0) {
				intSum3 +=num;
			}
			if(num % 4 == 0) {
				intSum4 += num;
			}
			if(num % 5 == 0) {
				intSum5 += num;
			}
		}
		
	}

}
