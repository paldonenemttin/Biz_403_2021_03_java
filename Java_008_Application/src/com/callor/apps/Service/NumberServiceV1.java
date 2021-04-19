package com.callor.apps.Service;

import java.util.Scanner;

public class NumberServiceV1 {
	
	int intNum;
	Scanner scan;
	public NumberServiceV1() { 
		scan = new Scanner(System.in);
	}
	
	public void inputNum() {
		
		System.out.println("정수를 입력하시오");
		System.out.println(">");
		intNum = scan.nextInt();
		
		// main() method가 아닌 곳에서 Scanner를 사용하는 경우
		// 사용이 끝나면 close()를 하자
		//  이제는 Scanner 사용이 끝났으니
		// Resource(자원)을 반납하겠다
		
	}
	
	public void CheckEven() {
		System.out.println(LinesService.dLines(20));
		if(intNum % 2 == 0) {
			System.out.printf("%d는 짝수", intNum);
		} else {
			System.out.printf("%d는 짝수 아님" , intNum);
		}
	}
	
	public void CheckPrime() {
		System.out.println(LinesService.dLines(20));
		int num = 0;
		for( num = 2 ;num < intNum ; num++) {
			if(intNum % num == 0) {
				break;
			}
			if(num < intNum) {
				System.out.printf("%d는 소수가 아님/n",intNum);
			} else {
				System.out.printf("%d는 소수\n",intNum);
			}
			
		}
	}

}
