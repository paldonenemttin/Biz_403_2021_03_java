package com.callor.score.service;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.paldonenemttin.standard.InputService;
import com.paldonenemttin.standard.impl.inputServiceImplV1;

public class ScoreServiceImplV2 extends ScoreServiceImplV1Ex {

	protected String[] subjectList;
	protected List<ScoreVO> scoreList;
	protected InputService inService;
	protected Integer[] subScoreList;
	protected Scanner scan;
	
	protected static final int 국어 = 0;
	protected static final int 영어 = 1;
	protected static final int 수학 = 2;
	
	public ScoreServiceImplV2() {
		subjectList = new String[] { "국어", "영어", "수학" };
		scoreList = new ArrayList<ScoreVO>();
		inService = new inputServiceImplV1();
		subScoreList = new Integer[subjectList.length];
		scan = new Scanner(System.in);
	}

	@Override
	public void inputScore() {

		Integer intNum = inService.inputValue("학번", 1);
		if (intNum == null) {
			return;
		}
		String strNum = String.format("%03d", intNum);
		
		String strName = null;
		while (true) {
			System.out.println(strNum + "학생의 이름 입력(QUIT:입력중단)");
			strName = scan.nextLine();
			if(strName == null) {
				return;
			}
			if(strNum.equals("")) {
				System.out.println("학생 이름은 필수 항목");
				continue;
			}
			break;
		}
		for(int i = 0; i < subjectList.length ; i++) {
			String subject = subjectList[i] + "점수 ";
			Integer intScore = inService.inputValue(subject, 0, 100);
			if(intScore == null) {
				return;
			}
			subScoreList[i] = intScore;
		}
		
		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setNum(strNum);
		scoreVO.setName(strName);
		scoreVO.setKor(subScoreList[국어]);
		scoreVO.setEng(subScoreList[영어]);
		scoreVO.setMath(subScoreList[수학]);
		scoreList.add(scoreVO);

	}

	@Override
	public void printScore() {
		System.out.println("=".repeat(80));
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(80));
		
		int nSize = scoreList.size();
		for(int i = 0; i < nSize ; i++) {
			ScoreVO vo = scoreList.get(i);
			System.out.print(vo.getNum() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getTotal() + "\t");
			System.out.print(vo.getAvg() + "\t");
		}
		System.out.println("=".repeat(80));
	}

	@Override
	public void saveScore() {
		
		String fileName = null;
		while(true) {
			System.out.println("저장할 파일 이름을 입력하세요");
			System.out.print(">> ");
			fileName = scan.nextLine();
			if(fileName.equals("")) {
				System.out.println("파일이름은 반드시 입력");
				continue;
			}
			break;
		}
		
		String strFileName = "src/com/callor/score/" + fileName;
		
		FileWriter fileWriter = null;
		PrintWriter out = null;
		
		try {
			fileWriter = new FileWriter(strFileName);
			out = new PrintWriter(fileWriter);
			
			int nSize = scoreList.size();
			for(int i = 0; i < nSize ; i++) {
				ScoreVO vo = scoreList.get(i);
				
				out.print(vo.getNum() + "\t");
				out.print(vo.getName() + "\t");
				out.print(vo.getKor() + "\t");
				out.print(vo.getEng() + "\t");
				out.print(vo.getMath() + "\t");
				out.print(vo.getTotal() + "\t");
				out.printf("%3.2f\n",vo.getAvg());
			}
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
