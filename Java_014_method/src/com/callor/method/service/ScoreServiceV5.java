package com.callor.method.service;

import java.util.ArrayList;
import java.util.List;

public class ScoreServiceV5 {

	protected InputServiceV2 inService;
	protected List<Integer> Kors;
	protected List<Integer> Engs;
	protected List<Integer> Math;
	protected String[] subject;

	public ScoreServiceV5() {
		inService = new InputServiceV2();
		Kors = new ArrayList<Integer>();
		Engs = new ArrayList<Integer>();
		Math = new ArrayList<Integer>();
		subject = new String[] { "국어", "영어", "수학" };
	}

	public void inputScore() {
		for (int i = 0; i < 5; i++) {
			Integer kor = inService.inPutValue("국어", 0, 100);
			if (kor == null) {
				System.out.println("입력종료");
				return;
			}
			Kors.add(kor);
		}
		for (int i = 0; i < 5; i++) {
			Integer eng = inService.inPutValue("영어", 0, 100);
			if (eng == null) {
				System.out.println("입력종료");
				return;
			}
			Engs.add(eng);
		}
		for (int i = 0; i < 5; i++) {
			Integer math = inService.inPutValue("수학", 0, 100);
			if (math == null) {
				System.out.println("입력종료");
				return;
			}
			Math.add(math);
		}

	}

	public void printScore() {

		System.out.println("=".repeat(50));
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(50));
		for (int i = 0; i < Kors.size(); i++) {
			System.out.println(Kors.get(i) + "\t");
			System.out.println(Engs.get(i) + "\t");
			System.out.println(Math.get(i) + "\t");
		}
		System.out.println("=".repeat(50));

	}

}
