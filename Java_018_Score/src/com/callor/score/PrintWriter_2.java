package com.callor.score;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter_2 {
	
	public static void main(String[] args) {
		
		String fileName = "src/com/callor/score/test.txt";
		
		FileWriter fileWriter = null;
		PrintWriter out = null;
		
		try {
			/*
			 * PrintWriter 클래스 만으로 출력이 가능
			 * 그럼에도 불구하고 FileWriter를 사용하는 이유는
			 * FileWriter
			 * 
			 * 
			 */
			fileWriter = new FileWriter(fileName,true);
			out = new PrintWriter(fileName);
			for(int i = 0; i < 10 ; i++) {
				out.printf("%05d\n",i+1);
			}
			out.flush();
			out.close();
			System.out.println("완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
