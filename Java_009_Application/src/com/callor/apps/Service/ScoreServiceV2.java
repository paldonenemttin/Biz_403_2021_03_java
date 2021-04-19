package com.callor.apps.Service;

import java.util.Scanner;

public class ScoreServiceV2 {
	
	Scanner scan;
	public ScoreServiceV2() {
		scan = new Scanner(System.in);
	}
	/*
	 * 
	 */
	public void makeScores() {
		
		/*
		 * method return type void가 아닌 경웽는
		 * method가  return한 값을 변수에 저장(받기) 할 수 있다
		 * 이때 변수는 method 의  return type과 같은 type (형)이어야 한다
		 */
		System.out.println("국어점수 입력");
		Integer intKor = this.inputScore();
		
		System.out.println("영어점수 입력");
		Integer intEng = this.inputScore();
		
		System.out.println("수학점수 입력");
		Integer intMath = this.inputScore();
		
		System.out.println("========================");
		System.out.printf("국어 점수 : %d\n" , intKor);
		System.out.printf("수학 점수 : %d\n" , intKor);
		System.out.printf("영어 점수 : %d\n" , intKor);
		System.out.println("========================");
	}
	
	private Integer inputScore() {
		
		int score = 0;
		while(true) {
			System.out.println("점수를 입력하세요(0~100)");
			score = scan.nextInt();
		if(score < 0 || score > 100) {
			System.out.println("점수는 0부터 100까지만 입력 가능합니다");
			continue;
		}
		break;
	}
		//score
		return score;
	}
}
