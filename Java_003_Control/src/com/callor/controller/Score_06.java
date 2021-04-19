package com.callor.controller;

public class Score_06 {
	
	public static void main(String[] args) {
		
        int intNum = 0;
        
        intNum = 7;
		
		//for(int i = 2; i < 7 ; i ++)
        // 7/2 7/3 7/4 7/5 7/6
		for(int i = 2 ; i < intNum ; i++) {
			System.out.printf("%d = %d\n" , i , intNum % i);
	}
		
		// 2~ (intNum에 담긴 정수 -1까지 반복
		// intNum에 담긴 값을 2 ~(intNum -1) 까지 값으로
		// 나누었을때 나머지가 0인 경우가 있?
		for(int index =2 ; index < intNum ; index++) {
			//System.out.println(intNum % index == 0)
			System.out.println(intNum % index == 0 ? "소수가 아님" : "");
			                    
		}

  }
}