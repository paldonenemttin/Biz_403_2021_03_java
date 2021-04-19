package com.callor.method.service;

import java.util.Scanner;

public class ScoreServiceV3 {
	
	protected InputServiceV2 inService;
	            // 
	public ScoreServiceV3() {
		inService = new InputServiceV2();
	}
		
	public void inputScore() {
		
		Integer intKor = inService.inPutValue("국어", 0, 100);
		if(intKor == null) {
			System.out.println("종료");
			return;
		}
		Integer intEng = inService.inPutValue("수학", 0, 100);
		if(intEng == null) {
			System.out.println("종료");
			return;
		}
		Integer intMath = inService.inPutValue("수학", 0, 100);
		if(intMath == null) {
			System.out.println("종료");
			return;
		}
		
		int intSum = intKor + intEng + intMath;
		float floatAvg = (float)intSum / 3;
		
		System.out.println("총점 : " + intSum);
		System.out.println("평균 : " + floatAvg);
		
	}
	

}
