package com.paldonenemttin.study;

import java.util.Scanner;

public class Max {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("세 정수의 최댓값");
		System.out.print("a의 값 : "); int a = scan.nextInt();
		System.out.print("b의 값 : "); int b = scan.nextInt();
		System.out.print("c의 값 : "); int c = scan.nextInt();
		
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		
		System.out.println("최댓값은" + max + "입니다");
	}

}
