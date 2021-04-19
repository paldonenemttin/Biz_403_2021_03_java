package com.callor.apps;

import com.callor.apps.service.EvenServiceV2;

public class App_06 {
	public static void main(String[] args) {
		
		EvenServiceV2 psV2 = new EvenServiceV2();
		
		psV2.makeNums();
		psV2.printEven();
		psV2.sumEven();
		
	}

}
