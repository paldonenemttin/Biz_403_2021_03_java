package com.paldonenemttin.study;

import java.util.Scanner;

public class Median {
	// 결정트리
	static int med3(int a, int b, int c) {
		if(a >= b)
			if( b >= c)
				return b;
			else if(a <= c)
				return a;
			else
				return c;
		else if(a>c)
			return a;
		else if(b > c)
			return c;
		else
			return b;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("세 정수의 중앙 값");
		System.out.print("a의 값 : ");
		int a = stdIn.nextInt();
		System.out.print("b의 값 : ");
		int b = stdIn.nextInt();
		System.out.print("c의 값 : ");
		int c = stdIn.nextInt();
		
		System.out.println("중앙 값은 " + med3(a, b, c) + "인데 뭐 불만있냐");
		System.out.println("물도 있음!");
	}

	
}
