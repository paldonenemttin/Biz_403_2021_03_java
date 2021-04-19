package com.callor.classes;

import java.util.Random;

public class Class_01 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int num;
		num = rnd.nextInt(51)+50;
		
		System.out.println("생성된 난수 : " + num);
		
		int i = 0;
		int nCount = 0;
		while(true){
			if(num % i == 0) {
			}else {
				break;
			}
		}
		
		System.out.println("생성된 약수 : " + nCount);
		
		
	}

}
