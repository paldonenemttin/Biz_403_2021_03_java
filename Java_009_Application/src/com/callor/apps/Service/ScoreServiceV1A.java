package com.callor.apps.Service;

import java.util.Scanner;

public class ScoreServiceV1A {

	// 클래스 영역에 Scanner 클래스를 사용해 Scan 객체를 선언
	// null PointerException
	// JDK 또는 여러가지 클래스를 가져와 사용하는 경우 매우 자주 만나는 Exception
	//클래스를 사용하여 객체를 "선언만"아직 사용할 준비가 되어 있지 않다
	//사용할 준비가 되어있지 않다 == 생성, 초기화가 안되었다
	Scanner scan = new Scanner(System.in);
	// scan 객체를 생성(초기화)하기
	// 객체를 선언하고 생성하는 코드가 없으면 사용하는 과정에서 눌 포인터익셉션이 발생
	int[] intKor;
	int[] intEng;
	int[] intMath;

	int[] intSum;
	float floatAvg;

	/*
	 * Service 클래스에서 배열의 갯수를 고정하지 말고 최초로 객체를 생성할때 필요한 갯수를 매세변수로 전달하고 전달받은 매개변수
	 * (members) 가밧
	 */
	public ScoreServiceV1A() {
		
		intKor = new int[5];
		intEng = new int[intKor.length];
		intMath = new int[intKor.length];
		
		intSum = new int[intKor.length];
		floatAvg = intSum[intKor.length] / 3;
		
	}

	public void makeScore() {

		/*
		 * 무한 반복문ㅇ르 사용하여 국어점수가 영부터 100 범위를 벗어나면 메시지를 보여주고 다시 점수를 입력받고록한다 만약 정상적인 범위를
		 * 입력하면 반복문을 종료하고 다음 코드가 실행되도록 한다
		 */

		int num1 = 0;

		System.out.println("다음 학생 5명의 국어점수를 입력하시오(0~100)");
		for (int i = 0; i < intKor.length; i++) {
			num1++;
			if (intKor[i] < 0 || intKor[i] > 100) {
				System.out.printf("학생%d >", num1);
				intKor[i] = scan.nextInt();
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}

		int num2 = 0;
		System.out.println("다음 학생 5명의 영어 점수를 입력하시오");
		for (int i = 0; i < intKor.length; i++) {
			num2++;
			if (intEng[i] <= 100) {
				System.out.printf("학생%d >", num2);
				intEng[i] = scan.nextInt();
			} else {
				System.out.println("잘못 입력하셨습니다 0~ 100까지만 입력하세요");
			}

		}
		int num3 = 0;
		System.out.println("다음 학생 5명의 수학 점수를 입력하시오");
		for (int i = 0; i < intKor.length; i++) {
			num3++;
			if (intMath[i] <= 100) {
				System.out.printf("학생%d >", num3);
				intMath[i] = scan.nextInt();
			} else {
				System.out.println("잘못 입력하셨습니다");
			}
		}
	}

	/*
	 * public : 전체 공용 모두 누구나 객체.addNum() 형식으로 method를 호출하여 명령을 실행 할 수 있도록 하는 키워드
	 */
	public void addNum() {
		this.inputScore();

		// 햔제 method 코드의 끝이다라는 선언
		// method 선언 키워드가 보이드이면
		// 리턴영
		return;
	}

	/*
	 * private :개인적인 현재 클래스에서만 method를 호출하여 명령을 실행 할 수 있도록 하는 키워드 객체 인풋스코어() 형식으로
	 * 사용불가 외부에 공개하지 않고 현재 클래스의 코드에서만 호출할 수 있도록 제한하는 키워드
	 */
	// Integer : void keyword 대신 정수를 선언하는 키워드를 사용하여 method 사용하기
	// method 코드 끝에 반드시 return 명령문이 있어야 한다
	// 여기서 사용된 인티저 키워드는 변수를 선언하는 용도의 키워드가 아니고 teturn 키워드라고 한다
	// method 코드 내에" return 값;" 형식의 코드가 반드시 있어야 함을 선언하는 것
	// return type 이 void형(type)일 경우는
	// return 명령문이 생략되거나 return 명령문만단독으로 사용할 수 있다

	// return type이 void 형이 아닌 경우 return 명령문을 반드시 코드 내에 적절한 위치에 있어야 하고
	// return 값 형식으로 사용해야 한다.
	private Integer inputScore() {
		return 0;

	}

	public String names() {
		return " 홍길동";
	}

	public int add() {
		return 0;
	}

	public float addFloat() {
		return 0.0F;
	}

	public long addLong() {
		return 0L;
	}

}
