package com.callor.apps;

import com.callor.apps.service.ScoreServiceV1;

public class App_08 {
	
	public static void main(String[] args) {
		
		ScoreServiceV1 osV1 = new ScoreServiceV1();
		
		osV1.makeScore();
		osV1.sumScore();
		osV1.printScore();
		
	}

}
