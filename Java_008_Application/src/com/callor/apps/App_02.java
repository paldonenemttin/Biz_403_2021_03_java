package com.callor.apps;

import com.callor.apps.Service.ScoreServiceV1;

public class App_02 {
	
	public static void main(String[] args) {
		
		ScoreServiceV1 csV1 = new ScoreServiceV1();
		
		csV1.scanScore();
		csV1.totalScore();
		csV1.printScore();
	}

}
