package com.callor.var;

public class Varriable_05 {
	
	public static void main(String[] args) {
		
		int intNum = 1;
		int intSum = 0;
		
		intSum += intNum; //1
				
		intNum ++;//2
		intSum += intNum;// 1 + 2 = 3
		
		intNum ++;//3
		intSum += intNum;// 1 + 3 = 4
		
		intNum ++;//4
		intSum += intNum;// 1 + 4 = 5
		
		intNum ++;//5
		intSum += intNum;// 1 + 5 = 6
		
		System.out.println(intSum);
	}

}
