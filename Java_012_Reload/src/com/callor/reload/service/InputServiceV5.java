package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.reload.model.NumberVO;

public class InputServiceV5 {

	protected Scanner scan;
	protected List<NumberVO> numList;

	public InputServiceV5() {
		scan = new Scanner(System.in);
		numList = new ArrayList<NumberVO>();
	}

	public void inputNum() {
		Integer intNum1 = 0;
		Integer intNum2 = 0;
		while (true) {
			System.out.println("숫자 입력하시오");
			System.out.println("정수 >>");
			String strNum1 = scan.nextLine();
			try {
				intNum1 = Integer.valueOf(strNum1);
			} catch (Exception e) {
				System.out.println("숫자만 입력");
				continue;
			}

			System.out.println("정수2 >>");
			String strNum2 = scan.nextLine();
			try {
				intNum2 = Integer.valueOf(strNum2);
			} catch (Exception e) {
				System.out.println("숫자만 입력");
				continue;
			}
			try {
				if(intNum2 > intNum1) {
					
				}
			} catch (Exception e) {
				System.out.println("두번째 값은 첫번째 값보다 작아야 합니다");
				continue;
			}
			NumberVO numbervo = new NumberVO();
			numbervo.setNum1(intNum1);
			numbervo.setNum2(intNum2);
			numList.add(numbervo);
		}
		
		
		

	}

}
