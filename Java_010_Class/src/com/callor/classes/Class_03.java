package com.callor.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Class_03 {
	
	public static void main(String[] args) {
		
		/*
		 * Generic 사용 : <Integer>
		 * List 형 객체에저장할 데이터의 type을 제한 하므로서
		 * 코드의 실행과 메모리 사용의 효율성을 높이기 위함이다
		 */
		List<Integer> divisor = new ArrayList<Integer>();
		Random rnd = new Random();
		int intNum = rnd.nextInt(51)+50;
		
		for(int i = 2 ; i < intNum ; i++) {
			if(intNum % i == 0) {
				divisor.add(i);
			}
		}
		
		System.out.println("생성된 난수 : " + intNum);
		System.out.println("약수들의 리스트  : " );
		
		for(int i = 0; i < divisor.size();i++) {
			System.out.println(divisor.get(i));
		}
	}

}
