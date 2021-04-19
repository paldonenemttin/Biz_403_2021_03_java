package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.reload.model.NumberVO;

public class InputServiceV4 {
	
	Scanner scan;
	List<NumberVO> numList;
	
	public InputServiceV4() {
		scan = new Scanner(System.in);
		numList = new ArrayList<NumberVO>();
	}
	
	public void intputNum() {
		
			System.out.println("정수 입력");
			System.out.println("정수 1 >");
			String strNum = scan.nextLine();
			Integer intNum = Integer.valueOf(strNum);
			
			System.out.println("정수2 >> ");
			String strNum2 = scan.nextLine();
			Integer intNum2 = Integer.valueOf(strNum2);
		
		NumberVO vo = new NumberVO();
		vo.setNum1(null);
		vo.setNum2(null);
		numList.add(vo);
		
	}
	
	
	public void printNum() { 
		for(int i = 0; i < numList.size();i++) {
			NumberVO vo = numList.get(i);
			//System.out.println(vo.getNum1()+"\t");
			//System.out.println(vo.getNum2());
			this.printNum();
		}
	}
	public void printNum(NumberVO vo) { 
		System.out.println(vo.getNum1() + "\t");
		System.out.println(vo.getNum2());
	}

}
