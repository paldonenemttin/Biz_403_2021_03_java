package com.callor.app;

import com.paldonenemttin.standard.InputService;
import com.paldonenemttin.standard.impl.inputServiceImplV1;

public class InputEx_01 {
	
	public static void main(String[] args) {
		
		InputService isV1 = new inputServiceImplV1();
		
		isV1.inputValue("새우깡");
		
		System.out.println(isV1.toString());
	}

}
