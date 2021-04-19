package com.callor.score.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.callor.score.model.WordVO;

public class WordServiceImplV1 implements WordService{
	
	protected Scanner scan;
	protected List<WordVO> wordList;
	protected final int 영어 = 0;
	protected final int 한글 = 1;
	
	public WordServiceImplV1() {
		wordList = new ArrayList<WordVO>();
		scan = new Scanner(System.in);
		/*
		 * 파일을 읽어서
		 * 테이터를 생성하는 method를
		 * 생성자에서 호출하여
		 * 이 클래스를 생성하면
		 * 자동으로 실행되어 데이터를 준비라도록 함
		 */
		this.loadWord();
	}

	@Override
	public void loadWord() {
		// TODO word.txt 파일을 읽어서 wordList 만들기
		
		String fileName = "src/com/callor/score/word.txt";
		
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			String str = new String();
			while((str = buffer.readLine()) != null) {
				String word[] = str.split(":");
				WordVO wordVO = new WordVO();
				wordVO.setEnglish(word[영어]);
				wordVO.setKorea(word[한글]);
				wordList.add(wordVO);
			}
			buffer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("파일 여는 중 문제 발생");
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("데이터 읽는 중 문제 발생");
		}
		
		
	}

	@Override
	public void printWord() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewWord() {
		while(true) {
			int nWinCount = 0;
			int nLossCount = 0;
			WordVO vo = this.getWord();
			System.out.println(vo.toString());
			System.out.println("=".repeat(50));
			System.out.println("다음 뜻과 같은 영어단어는?(quit:그만하기)");
			System.out.println(vo.getKorea());
			System.out.println("-".repeat(50));
			System.out.print(">> ");
			String strKor = scan.nextLine();
			
			if(strKor.equals("quit")) {
				break;
			}
			if(strKor.equalsIgnoreCase( vo.getEnglish()) ){
				System.out.println("잘했다 짜샤");
				nWinCount++;
			}else {
				System.out.println("좀 더 분발하자^^");
				nLossCount++;
			}
			System.out.println("=".repeat(50));
			System.out.printf("지금까지 맞춘 갯수 : %d\n", nWinCount);
			System.out.printf("지금까지 틀린 갯수 : %d\n", nLossCount);
		}
		System.out.println("끝났다 짜샤!");
		
	}
	
	protected WordVO getWord() {
		// TODO wordList에 담긴 데이터중 임의데이터1개를 추출하여 출력
				Random rnd = new Random();
				rnd.nextInt(100); // 0~99까지중의 정수 1개 생성
				
				int nSize = wordList.size();
				int num = rnd.nextInt(nSize);// 0~ (nSize -1) 중의 정수 1개를 생성
				
				WordVO wordVO = wordList.get(num);
				// system.out.println(wordVO.toString());
				return wordVO;
				
	}

}
