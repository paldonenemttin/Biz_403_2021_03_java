package com.callor.apps.Service;

import java.util.Scanner;

/*
 * 5명 학생의 국영수 점수를 저장할 배열 생성
 * 키보드를 이용하여 다섯 학생의 국영수 점수를 입력 받고 배열에 저장
 * 학생별 총점 평균을 계산하고 성적 리스트를 출력
 */
public class ScoreServiceV1 {
	
	Scanner scan = new Scanner(System.in);
	
	int[] intKor;
	int[] intEng;
	int[] intMath;
	
	int[] intTotal;
	float[] floatAvg;
	
	public ScoreServiceV1() {
		intKor = new int[5];
		intEng = new int[intKor.length];
		intMath = new int[intKor.length];
		
		intTotal = new int[intKor.length];// 학생별 총점
		floatAvg = new float[intKor.length];// 학생별 평균
		
	}
	
	public void scanScore() {
		
		int nCount = 0;//국어 순서
		System.out.println("다섯학생의 국어 점수를 입력하시오");
		for(int i = 0; i < intKor.length ; i++) {
			
			nCount ++;
			
			System.out.printf("학생%d >" , nCount);
			intKor[i] = scan.nextInt();
			
		}
		
		int sCount = 0;//영어 순서
		System.out.println("다섯 학생의 영어 점수를 입력하시오");
		for(int i = 0; i < intKor.length ; i++) {
			
			sCount ++;
			
			System.out.printf("학생%d >" , sCount);
			intEng[i] = scan.nextInt();
			
		}
		int fCount = 0;// 수학 순서
		System.out.println("다섯 학생의 수학 점수를 입력하시오");
		for(int i = 0; i < intKor.length ; i++) {
			
			fCount++;
			
			System.out.printf("학생%d >" , fCount);
			intMath[i] = scan.nextInt();
			
		}
	}
	
	public void totalScore() {
		
		for(int i = 0; i < intKor.length ; i++) {
			
			intTotal[i] = intKor[i];
			intTotal[i] += intEng[i];
			intTotal[i] += intMath[i];
			
			floatAvg[i] = (float)intTotal[i] / 3;
			
		}
		
	}
	
	public void printScore() {
		
		System.out.println(LinesService.dLines(60));
		System.out.print("     \t국어\t영어\t수학\t총점\t평균\n");
		System.out.println(LinesService.sLines(60));
		
		int dCount = 0;
		for(int i = 0; i < intKor.length ; i++) {
			dCount ++;
			System.out.printf("학생%d :" , dCount);
			System.out.printf("%d\t", intKor[i]);
			System.out.printf("%d\t", intEng[i]);
			System.out.printf("%d\t" , intMath[i]);
			
			System.out.printf("%d\t", intTotal[i]);
			System.out.printf("%3.2f\n" , floatAvg[i]);
		}
	}
	
}
