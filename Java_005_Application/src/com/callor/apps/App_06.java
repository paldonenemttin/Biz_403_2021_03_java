package com.callor.apps;

public class App_06 {
	
	public static void main(String[] args) {
		
		int nPay = 3_723_560;//금액
		int nPaper = 50_000;// 최고액면화폐
		
		// 정수 = 정수 / 정수 : 소수점이하가 잘림
		// 몫을 구하여 액면가액 만큼 갯수를 계산
		int nCount = nPay / nPaper;
		System.out.println(nPaper + "원권 : " + nCount);
		
		// 액면가액만큼 갯수를 구했으면
		// nPay 에서 액면가액 금액만큼을 빼고 이후에 계산
		//3723560 % 50000 >> 5만원권 * 매수 만큼을 3723560에서 뺀 값이 됌
		// nPay = nPay -(npaper * nCount)
		// nPay = nPay % nPaper;
		nPay %= nPaper;
		nPaper /=5;
		System.out.println(nPay);
		
		nCount = nPay / nPaper;
	}

}
