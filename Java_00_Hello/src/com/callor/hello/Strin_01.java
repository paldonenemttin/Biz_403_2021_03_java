package com.callor.hello;

public class Strin_01 {

	public static void main(String[] args) {
		
		
		//문자열 ""로 감싸진 
		//  String형 값(데이터, 자료)
		//  String형 리터럴
		System.out.println("대한민국");
		System.out.println("");
		System.out.println("");
		
		//문자열과 문자열의 플러스 연산
		// 문자열을 서로 연결하는연산결과
		//문자열 연결 연산이라고 한다.
		System.out.println("대한" +"민국");
		
		// 문자열과 숫자의 연결 연산
		System.out.println("3+4="+ 3 + 4 );
		System.out.println("3+4=" +(3+4));
		
		System.out.println("3 x 4=" + 3+4);
		
		/*
		 * 문자열은 문자열끼리 플러스 연산이 가능
		 * => 문자열을 연결하여 하나의 문자열로 만든다
		 * 
		 * "문자열 + 문자열 => "문자열문자열"
		 * "문자열" + 3=> "문자열" + "3"
		 *    => 문자열3
		 *    
		 *    "문자열" + 3 + 4
		 *    =>"문자열" + "3" +4
		 *    => " 문자열3"
		 *    =>"문자열3" +"4"
		 *   
		 *    =>문자열 34
		 *    
		 *    "문자열"+ 3 + 4
		 *    => "문자열" + 12
		 *    => "문자열" +"12"
		 *    => "문자열12"
		 *   
		 */
		
		System.out.println(" 3 - 4 = " + (3 - 4));
		

	}

}
