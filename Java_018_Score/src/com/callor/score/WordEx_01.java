package com.callor.score;

import com.callor.score.service.WordService;
import com.callor.score.service.WordServiceImplV1;
import com.callor.score.service.WordServiceImplV2;

public class WordEx_01 {
	
	public static void main(String[] args) {
		
		 WordService sService = new WordServiceImplV2();
		 
		 sService.viewWord();
	}

}
