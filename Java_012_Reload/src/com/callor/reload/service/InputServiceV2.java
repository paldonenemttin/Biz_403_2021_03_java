package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputServiceV2 {

	protected Scanner scan;
	protected List<Integer> intList;
	// 클래스 영역에 선언된 변수는 맴버 변수라고 하고
    // 맴버변수는 이 클래스의 어떤 method에서든
	// 자유롭게 접근하여 저장, 읽기 가능하다

	public InputServiceV2() {
		scan = new Scanner(System.in);
		intList = new ArrayList<Integer>();

		// method의 {} 에 선언된 변수는 지역번수하고 함
		// 지역변수는 {}를 벗어나면 변수가 소멸
		// {} 가 서로 다르면 이름은 같아도 접근 불가
		// 맴버 변수에 같은 이름의 변수가 있는데
		// 지역 변수에 같은이름으로 변수를 또 선언하면
		// 맴버 변수는 감춰져서 접근 불가
	}

	

	public void intputNum() {

		while (true) {
			System.out.println("결과 값을 볼려면 50부터 150까지의 정수 하나를 입력 해야한다지?");
			System.out.print("여기가 정수를 입력하는 곳이라네^^>>");
			Integer num = scan.nextInt();
			if (num < 50 && num > 150) {
				intList.add(num);
				break;
			} else {
				System.out.println("50부터 150까지만 입력을 해야 한다네^^");
			} continue;

		}

	}
}
