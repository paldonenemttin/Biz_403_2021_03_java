package com.callor.controller;

public class Score_01 {
	
	public static void main(String[] args) {
		
		int intKor = 80;
		int intEng = 77;
		int intMath = 65;
		System.out.println("========================");
		System.out.printf("국어 : %d\n" , intKor);
		System.out.printf("영어 : %d\n" , intEng );
		System.out.printf("수학 : %d\n" , intMath);
		
		System.out.println("------------------------\n");
		
		int intSum = 0;
		
		intSum = intKor;
		intSum += intEng;
		intSum += intMath;
		
		int intAvg = intSum / 3;

		System.out.printf("총점 : %d   평균 : " , intSum , intAvg);
		
		/*/
		 * print() 사용하여 출력할때
		 * %d : 정수(십진수)
		 * %f : 실수(float)
		 *      %3.2f : 소수점 이하 두자리까지 표시
		 *      
		 *\ㅜ : enter를 누른것 처럼 줄바꿈을 실행
		 *\t : tab 키를 누른것처럼 사이띄기를 일정하게 맞추어라
		 *
		 *%s : 문자열
		 */
		
	}

}
