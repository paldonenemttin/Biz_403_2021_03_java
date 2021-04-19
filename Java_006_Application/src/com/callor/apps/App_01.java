package com.callor.apps;
/*
 * 정수형 배열을 20개 선언
 * 짝수들의 리스트 출력
 * 짝수들의 합을 계산하여 출력
 */
import java.util.Random;

public class App_01 {
	/*
	 * {  } 내에 있는 코드는 최소화 하자
	 * 작은 일들로 분해하기
	 */
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		/*
		 *  배열의크기를 변수에 설정해 두고
		 *  코드내에서 공통으로 사용하기
		 */
		int numLength = 20;
		
		int[] num = new int[numLength];
		int intSum = 0;
		for(int i = 0 ; i < 20 ; i ++) {
			//먼저 선언되어 있는 배열에 값을 저장하기
			num[i] = rnd.nextInt(100) + 1;
			}
		//짝수들의 리스트 출력
		for(int i = 0 ; i < 20 ; i++) {
			if(num[i] % 2 == 0) {
			System.out.println(num[i]);
		}
		}
		//합계 계산하기
		//
		//
	    intSum = 0;
		for( int i = 0 ; i < 20 ; i++) {
				intSum += num[i];
			}
			System.out.println("======================");
			System.out.printf("짝수들의 합 : %d\n" , intSum);
			System.out.println("======================");
	}

	}

