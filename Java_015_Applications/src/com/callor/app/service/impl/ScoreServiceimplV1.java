package com.callor.app.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;
import com.paldonenemttin.standard.impl.inputServiceImplV1;

/*
 * 1. 메뉴를 보여주고
 * 2. 성적입력 : 학생수의 제한이 없다.
 *    가. 학번
 *    나. 학생이름 : inputName()
 *    다. 학생의 과목별 성적 : inputScore()
 *    
 *    가 : 학생성적입력 : inputScore() 시작
 *      - 학번입력
 *      - 이름입력
 *      - 점수입력 
 *      
 *    나. 학생의 이름을 입력하는 inputName() method는
 *        return type String 형이기 때문에
 *        학생이름을 입력받고 입력받은 학생이름을 return한다
 *        이 return 학생이름을 inputScore()에서
 *        변수에 담아 처리를 할 수 있다 
 *    
 */
public class ScoreServiceimplV1 implements ScoreService {

	// 저장소
	protected List<ScoreVO> scoreList;
	// 학생의 이름을 입력바등ㄹ때 사용할 객체
	protected Scanner scan;

	protected String[] subject;
	protected inputServiceImplV1 inService;

	public ScoreServiceimplV1() {
		// TODO Auto-generated constructor stub
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
		subject = new String[] { "국어", "영어", "수학" };
		inService = new inputServiceImplV1();
	}

	@Override
	public void selectMenu() {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("=".repeat(50));
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 리스트 산출");
			System.out.println("QUIT : 입력종료");
			System.out.println("-".repeat(50));
			System.out.println(">>");
			String strNum = scan.nextLine();
			Integer intNum = 0;
			if (strNum.equals("QUIT")) {
				System.out.println("입력을 종료합니다");
				return;
			} else {
				try {
					intNum = Integer.valueOf(strNum);
				} catch (NumberFormatException e) {
					System.out.println("정수와 QUIT만 입력 가능");
					continue;
				}
			}
			if (intNum == 1) {
				this.inputScore();
			} else if (intNum == 2) {
				this.printScore();
			}
		}

	}

	@Override
	public String inputName() {
		// TODO Auto-generated method stub
		this.inputName("무명");
		return null;

	}

	@Override
	public void inputScore() {
		// TODO 학번 이름 과목점수를 입력받아 List에 추가
		
		String strNum = this.inputNum();
		if(strNum == null) {
			return;
		}
		
		// 학생의 이름 입력
		String strName = this.inputName(strNum);
		if(strName == null) {
			return;
		}
		
		Integer intKor = inService.inputValue(subject[0], 0, 100);
		if(intKor == null) {
			return;
		} 
		
		Integer intEng = inService.inputValue(subject[1], 0, 100);
		if(intEng == null) {
			return;
		}
		
		Integer intMath = inService.inputValue(subject[2], 0, 100);
		if(intMath == null) {
			return;
		}
		
		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setName(strName);
		scoreVO.setNum(strNum);
		scoreVO.setKor(intKor);
		scoreVO.setEng(intEng);
		scoreVO.setMath(intMath);
		// vo에 담긴 데이터를 List 저장소에 저장
		scoreList.add(scoreVO);
	}

	protected String inputNum() {
		// TODO Auto-generated method stub
		
		// 학번 입력처리 : 001, 002 형식으로 입력받자
				// 정수 1 이상을 입력하면
				// 정수 값이 intNum에 담길 것이고 QUIT를 입력했으면
				// null 값이 intNum에 담길 것이다
				Integer intNum = inService.inputValue("학번", 1);

				// intNum에 null값이 담겨있으면 종료하고
				// 다시 메뉴로 돌아간다
				if (intNum == null) {
					return null;
				}

				// 정수를 입력했으면 입력받은 정수 값을
				// 학번의 문자열 형식(001,002)로 변환을 하자
				// String.format("%3d", intNum )
				// 전체 자릿수를 3개로 만들고
				// 정수값을 오른쪽 정렬하는 문자열 만들기
				// "1"
				// String.format("%03d", 1)
				// 전체 자릿수를 3개로 만들고
				// 정수 값을 오른쪽 정렬하고
				// 왼쪽의 빈칸에 0을 채워라
				// "001"
				String strNum = String.format("%03d", intNum);
				return strNum;
		
	}

	protected String inputName(String strNum) {
		// TODO 학번으로 보여주고 이름ㅇ르 입력받는 method
		while(true) {
			System.out.println("학생 이름을 입력(입력중단 : QUIT)");
			System.out.print(">>");
			String strName = scan.nextLine();
			if (strName.equals("QUIT")) {
				break;
			} else if (strName.equals("")) {
				System.out.println("학생 이름은 입력해야 합니다");
				continue;
			}
			return strName;
		}
		return null;

	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub

		System.out.println("=".repeat(50));
		System.out.println("이름\t학번\t국어\t영어\t수학");
		System.out.println("-".repeat(50));
		
		for (int i = 0; i < scoreList.size(); i++) {
			ScoreVO scoreVO = scoreList.get(i);
			System.out.print(scoreVO.getNum() + "\t");
			System.out.print(scoreVO.getName() + "\t");
			System.out.print(scoreVO.getKor() + "\t");
			System.out.print(scoreVO.getEng() + "\t");
			System.out.print(scoreVO.getMath() + "\n");
		}
		System.out.println("=".repeat(50));
	}

}
