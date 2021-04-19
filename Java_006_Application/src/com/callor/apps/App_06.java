package com.callor.apps;

public class App_06 {
	
	public static void main(String[] args) {
		//for() 중첩하기
		// for(int i) 가 한번 반복 할때마다
		//안족 for(int i)가 5번 반복하라
		int nCount = 0;
		for(int i = 0 ; i < 5 ; i++) {
			
			for(int j = 0 ; j < 5 ; j++) {
				
				System.out.println(++nCount);
			}
			
		}
		System.out.println("=========================");
		for(int i = 0 ; i < 5 ; i++) {
			
			for(int j = 0 ; j < 5 ; j++) {
				System.out.println(" * ");
			}
			System.out.println();
			
	}


	System.out.println("===================");	
	for(int i = 0 ; i < 5 ; i++) {
		
		for(int j = i ; j < i + 1 ; j++) {
			System.out.println(" * ");
		}
		System.out.println();
		
  }
	System.out.println("===================");	
	for(int i = 0 ; i < 5 ; i++) {
		
		for(int j = i ; j < 5 ; j++) {
			System.out.println(" * ");
		}
		System.out.println();
		
}


}
}