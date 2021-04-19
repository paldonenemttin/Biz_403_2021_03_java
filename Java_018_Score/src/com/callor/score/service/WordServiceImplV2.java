package com.callor.score.service;

import java.util.Arrays;
import java.util.Random;

import com.callor.score.model.WordVO;

public class WordServiceImplV2 extends WordServiceImplV1 {

	
	@Override
	public void viewWord() {
		
		Random rnd = new Random();
		
		WordVO word = this.getWord();
		String strEng = word.getEnglish();
		
		String[] strWords = strEng.split("");
		while(true) {
			for(int i = 0; i < 100 ; i++) {
				int index = rnd.nextInt(strWords.length);
				int index1 = rnd.nextInt(strWords.length);
				String temp = strWords[index];
				strWords[index] = strWords[index1];
				strWords[index1] = temp;
			}
			System.out.println("=".repeat(50));
			System.out.println(word.toString());
			System.out.println("-".repeat(50));
			System.out.println("단어 뜻에 맞게 철자 배열해보쇼 그만할랑 quit 누르고");
			System.out.println(Arrays.toString(strWords));
			System.out.println("-".repeat(50));
			System.out.print(">> ");
			String strInput = scan.nextLine();
			
			if(strInput.equals("quit")) {
				break;
			}
			if(strInput.equalsIgnoreCase(word.getEnglish())) {
				System.out.println("옳지! 바로 그거얌!");
			}else {
				System.out.println("힌트 : " + word.getKorea());
				System.out.println("멍청아 그것도 모름?");
				System.out.print("다음 것도 틀림 찐 멍청이인거 rg?");
				continue;
			}
			
		}
		
	}
	 
	

}
