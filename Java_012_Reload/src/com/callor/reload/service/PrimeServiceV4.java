package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * PrimeServiceV4 클래스 영역에 랜덤과 리스트 인티저 객체를 선언
 * 클래스 생성자에서 랜덤객체와 인트리스트 객체 생성(초기화)
 * PrimeNum() method를 선언하고 50~100까지 난수 50개를 생성
 * 그리고 난수중 소수인 정수들만 intList에 추가
 * printPrimeNum() method를 선언하고 intList에 담긴 소수들 리스트를 출력
 */
public class PrimeServiceV4 {

	protected Random rnd;
	protected List<Integer> intList;

	public PrimeServiceV4() {
		rnd = new Random();
		intList = new ArrayList<Integer>();
	}

	public void PrimeNum() {
		Integer num = rnd.nextInt(51) + 50;
		int index = 0;
		for (index = 2; index < 50; index++) {
			if (num % index == 0) {
				break;
			}
		}
		if (num < index) {
			intList.add(num);
		}
	}
 
	public void printPrimeNum() {
		
		//배열, List구조의 데이터들을 전체를 반복하여 처리할 경우
		
		//for(int i = 0 ; i < intList.size();i++) {
			//Integer prime = intList.get(i);
		//위의 두줄의 명령문을 한번에 실행하는 효과
		for (Integer prime : intList) {
			System.out.println(prime);
		}
	}

}
