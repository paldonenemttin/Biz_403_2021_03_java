package com.callor.score;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Word_01 {

	public static void main(String[] args) {

		String fileName = "src/com/callor/score/word.txt";

		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		
		
		System.out.println("=".repeat(50));
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			String word = new String();
			while((word = buffer.readLine()) != null) {
				String id[] = word.split(":");
				System.out.printf("%s\t%s\n",id[0],id[1]);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(fileName + "파일이 업소요ㅠ");
			//e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
		}
		System.out.println("=".repeat(50));

	}

}
