package com.callor.score.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.paldonenemttin.standard.MenuService;
import com.paldonenemttin.standard.impl.MenuServiceImplV1;

public class ScoreServiceImplV1 implements ScoreService{
	
	protected Scanner scan;
	protected List<ScoreVO> scoreList;
	protected MenuService menuService;

	@Override
	public void selectMenu() {
		
		List<String> scoreMenu = new ArrayList<String>();
		scoreMenu.add("성적입력");
		scoreMenu.add("성적 리스트 출력");
		scoreMenu.add("성적 저장");
		 
		menuService = new MenuServiceImplV1("대한 고등학교 성적리스트 ", scoreMenu);
		
		while(true) {
			Integer menu = menuService.selectmenu();
			if(menu == null) {
				System.out.println("업무종료");
				break;
			}
			if(menu == 1) {
				this.inputScore();
			}else if( menu == 2) {
				this.printScore();
			}else if( menu == 3) {
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

}
