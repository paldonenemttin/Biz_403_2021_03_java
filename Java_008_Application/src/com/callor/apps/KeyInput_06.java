package com.callor.apps;

import java.util.Random;
import java.util.Scanner;

/*
 * 임의의 수 1 ~ 10까지 정수 1개를 만들고
 * 키보드로 숫자를입력받아서
 * 임의로 생성된 숫자를 맞추는 게임
 */
public class KeyInput_06 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);
		
		int rndNum = rnd.nextInt(10)+1;
		int nCount = 0;
		
		while(true) {
			
			if(nCount > 5) {
				System.out.println("존나 못하네 ㅋㅋ");
				System.out.println("야 다시 해봐");
				nCount = 0;
				rndNum = rnd.nextInt(10)+1;
			}
			
			System.out.println("1부터 10까지 숫자 하나 맞춰보셈");
			System.out.print(">");
			int intputNum = scan.nextInt();
			
			if(intputNum == rndNum) {
				nCount = 0;
				System.out.println("올 ㅋ ㅊㅊ");
				System.out.println("계속할거임? (ㅇㅇ: 1, ㄴㄴ: 0)");
				System.out.println(">");
				int yesNo = scan.nextInt();
				if(yesNo < 1) {
					break;
				} else {
					rndNum = rnd.nextInt(10)+1;
				}
				
				
			} else if(intputNum < rndNum) {
				System.out.println("ㅄ 것보다 큼");
				nCount++;
			} else if(intputNum > rndNum) {
				System.out.println("ㅄ 것보다 작음");
				nCount++;
			}
		}
		System.out.println("쫑");
	}
	

}
