package com.callor.apps.Service;

import java.util.Scanner;

public class ScoreServiceV4 {
	
	String[] subject;
	int[] intKor;
	int[] intEng;
	int[] intMath;
	
	Scanner scan;
	public ScoreServiceV4(int members) {
		scan = new Scanner(System.in);
		subject = new String[] {"국어" ,"영어", "수학"};
		
		intKor = new int[members];
		intEng = new int[members];
		intMath = new int[members];
	}
	/*
	 * 점수를 입력 받을 과목명을 배열로 만들어 두고
	 * 과목명 문자열을  intputScore에 전달하여
	 * 3과목의 점수를 입력받는 코드를 작성
	 */
	public void makeScores() {
		
		for(int i = 0; i < intKor.length;i++) {
			intKor[i] = this.inputScore(subject[0]);
			intEng[i] = this.inputScore(subject[1]);
			intMath[i] = this.inputScore(subject[2]);
		}
		
	}
	
	private Integer inputScore(String sub) {
		
		Integer score = 0;
		while(true){
			System.out.println(sub +"점수를 입력하시오");
			System.out.print(">");
		    score = scan.nextInt();
		    if( score > 0 || score <100) {
		    	System.out.println(sub +"점수는 0~100까지 입니다");
		    	// continue 명령을 사용하는 대신 else 사용하여 코드를 wkr성
		    	//continue;
		    } else {
		    	break;
		    }
		}
		return score;
	}

}
