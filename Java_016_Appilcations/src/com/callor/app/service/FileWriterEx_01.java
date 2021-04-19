package com.callor.app.service;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class FileWriterEx_01 {

	Random rnd;
	String fileName;
	FileWriter fileWriter;
	PrintWriter out;

	public FileWriterEx_01() {
		rnd = new Random();
		fileName = "src/com/callor/app/mydata.txt";
		fileWriter = null;
		out = null;
	}

	public void PrintWriter() {
		int num1 = rnd.nextInt(100);
		int num2 = rnd.nextInt(100);

		int minus = num1 - num2;
		int nanum = num1 / num2;
		int plus = num1 + num2;
		int gob = num1 * num2;

		try {
			fileWriter = new FileWriter(fileName);
			out = new PrintWriter(fileWriter);
			out.println("=".repeat(50));
			out.printf("%d + %d = %d", num1, num2, plus);
			out.printf("%d * %d = %d", num1, num2, gob);
			if (num1 > num2) {
				out.printf("%d / %d = %d ", num1, num2, nanum);
				out.printf("%d - %d = %d", num1, num2, minus);
			} else {
				return;
			}
			out.println("-".repeat(50));

			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
