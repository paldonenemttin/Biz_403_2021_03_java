package com.callor.score;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_03 {

	public static void main(String[] args) {

		String fileName = "src/com/callor/score/sample_score.txt";

		/*
		 * 파일을 읽기 위해서 open하는 크랠스 OS에게 파일ㅇ르 읽을 수 있도록 허락해달라 요청하기
		 */
		FileReader fileReader = null;
		// FileReader가 open해 놓은 파일에서
		// 데이터를 읽어서 buffer라고 하는
		// 임시 기억장소에 저장해 놓는다
		BufferedReader buffer = null;

		try {
			
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			// 파일에 저장된 데이터의 라인수를 알때는
			// for()를 이용하여 읽을 수 있느데
			// 라인 수를 알 수 없을때는?

			// for(int i = 0 ; i < 30 ; i++) {
			
			/*
			 * bufferedReader.readLine() method를 실행하면
			 * buffer 에 저장된 테이터
			 * 
			 * 만약 readLine() method를 데이터 갯수만큼
			 * 반복하면 모든 데이터를 읽을 수 있다
			 * 
			 * 다만 이 방법은 데이터의 갯수를 알아야만 실행 사능
			 * 
			 * 데이터의 갯수를 정확히 알 수 없을땐
			 * 쩔숭 없이 무한 반복을 해야 하는데
			 * 무한 반복문을 실행할땐
			 * 중간에 탈출구를 고민해야 한다
			 * 
			 * 마찬가지로 readLine()  탈출법을 알려주는데
			 * 만약 더이상 읽을 데이터가 없을땬
			 * readLine()이 null 값을 return한다
			 */
			while (true) {
				String str = buffer.readLine();
				System.out.println(str);
			}
			//System.out.println(buffer.readLine());
			// System.out.println(buffer.readLine());
			// System.out.println(buffer.readLine());

			 //buffer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
