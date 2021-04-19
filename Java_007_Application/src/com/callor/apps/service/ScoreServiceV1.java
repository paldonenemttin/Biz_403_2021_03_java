package com.callor.apps.service;

import java.util.Random;
/*
 * 10명 학생의 국어, 영어, 수학 점수를 배열에 저장하고
 * 학생들의 총점 평균을 계산하여 성적리스트를 출력
 * V1에 method를 구현하고 App_08 클래스의 main() method에 호출해 구현하라
 */
public class ScoreServiceV1 {

	
	int[] intKor;
	int[] intEng;
	int[] intMath;
	
	int[] intTotal;
	float[] floatAvg;
	
	public ScoreServiceV1() {
		
		intKor = new int[10];
		intEng = new int[intKor.length];
		intMath = new int[intKor.length];
		
		int[] intTotal = new int[intKor.length];
		float[] floatAvg = new float[intKor.length];
	}
	
	
	public void makeScore() {
		
		Random rnd = new Random();
		
		for(int i = 0 ; i < intKor.length ; i++) {
			intKor[i] = rnd.nextInt(100)+1;
			intEng[i] = rnd.nextInt(100)+1;
			intMath[i] = rnd.nextInt(100)+1;
		}
		
	}
    
	public void sumScore() {
		
		for(int i = 0; i < intKor.length ; i++) {
			intTotal[i] = intKor[i];
			intTotal[i] += intEng[i];
			intTotal[i] += intMath[i];
			floatAvg[i] = (float)intTotal[i] / 3;
		}
		
	}

	
	public void printScore() {
		
		System.out.print("국어\t영어\t수학\t총점\t평균");
		System.out.println("----------------------------------");
		
		for(int i=0; i<intKor.length;i++) {
			System.out.printf("%3d\t" , intKor[i]);
			System.out.printf("%3d\t", intEng[i]);
			System.out.printf("%3d\t" , intMath[i]);
			
			System.out.printf("%3d\t", intTotal[i]);
			System.out.printf("%3.2f\n" , floatAvg[i]);
		}
		
	}

}
