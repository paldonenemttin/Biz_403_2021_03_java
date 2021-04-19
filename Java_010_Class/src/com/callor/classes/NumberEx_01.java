package com.callor.classes;

import com.callor.classes.service.NumberServiceV1;

public class NumberEx_01 {
	
	public static void main(String[] args) {
		
		int intNum1 = 30;
		int intNum2 = 40;
		
		float fNum1 = 30.0f;
		float fNum2 = 40.0f;
		
		String str1 = "대한 민국";
		String str2 = "우리나라만세";
		
		NumberServiceV1 msV1 = new NumberServiceV1();
		
		msV1.intAdd(intNum1, intNum2);
		msV1.floatAdd(fNum1, fNum2);
		msV1.stringAdd(str1, str2);
		
		msV1.add(intNum1, intNum2);
		msV1.add(fNum1, fNum2);
		msV1.add(str1, str2);
		
	}

}
