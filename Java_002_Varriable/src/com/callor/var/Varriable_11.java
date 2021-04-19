package com.callor.var;

public class Varriable_11 {
	
	public static void main(String[] args) {
		
		int intNum = 100000; // 100001 ~
		
		//intNum에 담긴값을 1 증가시키고 출력하라.
		
		System.out.println(++intNum);
		
		int intSum = 0;
		intNum = 1;
		System.out.println("===================================");
		intSum += intNum;
		System.out.printf("intNum : %d, intSum : %d\n", intNum, intSum);
		intSum += intNum;
		System.out.printf("intNum : %d, intSum : %d\n", intNum, intSum);
		intSum += intNum;
		System.out.printf("intNum : %d, intSum : %d\n", intNum, intSum);
		
		System.out.printf("intNum : %d, intSum : %d", ++ intNum, intSum += intNum);
		
		
	}

}
