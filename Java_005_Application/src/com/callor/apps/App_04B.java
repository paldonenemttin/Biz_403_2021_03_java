package com.callor.apps;

import java.util.Random;

/*
 * 5학급의 학생들에게 피자 간식을 지급하려고 합니다.
 * 
 */
public class App_04B {
	public static void main(String[] args) {

		Random rnd = new Random();

		int pizzaPcs = 6;

		int[] intClasses = new int[5];
		
		int intMembers = 0;
		
		for (int i = 0; i < 5; i++) {

			// (0 ~ (?? -1) +@@
			// @@ : 시작값을 지정하는 형태
			// 50 ~ 59 중에 임의의 수를 생성
			int orders = rnd.nextInt(50) + 9;
			intClasses[i] = intMembers;
		}

		// 학급별 주문 수량을 계산하는 부분과
		// 리스트를 출력하는 부분을 분리하자
		// 1 . 계산된 주문 수량을 담아둘 장소를 생성
		// 2. 저장된 주문수량을 사용하여 출력

		// 학급별 주문수향을 계산하여 저장할 배열
		int[] intOrders = new int[5];

		for (int i = 0; i < 5; i++) {
			int order = intClasses[i] / pizzaPcs;
			if (intClasses[i] % (order * pizzaPcs) > 0) {
				order++;
			}
			intOrders[i] = order;

		}
		System.out.println("피자 주문서");
		System.out.println("===================");
		System.out.println("순번\t인원\tBOX\t조각");
		System.out.println("-------------------------------");

		int intTotalOrder = 0;
		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1) + "\t");
			System.out.println(intClasses[i] + "\t");
			System.out.println(intOrders[i] + "\t");
			System.out.println(intOrders[i] + pizzaPcs);
			intTotalOrder += intOrders[i];
		}
		System.out.println("===========================");
		System.out.println("전체주문 ");
	}

}
