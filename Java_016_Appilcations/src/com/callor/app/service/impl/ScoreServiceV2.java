package com.callor.app.service.impl;

import java.util.Scanner;

import com.callor.app.service.ScoreService;

public class ScoreServiceV2 implements ScoreService{
	
	Scanner scan;
	public ScoreServiceV2() {
		scan = new Scanner(System.in);
	}

	@Override
	public void selectMenu() {
		while(true) {
			System.out.println("=".repeat(50));
			System.out.println("빛고을 고교 성적처리 2021");
			System.out.println("=".repeat(50));
			System.out.println("1. 성적입력");
			System.out.println("2. 성적리스트 출력");
			System.out.println("3. 성적 저장");
			System.out.println("QTUI.입력종료");
			System.out.println("-".repeat(50));
			System.out.print("업무선택 >> ");
			String strNum = scan.nextLine();
			Integer intNum = 0;
			if(strNum.equals("QUIT")) {
				
			}
			try {
				intNum = Integer.valueOf(strNum);
			} catch (NumberFormatException e) {
				System.out.println("정수 또는 QUIT만 입력 가능");
				continue;
			}
			if(intNum == 1) {
				this.inputScore();
			}
			if(intNum == 2) {
				this.printScore();
			}
			if(intNum == 3) {
				this.saveScore();
			}
		}
		
		
		
	}

	@Override
	public void inputScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer checkScore() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
