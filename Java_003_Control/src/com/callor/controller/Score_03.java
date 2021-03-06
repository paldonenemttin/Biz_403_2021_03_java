package com.callor.controller;

public class Score_03 {

	public static void main(String[] args) {

		int intKor = 87;
		int intEng = 66;

		int intSum = intKor + intEng;
		System.out.println("총점 : " + intSum);

		// 오차가 발생한 평균 계산
		int intAvg = intSum / 2;
		System.out.println("평균 : " + intAvg);

		/*
		 * 과목의 평균을 계산할때 소수점 이하 오류가 발생 소수점 이하 계산을 살리기 위해 평균을 저장할 변수를 float으로 선언
		 * 
		 * 다만 여전히 계산된 결과 소수점이하 값이 0으로 나오고 있다
		 *
		 * 이 상황은 대입 연산자의 성질 때문 대입 연산자가 나오면 항상 오른쪽의 연산식이 먼저 실행되며 결과적으로 정수 / 정수는 결과가 정수이고
		 * 이미 계산 결과에서 소수점이하 값이 없는 상태임 이값을 실수형 변수에 담는 것은 의미 없다
		 * 
		 * 이 명령문을 실행하여 정확한 평균을 계산하기 우해서는 대입 연산자 우측의 계산식의 값들을 실수형으로 강제 형변환 후 연산을 수행해야 함
		 */
		// 평균을 저장할 변수를 float형으로
		float floatAvg = intSum / 2;

		// intSum / 2의 연산식에서
		// 정수형변수 intSum을 float형으로 강제 형변환하면
		// 젯수(나누는 수) 2도 2.0으로 변환된다
		// 결국 실수 / 실수 연산이 되어
		// 소수점이하 값을 포함하는 계산결과가 만들어진다
		floatAvg = (float) intSum / 2;
		floatAvg = intSum / 2.0f;
		floatAvg = intSum / (float) 2;
		floatAvg = (float) intSum / 2.0f;
		floatAvg = (float) intSum / (float) 2.0;

		System.out.println("평균 : " + floatAvg);

	}
}
