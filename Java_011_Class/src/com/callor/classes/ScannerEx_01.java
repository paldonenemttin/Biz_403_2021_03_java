package com.callor.classes;

import java.util.Scanner;

public class ScannerEx_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("숫자 하나를 입력");
		
		int intNum1 = 0;
		int intNum2 = 0;
		/*
		 * try - catch block, 명령문
		 * 
		 * 코드가 실행되는 과정에서
		 * 어떠한 이유든지 예외가 발생할 것으로 예측이 되면
		 * try - catch block을 사용하여" 예외처리"를 수행
		 * 
		 * 예외처리
		 * exception이 발생하여 코드가 중단되는 것을 방지하는기법
		 * 
		 * exception이 발생하면 코드가 중단 되면서 
		 *            현재 기억장치(변수, 배열...)에 저자된 모든데이터는 소멸되어 버린다
		 * exception이 발생했을때 사용자에게 exception이 발생했음을 알려주고
		 *            그 상황을 피해서 다시 코드 진행이 계속되도록 하는 기법
		 *            
		 * 예외가 발생할 거 같은 코드들ㅇ르 
		 * try {} block에 작성을 하고 실행을 하면 만약 exception이 발생했을때
		 *             catch명령이 exception을 잠시 잡고 있는 상황이된다
		 * catch {} block exception발생했을때
		 *             사용자에게 알려주는메시지등을 보여주거나
		 *             다른 코드를 사용하여 처리할 수 있으면
		 *             처리를 하고 코드가 다시 진행되도록 한다
 		 */
		try {
			System.out.print("숫자1 >");
			intNum1 = scan.nextInt();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("숫자만 입력하셈");
		}
		System.out.println("입력된 숫자" + intNum1);
//			System.out.println("숫자2 >");
//			intNum2 = scan.nextInt();
//
//			System.out.printf("%d x %d = %d", intNum1, intNum2, intNum1 * intNum2);

	}

}
