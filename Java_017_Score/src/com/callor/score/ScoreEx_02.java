package com.callor.score;

import com.callor.score.service.ScoreServiceImplV1;
import com.callor.score.service.ScoreServiceImplV2;

public class ScoreEx_02 {
	
	public static void main(String[] args) {
		
		ScoreServiceImplV1 sService = new ScoreServiceImplV2();
		
		sService.selectMenu();
		
	}

}
