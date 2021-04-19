package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * InputSrviceV1 class 클래스 영역에 List<Integer>intList 리스트 객체 선언
 * 키보드 입력 받기 위한  Scanner scan 객체 선언
 * 클래스생성자에서  intList,scan 객체 생성(초기화)
 * intputNum() method를 선언하고 키보드로 정수를 입력 받아
 * intList객체에 추가(add) 하는 코드 작성
 * Prompt 등을 적절히 추가하여 작성
 * printNum() method를 선언하고 입력된 리스트를 출력하는 코드 작성
 */

/*
 * Service 클래스
 *  어디선가(main() method)에서
 *  객체로 선언, 생성한 후
 *  method호출을 통해 명령을 실행하는 클래스
 */
public class InputServiceV1 {
	 
	//정수형 데이터들을 담을 리스트형 객체
	// Integer wrapper클래스형 데이터들을 담을 리스트
	
	// 맴버변수들 : 클래스 영역에 선언된 객체들
	// 접근 제한자
	// private: 나 혼자 단독으로 사용할때
	// protected: 이 클래스를 누군가 상속하여 사용할 수 있도록 하기 위해서
	
	protected List<Integer>intList;
	protected Scanner scan;
	// 선언만 된 객체는 코드(method)를 호출하여 기능을 수행 못함
	// 반드시 생성(초기화)를 해 주어야 함
	// 현재 Service 클래스의 생성자 method에서 수행을 한다
	public InputServiceV1() {
		// TODO InputServiceV1의 생성자 method
		intList = new ArrayList<Integer>();
		scan = new Scanner(System.in);
	}
	
	// method의 선언문
	// 클래스에 선언하는 기본 type의 method
	// {  } : 블레이드 , 코드블럭
	// 코드블럭( {  } )에 연산을 수행하는 코드를 작성하고
	// 그 코드들의 묶음을 inputNum이라고 하겠다하는 선언
	public void inputNum() {
		
		System.out.println("정수 하나를 입력하시오");
		System.out.println("정수 >>");
		Integer num = scan.nextInt();
		
		//키보드로 입력받은 정수를 intList에 추가
		intList.add(num);
	}
	
	public void printNum() {
		
		for(int i = 0; i < intList.size(); i++) {
			Integer num = intList.get(i);
			System.out.println("정수 : " + num);
		}
	}
	
	

}
