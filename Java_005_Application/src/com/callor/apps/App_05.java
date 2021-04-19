package com.callor.apps;

import java.util.Random;
/*
 * 5명 학생의 3과목 점수 성적표 만들기
 */
public class App_05 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		//과목을 학생수만큼 배열을 선언
		int[] intKor = new int[5];
		int[] intEng = new int[5];
		int[] intMath = new int[5];
		
		// 가상의 점수를 생성하기
		for(int i =0 ; i < 5 ; i++) {
			intKor[i] = rnd.nextInt(51)+50;
			intEng[i] = rnd.nextInt(51)+50;
            intMath[i] = rnd.nextInt(51)+50;
		}
		
		// 학생별 총점과 평균을 계산 후 저장해두기
		
		int[] intTotal = new int[5];
		float[] floatAvg = new float[5];
		
		for(int i =0; i < 5 ; i++) {
			intTotal[i] += intKor[i];
			intTotal[i] += intEng[i];
			intTotal[i] += intMath[i];
			floatAvg[i] = (float)intTotal[i] / 3;
		}
		int intKorTotal = 0;
		int intEngTotal = 0;
		int intMathTotal =0;
		
		int intAllTotal = 0;
		
		//리스트 출력		
		System.out.println("================================");
		System.out.println("학번 국어 영어 수학 총점 평균");
		System.out.println("--------------------------------");
		
		for(int i = 0; i <5 ; i ++) { 
			System.out.print((i+1) +"\t");
			System.out.print(intKor[i] + "\t");
			System.out.print(intEng[i] + "\t");
			System.out.print(intMath[i] + "\t");
			
			System.out.print(intTotal[i] + "\t");
			System.out.printf("%3.2f" , floatAvg[i] );
			System.out.println();
			
			intKorTotal += intKor[i];
			intEngTotal += intKor[i];
			intMathTotal += intKor[i];
			intAllTotal += intKor[i];
		}
		
		System.out.println("=======================================");
		System.out.printf("총점\t%d\t%d\t%d\t%d\n",
				intKorTotal, intEngTotal, intMathTotal, intAllTotal );
	}

}
