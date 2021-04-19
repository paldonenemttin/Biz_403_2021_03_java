package com.paldonenemttin.standard.impl;

import java.util.Scanner;

import com.paldonenemttin.standard.InputService;

/*
 * 인터페이스를 implements한 클래스는
 * 이름을 지을때 접미사에 보통Impl을 붙인자
 * 
 *  인터페이스 impl한 클래스는
 *  인터페이스에 설계된 추상메서들르 "반드시" 구체적인
 *  코드로 구현해야 한다
 *  
 *  마약 아직 구체적인 코드가 구현되지 않았더라도
 *  method의 형태는 삭제 불가능
 *  
 *  이러한 규칙을 적용하여 다른클래스와 연동할때
 *  편리하고 오류가 없도록 하기 위함이다.
 */

public class inputServiceImplV1 implements InputService {

	protected Scanner scan;
	public inputServiceImplV1() {
	 
		scan = new Scanner(System.in);
	}
	
	@Override
	public Integer inputValue(String title) {
		// TODO Prompt 타이틀을 보여주고 정수 입력받기
		while(true) {
			System.out.println(title + "입력 하십쇼(QUIT는 입력중단)");
			System.out.print(">>");
			String strIn = scan.nextLine();
			if(strIn.equals("QUIT")) {
				System.out.println("입력중단");
				return null;
			}
			Integer intIn = null;
			try {
				 intIn = Integer.valueOf(strIn);
			} catch (NumberFormatException e) {
				System.out.println("정수나 QUIT만 입력");
				continue;
			}
			return intIn;
		}//end while
		
	}

	@Override
	public Integer inputValue(String title, int start) {
		// TODO 시작값을 갖는 유효성 검사 추가한 method
		title = String.format("%s(%d이상)",title , start);
		while(true) {
			//intIn에 저장된 값 == inputValue(String title)이 return 해준 값
			Integer intIn = this.inputValue(title);
			if(intIn != null) {
				if(intIn < start) {
					System.out.printf("입력값은 %d 이상으로",start);
					continue;
				}
			}
			return intIn;
		}//end while
		 
	}

	@Override
	public Integer inputValue(String title, int start, int end) {
		// TODO 제목, 시작값, 종료갑승로 유효성 검사method
		
		title = String.format("%s (%d ~ %d범위의)",title,start,end);
		while(true) {
			Integer intIn = this.inputValue(title);
			if(intIn != null) {
				if(intIn > 100 || intIn < 0) {
					System.out.printf("범위는 %d~ %d입니다",start, end);
					continue;
				}
			}
			return intIn;
		}//end while
		
	}

}
