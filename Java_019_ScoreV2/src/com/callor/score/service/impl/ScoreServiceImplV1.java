package com.callor.score.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.callor.score.model.StudentVO;
import com.callor.score.service.ScoreService;
import com.callor.score.service.StudentService;
import com.paldonenemttin.standard.InputService;
import com.paldonenemttin.standard.impl.inputServiceImplV1;

public class ScoreServiceImplV1 implements ScoreService{
	
	protected InputService inService;
	protected StudentService stService;
	protected List<ScoreVO> scoreList;
	protected Scanner scan;
	
	public ScoreServiceImplV1() {
		inService = new inputServiceImplV1();
		stService = new StudentServiceImplV1();
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
	}
	/*
	 * 학번 입력하면
	 * scoreList에 같은 학번의 성적이 있는지 확인하여
	 * 이미 있는 학번이면 저장하지 않도록 하고 
	 * 다시 입력하도록 해야 한다
	 */
	@Override
	public void insertScore() {
		// TODO 성적 입력
		
		// 유효성검사가 끝난 후 학번을 가지고
		// VO에 담아야 하기 때문에 while() 전에 선언
		String strNum = null;
		while(true) {
			Integer intNum = inService.inputValue("학번", 1);
			if(intNum == null) {
				return;
			}
			strNum = String.format("%05d", intNum);
			// 이미 등록된 학번인지 검사
			ScoreVO scoreVO = this.numcheck(strNum);
			if(scoreVO != null) {
				continue;
			}
			// 학번에 해당하는 점수가 없다
			// 학생 정보에 등록된 학번인가를 검사하여
			// 학생 정보에 없으면 다시 학번을 입력받고
			// 있으면 점수를 입력하도록 break;
			StudentVO stVO = stService.getStudent(strNum);
			if(stVO == null) {
				System.out.println("학적부에 없는 학생");
				System.out.println("학번을 다시 입력 바람");
				continue;
			}
			
			// 여기 도달하면 학적부에 있는 학번이다
			System.out.println("=".repeat(30));
			System.out.printf("학번:%s\n", stVO.getNum());
			System.out.printf("이름:%s\n", stVO.getName());
			System.out.printf("학과:%s\n", stVO.getSubject());
			System.out.printf("학년:%s\n", stVO.getGrade());
			System.out.printf("주소:%s\n", stVO.getAdd());
			System.out.println("=".repeat(30));
			System.out.println("학생 정보 맞음?");
			System.out.println("맞으면 : Enter , 틀리면 :No");
			System.out.print(">> ");
			String yesNo = scan.nextLine();
			if(yesNo.equals("No")) {
				continue;
			}
			break;
			
		}
		
		
		Integer intKor = null;
		intKor = inService.inputValue("국어", 0, 100);
		if(intKor == null) {
			return;
		}
		Integer intEng = null;
		intEng = inService.inputValue("영어", 0, 100);
		if(intEng == null) {
			return;
		}
		Integer intMath = null;
		intMath = inService.inputValue("수학", 0, 100);
		if(intMath == null) {
			return;
		}
		
		// 위에서 담겨있던 데이터는 clear되고
		// 새로운 scoreVO가 생성
		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setNum(strNum);
		scoreVO.setKor(intKor);
		scoreVO.setEng(intEng);
		scoreVO.setMath(intMath);
		scoreList.add(scoreVO);
	}
	
	protected ScoreVO numcheck(String num) {
		for(ScoreVO vo : scoreList) {
			if(vo.getNum().equals(num)) {
				return vo;
			}
		}
		return null;
	}
	
	// 파라메터로 전달받은 학번이 scoreList에 있는 검사
	//있으면 scoreVO를 return
	// 없으면 null을 return
	public void numCheck() {
		
	}
	@Override
	public void loadScore() {
		
		
	}

	@Override
	public void printScore() {
		
		System.out.println("=".repeat(50));
		System.out.println("학번\t이름\t학과\t학년\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(50));
		
		int nSize = scoreList.size();
		for(int i =0; i < nSize; i++) {
			ScoreVO vo = scoreList.get(i);
			System.out.print(vo.getNum() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getTotal() + "\t");
			System.out.print(vo.getAvg() + "\n");
		}
		System.out.println("=".repeat(50));
	}
	

}
