package com.callor.fine.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.fine.model.ScoreVO;

public class ScoreServiceImpl implements ScoreService {
	
	protected List<ScoreVO> scoreList;
	protected Scanner scan;

	public void inputScore() {

		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
		
		
	}

	public void printList() {

		
	}

}
