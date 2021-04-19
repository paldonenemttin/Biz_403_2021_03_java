package com.callor.classes.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.classes.model.ScoreVO;
/*
 * 접근제한(참조제한자)
 * public, private, protected
 * 
 * class method 맴버변수를선언할때 사용하는 keyword
 * 접근 제한자는 사용하지 않아도 문법적인 오류가 발생하지 x
 * 
 * 객체이른에 "정보은닉(감춘다, 제한적으로 접근하게 한다, 데이터를 보호한다)"
 * 
 * public : 모두에게 개방한다, 모두에게 공개한다, 누구나 접근(읽기, 쓰기, 실행)을 하게 한다
 *          Class obj = new Calss()
 *          obj.mehtod();
 *          obj.변수 = 100;
 *          
 * private : 현재 파일에 있는 코드에서만 접근 가능
 *           obj.변수 = 100; // 문법 오류남
 *           
 * protected : 객체를 통해서는 직접 접근 금지
 *           Class obj = new Class()
 *           obj.mehtod()방식으로는 접근이 안된다.
 *           클래스르 상속받게 하겠다라는 전제하에 상속을 받은 클래스에서는 자유롭게 접근가능
 *           
 *           부모 클래스와 상속받은 자식 클래스간에 공유하는 목적
 * 
 */
public class ScoreServiceV1 {
	/*
	 * 맴버변수를 protected로 선언을 해 두면
	 * 현재 클래스V1를 상속받은 자식 클래스에서
	 * 변수가 선언된 것처럼 동작하 ㄹ수 잇다
	 * 
	 * 상속을허락하고, 맴버변수를 공류하고자 할대는
	 * protected를 추가한다
	 */
	protected Scanner scan;
	protected List<ScoreVO> scoreList;
	
	public ScoreServiceV1() {
		scan = new Scanner(System.in);
		scoreList = new ArrayList<ScoreVO>();
	}
	
	public Integer inputScore() {
		//System.out.println("학번을 001 형식으로 입력하세요");
		//System.out.print(">");
		//String strNum = scan.next();
		
		/*
		 * scoreList의 데이터 갯수를 계산하여
		 * 입력할 학번을 자동으로 생성하기
		 */
		int nSize = scoreList.size();
		String strNum = String.format("%03d", nSize + 1);
		
		int intKor = 0;
		while(true) {
		System.out.println(strNum + " 번의; 국어점수를 입력(중단 : -1)");
		System.out.print(">");
		intKor = scan.nextInt();
		if(intKor == -1) {
			return -1;
		}else if(intKor < 0 || intKor > 100) {
			System.out.println("국어점수를 0 ~ 100까지");
			continue;
		}
		break;
		}
		System.out.println(strNum + " 번의; 영어점수를 입력");
		System.out.print(">");
		int intEng = scan.nextInt();
		
		System.out.println(strNum + " 번의; 수학점수를 입력");
		System.out.print(">");
		int intMath = scan.nextInt();
		
		ScoreVO scoreVO = new ScoreVO();
		scoreVO.num = strNum;
		scoreVO.Kor = intKor;
		scoreVO.Eng = intEng;
		scoreVO.Math = intMath;
		scoreList.add(scoreVO);
		
		return 0;
	}
	public void printScore() {
		
		this.printHeader();
		
		for(int i =0; i < scoreList.size();i++) {
			//scoreList의 i번째 저장된 값을읽어서
			// ScoreVO 형 sVO 객체에 담기
			ScoreVO sVO = scoreList.get(i);
			
			System.out.print(sVO.num + "\t");
			System.out.print(sVO.Kor + "\t");
			System.out.print(sVO.Eng + "\t");
			System.out.print(sVO.Math + "\n");
		}
	}
	
	private void printHeader() {
		
		System.out.println("빛나라 고교 성적처리 V1");
		System.out.println(Lines.dline(50));
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println(Lines.sLine(50));
	}

}
