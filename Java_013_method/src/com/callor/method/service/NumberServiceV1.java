package com.callor.method.service;

import java.util.Random;

public class NumberServiceV1 {
	
	Random rnd;
	int intNum;
	public NumberServiceV1() {
		rnd = new Random();
	}
	/*
	 * Random 수를 생성하여 3의 배수이면 그 수를 아니면 null을 return
	 *                                             ==> 반드시 어떤 값을 return하라
	 * 대표값으로 어떤 type의 값을 return 할 것인가
	 * 생성한 수가 1 ~ 100까지 정수형 난수
	 * 3의 배수이면서 정수인 값을  return하라
	 * 정수형 3의 배수를 return하라
	 * 
	 * return type을  void가 아닌 정수형 type으로 지정해야 하낟 int 와 Integer가 있다
	 * 
	 * return 의 두번째 조건에 아니며 ㄴ null값을 return 하라는 지시가 있으므로  int 형은 사용 부락
	 * 
	 * void 키워드 
	 * method에 return명령이 꼭 없어도 되는 경우
	 * 
	 * 이 매서드는 정수형 3의 배수 또는 null 값을 return해야 하기 때문에 Integer형
	 * return type을 설정해야 한다
	 * void 대신 Integer를 사용한다
	 * 
	 * void 대신  Integer를 사용하면 반드시  return 명령문과 
	 * return 할 값(대상)이 코드에 있어야 한다
	 * 아직 method에 return문이 없기 대문에 오류가 발생
	 *  method에 오류가 나는 것을 없애기 위해 return문을 추가한다
	 *  이method는 return 명령문 만으로 처리가 되지 않고 반드시  return할 값(대상이 있어야 함)
	 *  
	 *  primitive type 중에 숫자형인 경우느 `을 
	 *  wrapper 클래스 type을 사용하는 경우는 null을 보통 사용한다
	 * 
	 */
	public Integer inputNum1() {
		Random rnd = new Random();
		
		Integer num1 = rnd.nextInt(100)+1;
		int num2 = rnd.nextInt(100)+1;
		
		if(num1 % 3 == 0) {
			return num1;
		}
		if(num2 % 3 == 0) {
			/*
			 * 현재 inputNUm() method의  return type은 Integer이다
			 * 그런데 return 하는 num2 변수의 타입은 int형이다
			 * 별 다른 문제를 일으키진 않지만 실제 코드가 작동되면
			 * int 형을 Integer wrapper 클래스 형으로 변환하는 과정이 일어남
			 */
			return num2;
		}
		return null;
		
		
	}
	
	
	public void inputNum() {
		intNum = 0;
		System.out.println("=".repeat(20));
		System.out.println("3의 배수");
		System.out.println("=".repeat(20));
		while(true) {
			intNum = rnd.nextInt(100)+1;
			if(intNum % 3 == 0) {
				
				System.out.println(intNum);
			} else {
				return;
			}
		}
		
	}
	
	

}
