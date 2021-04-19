package com.callor.controller;

public class Cont_03 {
	
	public static void main(String[] srgs) {
		
		for(int i = 0 ; i <10 ; i ++) {
			
			System.out.println(i);
		}
		
		/*
		 * i==와 i + 1 차이
		 * 1.  변수 i 의 저장된 값이 변경되느냐 아니냐
		 * 
		 * i ++ : i 에 저장된 값이 1증가하는 값으로 변경
		 *       변경된  i 값을 다른 명령에서 사용하려고 할때
		 *       for() 반복문 내에서 i++를 사용할때는 
		 *       매우 주읠를 해야 한다
		 *       for() 반복문의 반복 횟수가 변경되어 버린다
		 *       
		 * i + 1 : 1의
		 */
		for(int i = 0 ; i <10 ; i ++) {
			
			System.out.println(i=1);
		}
		System.out.println("========================");
		for(int i = 0 ; i <10 ; i ++) {
			
			System.out.println("우리나라");
		}
		
	    for(int i = 0 ; i <10 ; i ++) {
	    	int sum = i = 1;
				System.out.println("대한민국");
			}
	    
	    System.out.println("===================");
        for(int i = 0 ; i <10 ; i ++) {
			i ++;
			System.out.println(i);
		}
        
        System.out.println("===================");
        for(int i = 0 ; i <10 ; i += 2) {
			System.out.println("Republic of Korea");
		}
        
        System.out.println("===================");
        /*
         * for() 반복문내에서 i ++
         * {for 본문 명령문} 내에서 i--를 실행했다
         * 이런상황이 되면 ㅑ값은 ㅑ < 10 조건에서
         * 항상 트루인 상태가 되어
         * 무한 반복되는 코드가 됌
         */
        for(int i = 0 ; i <10 ; i ++) {
			i --;
			System.out.println("대한민국 만세");
		}
		} 
	}

