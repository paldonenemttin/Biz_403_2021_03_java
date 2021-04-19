package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.reload.model.NumberVO;

public class InputServiceV5A {

	protected Scanner scan;
	protected List<NumberVO> numList;

	public InputServiceV5A() {
		scan = new Scanner(System.in);
		numList = new ArrayList<NumberVO>();
	}

	public void inputNum() {
		System.out.println("숫자를 입력하시오");
		System.out.println("정수1 >>");
		Integer intNum = scan.nextInt();
		
		while(true){
			System.out.println("첫 숫자보다 작은 수를 입력하시오");
			System.out.println("정수2 >>");
			Integer intNum2 = scan.nextInt();
			try {
				if(intNum2 > intNum) {
				}
			} catch (Exception e) {
				System.out.println("첫 정수보다 작은 수 입력 바람");
			}
			
		}
		
		
	}

}
