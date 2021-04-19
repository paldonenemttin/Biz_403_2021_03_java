package com.callor.apps;

import com.callor.apps.medel.ScoreVO;

public class ScoreEx_01 {
	
	public static void main(String[] args) {
		
		int 홍길동_kor = 80;
		int 홍길동_math = 80;
		int 홍길동_eng = 80;
		
		int 홍길동_total = 홍길동_kor + 홍길동_eng + 홍길동_math;
		
		int 이몽룡_kor = 90;
		int 이몽룡_eng = 90;
		int 이몽룡_math = 90;
		
		/*
		 * ScoreVO 클래스에 디자인된 코드를 보면 변수들이 있고
		 * getTotal(); getAvg() method가 있다
		 * ScoreVO 클래스를 사용하여 맍들어진 객체는
		 * 일부러다른 데이터를 저장하지 않는 한
		 * 같은 사람의 데이터 일 것이고
		 * 과목점수만 잘 저장되있음
		 * 언제든 총점과 평균을 method를 통해
		 * 얻어 낼 수 있다
		 */
		ScoreVO 홍길동 = new ScoreVO();
		
		홍길동.num = 1;
		홍길동.name = "홍길동";
		홍길동.kor = 90;
		홍길동.eng = 80;
		홍길동.math = 100;
		
		System.out.println("홍길동 종첨 : " + 홍길동.getTotal());
		System.out.println("홍길동 평균 : " + 홍길동.getAvg());
		ScoreVO 이몽룡 = new ScoreVO();
		
		이몽룡.num = 2;
		이몽룡.name = "이몽룡";
		이몽룡.kor = 50;
		이몽룡.eng = 80;
		이몽룡.math = 90;
		
		System.out.println("이몽룡 총점 : " + 홍길동.getTotal());
		System.out.println("이몽룡 평균 : " + 홍길동.getAvg());
		
		
	}

}
