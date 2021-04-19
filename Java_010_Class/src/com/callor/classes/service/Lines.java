package com.callor.classes.service;

public class Lines {
	
	public static String dline(int nCount) {
		
		//printf() 는 화면에 출력하는 form을 만드는 출력 method
		// String.format()은 화면에 출력하는 대신 문자열로 만들어  return하는 method
		//만들어진 문자열을 dLine 변수에 담는다
		
		// nCount 값이 10이라면
		// "%050d형식의 format 문자열이 생성될것
		String dLine = String.format("%0" + nCount + "d", 0).replace("0", "=");
		
		return dLine;
	}
	
	public static String sLine(int nCount) {
		
		return String.format("%0" + nCount + "d" ,0).replace("0", "-");
	}
	
	
	public static String dLine11(int nCount) {
		// print("=" * 10) : = 문자열을 10개 만들어서 출력
		
		// java 11 이상에서 연속된 문자열을 만드는 method
		String dLine = "=".repeat(nCount);
		return dLine;
	}

}
