package com.callor.reload.service;

public class PrimeServiceV2 extends PrimeServiceV1{
	
	//자동으로 protected로 선언된 객체, 변수는 상속 받은 곳에서 사용 할 수 있다
	
	public void primeNum() {
		int intNum = rnd.nextInt(51)+50;
		
		boolean notPrime = false;
		
		for(int i = 2 ; i < intNum ; i++) {
			
			if(intNum% i ==0) {
				notPrime = true;
				break;
			}
			
		}
		if(notPrime) {
			System.out.printf("%d는 소수가 아님" , intNum);
		}else {
			System.out.printf("%d는 소수" , intNum);
		}
	}

}
