package com.callor.apps.Service;

import java.util.Scanner;

public class ScoreServiceV1 {

	// 클래스 영역에 Scanner 클래스를 사용해 Scan 객체를 선언
	// null PointerException
	// JDK 또는 여러가지 클래스르가져와 사용하는 경우 매우 자주 맞자는 Exception
	//
	Scanner scan;
	// scan 객체를 생성(초기화)하기
	// 객체를 선언하고 생성하는 코드가 없으면 사용하는 과정에서 눌 포인터익셉션이 발생
	int[] intKor;
	int[] intEng;
	int[] intMath;
	int[] intSum;
	float floatAvg;

	public ScoreServiceV1() {
		scan = new Scanner(System.in);
		intKor = new int[5];
		intEng = new int[intKor.length];
		intMath = new int[intKor.length];
		intSum = new int[intKor.length];
		floatAvg = intSum[intKor.length] / 3;

	}

	public void makeScore() {

		int num1 = 0;

		System.out.println("다음 학생 5명의 국어점수를 입력하시오");
		for (int i = 0; i < intKor.length; i++) {
			num1++;
			if (intKor[i] <= 100) {
				System.out.printf("학생%d >", num1);
				intKor[i] = scan.nextInt();
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}

		int num2 = 0;
		System.out.println("다음 학생 5명의 영어 점수를 입력하시오");
		for (int i = 0; i < intKor.length; i++) {
			num2++;
			if (intEng[i] <= 100) {
				System.out.printf("학생%d >", num2);
				intEng[i] = scan.nextInt();
			} else {
				System.out.println("잘못 입력하셨습니다");
			}

		}
		int num3 = 0;
		System.out.println("다음 학생 5명의 수학 점수를 입력하시오");
		for (int i = 0; i < intKor.length; i++) {
			num3++;
			if (intMath[i] <= 100) {
				System.out.printf("학생%d >", num3);
				intMath[i] = scan.nextInt();
			} else {
				System.out.println("잘못 입력하셨습니다");
			}
		}
	}

	public void makeSum() {
		for (int i = 0; i < intKor.length; i++) {

			intSum[i] = intKor[i];
			intSum[i] += intEng[i];
			intSum[i] += intMath[i];

			floatAvg = (float) intSum[i] / 3;

		}
	}

	public void printScore() {
		System.out.println("=".repeat(50));
		System.out.print("    국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(50));

		for (int i = 0; i < intKor.length; i++) {
			System.out.printf("%d\t%d\t%d\t%d\t%3.2fd\n", 
					intKor[i], intEng[i], intMath[i], intSum[intKor.length], floatAvg);
		}
	}

}
