package com.callor.classes;

import java.util.Arrays;
import java.util.Random;

public class Class_1A {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int num;
		num = rnd.nextInt(51)+50;
		
		// i 값이 0에서 시작하여 1식 증가하면서 100 미안인 경우 {} 명령들을 실행하라
		// ㅑ 값은 0~99(100 - 1)
		for(int i =0; i< 100;i++) {
		}
		
		System.out.println("생성된 난수 : " + num);
		// i값은 2~ (num -1) 연속으로 생성 num의 약수가 몇개인가를 구하기
		int nCount = 0;
		for(int i = 2 ; i < num ; i++) {
			if(num % i == 0) {
				nCount++;
			}
		}
		System.out.println("약수의 갯수 : " + nCount);
		
		int[] divisor = new int[nCount];
		
		int index = 0;
		for(int i = 2 ; i < num; i++) {
			if(num % i == 0) {
				divisor[index++] = i;
			}
		}
		
		System.out.println(Arrays.toString(divisor));
	}
	

}
