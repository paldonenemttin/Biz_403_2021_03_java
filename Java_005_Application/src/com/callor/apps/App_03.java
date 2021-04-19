package com.callor.apps;

/*
 * 정수배열 intScores  10개 선언
 * Random 클래스로 50~100 까지 정수를 들어 intScores에 저장
 * 
 * intScores의 점수와 총점, 평균
 */
import java.util.Random;

public class App_03 {
	
	public static void main(String[] srgs) {
		
		Random rnd = new Random();
		
		int intSum = 0;
		int[] intScores = new int[10];
		
		for(int i = 0; i <10 ; i++ ) { 
			intScores[i] = rnd.nextInt(51) + 50;
			
		}
		int intTotal = 0;
		float floatAvg = 0;
		for(int i = 0 ; i < 10 ; i++) {
			intTotal += intScores[i];
		}
		//평균은 전체 총점을 계산 한 후에 한번만 계산을 수행하면 된다
		//평균을 총점과 같이 for () 반복문에서 계산필요 없음
		floatAvg = (float) intTotal / 10;
		
		System.out.println("===================");
		System.out.printf("총점 : %d , 평균 %0.d" , intTotal , floatAvg);
		System.out.println("===================");
	}

}
