package com.callor.var;

public class Varriable_12 {
	
	public static void main(String[] args) {
		
		int intSum = 0;
		int intNum = 0;
		
		intNum += 100;
		System.out.println(intNum);
		
		intNum += 33;
		System.out.println(intNum);
		
		intSum += intNum;
		intSum += intNum;
		intSum += intNum;
		
		intSum = 0;
		// 0+1+2+3+4+5를 계산하여
		//intSom에 저장하라
		intNum = intSum + 1 + 2 + 3 + 4 + 5;
		System.out.println(intSum);
		
		intSum = 0;
		
		intNum = intSum + 1;
		intNum = intSum + 2;
		intNum = intSum + 3;
		intNum = intSum + 4;
		intNum = intSum + 5;
		
		intSum = 0;
		intNum = 1;
		
		intSum = intSum + intNum;
		intSum = intSum + (++intNum);
		intSum = intSum + (++intNum);
		
		
	}

}
