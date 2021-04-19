package com.callor.app.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.Values;
import com.paldonenemttin.standard.InputService;
import com.paldonenemttin.standard.impl.inputServiceImplV1;

/*
 * selectMenu는 그대로 활용
 * InputScore()만 다시 작성
 */
public class ScoreServiceImplV2Ex extends ScoreServiceV2 {

	protected InputService inService;
	protected List<ScoreVO> scoreList;

	protected Integer[] subScoreList;
	protected String[] subjectList;
	protected Scanner scan;

	// 과목명, 과목점수가 담긴 배열에 대한 위치를
	// 숫자로 사용하지 않고명명된 이름으로 사용하기 위하여,
	// 배열의 index값을 상수로 선언해둔다
	protected final int 국어 = 0;
	protected final int 영어 = 1;
	protected final int 수학 = 2;

	public ScoreServiceImplV2Ex() {
		inService = new inputServiceImplV1();
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
		subjectList = new String[] { "국어", "영어", "수학" };
		subScoreList = new Integer[subjectList.length];

	}

	@Override
	public void inputScore() {

		Integer intNum = inService.inputValue("학번", 1);
		if (intNum == null) {
			return;
		}
		String strNum = String.format("2021%03d", intNum);

		String strName = null;
		while (true) {
			System.out.println(strNum + "학생의 이름 입력(QUIT:입력중단)");
			strName = scan.nextLine();
			if (strName.equals("QUIT")) {
				return;
			} else if (strName.equals("")) {
				System.out.println("학생이름은 반드시 입력");
				continue;
			}
			break;
		}

		// 각 과목의 점수를 별도로 입력받아 변수에 저장하기를
		// 하려고 하니 귀찮음
		// 창조적 게으름을 피워보기

		// 입력받을 과목명을 배열변수로 선언하고
		// String[] subject = {"국어","영어","수학"};
		// subject 배열을 맴버영역으로 이동 subjectList로
		// 점수를 입력하는 곳에서 사용하기 위하여
		// 과목명을 담을 배열을 선언했느데
		// 생각해보니 다은 method에서도 사용하룻 있을 것 같다
		// 그래서 클래스 영역으로 이동하였달

		// 과목수 만점 점수를 저장할 배열을 선언
		// Integer[] intScore = new Integer[subject.length];
		// intScore 배열을 맴버영역으로 이동 subScoreList로
		for (int i = 0; i < subjectList.length; i++) {
			subScoreList[i] = inService.inputValue(subjectList[i], 0, 100);
			if (subjectList[i] == null) {
				return;
			}
		}

		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setNum(strNum);
		scoreVO.setName(strName);

		scoreVO.setKor(subScoreList[국어]);
		scoreVO.setEng(subScoreList[영어]);
		scoreVO.setMath(subScoreList[수학]);

		scoreVO.setKor(subScoreList[Values.국어]);
		scoreVO.setEng(subScoreList[Values.영어]);
		scoreVO.setMath(subScoreList[Values.수학]);

		System.out.println("=".repeat(50));
		System.out.println(scoreVO.toString());
		System.out.println("=".repeat(50));
		scoreList.add(scoreVO);

	}

	@Override
	public void printScore() {

		System.out.println("빛나라 고교 성적리스트 2021");
		System.out.println("-".repeat(50));
		for (int index = 0; index < subjectList.length; index++) {
			System.out.print(subjectList[index] + "\t");
		}
		System.out.println();
		System.out.println("=".repeat(50));

		int nSize = scoreList.size();
		for (int i = 0; i < nSize; i++) {
			ScoreVO vo = scoreList.get(i);
			System.out.print(vo.getNum() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getTotal() + "\t");
			System.out.print(vo.getAvg() + "\t");

		}
		System.out.println("=".repeat(50));
	}

	@Override
	public void saveScore() {
		
		while(true) {
			System.out.println("성적리스트 저장");
			System.out.println("저장할 파일이름을 입력하세요");
			System.out.print(">> ");
			
			String strFileName = scan.nextLine();
			if(strFileName.equals("")){
				System.out.println("파일 이름을 입력해야 합니다");
				continue;
			}
			
			FileWriter filWriter = null;
			PrintWriter out = null;
			
			strFileName = "src/com/callor/app/" + "strfileName" + ".txt";
			
			try {
				filWriter = new FileWriter(strFileName);
				out = new PrintWriter(filWriter);
				int nSize = scoreList.size();
				for(int i =0 ; i < nSize ; i++) {
					ScoreVO vo = new ScoreVO();
					out.print(vo.getNum());
					out.print(vo.getName());
					out.print(vo.getKor());
					out.print(vo.getEng());
					out.print(vo.getMath());
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return;
		
	}
	
	
	
	}

}
