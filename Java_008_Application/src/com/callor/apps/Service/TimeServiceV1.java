package com.callor.apps.Service;

public class TimeServiceV1 {
	
	int[] intNums;
	
	public TimeServiceV1() {
		
		intNums = new int[8];
		
	}
	/*
	 * 배열은 총 8개
	 * 배열에 저장값은 2 ~ ??
	 */
	public void makeTimes() {
		
		for(int i = 0; i < intNums.length; i++) {
			int num = i + 2;
		    intNums[i] = num;
		}
		 	
		}
		
	/*
	 *  배열에 담긴 값(2~ ??) = 단에 해당값
	 */
	public void printTimes() {
		
		for(int i = 0; i < intNums.length ; i++ ) {
			//method에 return ?? 명령문이 있으면 
			//변수 = method() 형식으로 코드를 작성하고
			// method 가 return 해준 결과값을 변수에 저장가능함
			String dLines = LinesService.dLines(50);
			String sLines = LinesService.sLines(50);
			System.out.println(dLines);
			
			System.out.printf("%d단 구구단\n", intNums[i]);
			
			System.out.println(sLines);
			
			for(int j = 0; j < 10 ; j++) {
				System.out.printf("%d x %d = %d\n", intNums[i], j ,intNums[i] * j);
			}
		}
		
		
		
	}

}
