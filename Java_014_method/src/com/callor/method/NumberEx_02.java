package com.callor.method;

import com.callor.method.service.InputNumberV1;

public class NumberEx_02 {
	
	public static void main(String[] args) {
		
		InputNumberV1 inService = new InputNumberV1();
		//문자열 1개만 전달앟여 method호출
		//문자열을 전달받아 값을입력받아 결과를 return
		//inService.inputValue("새우깡");
		
		// 문자열 1개와 정수 2개를 전달하여 method호출
		// 2개의 정수 범위의
		//
	    inService.inputValue("새우깡", 1, 100);
		
	}

}
