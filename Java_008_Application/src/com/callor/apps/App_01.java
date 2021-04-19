package com.callor.apps;

import com.callor.apps.Service.TimeServiceV1;

public class App_01 {
	
	public static void main(String[] args) {
		
		TimeServiceV1 csV1 = new TimeServiceV1();
		
		csV1.makeTimes();
		csV1.printTimes();
	}

}
