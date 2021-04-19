package com.callor.apps;

import com.callor.apps.service.ScoreServiceV2;

public class App_09 {
	
	public static void main(String[] args) {
		
		ScoreServiceV2 ssV2 = new ScoreServiceV2(100);
		
		ssV2.makeScore();
		ssV2.sumScore();
		ssV2.printScore();
	}

}
