package com.callor.reload.service;

public class PrimeServiceV3 extends PrimeServiceV1 {

	public void primeNum() {

		int intNum = rnd.nextInt(51) + 50;

		// for() 반복문이 중단 되었는가(break)
		// 아니면 모두 수행했는가
		int index = 0;
		for (index = 2; index < intNum; index++) {
			if (intNum % index == 0) {
				break;
			}
		}
		// for() 끝났을때
		// break 되었을때와
		// 항상 index < intNum
		// 그렇지 않을 경우를 확인하여 코드 진행
		// index == intNum이 된다

		if (index < intNum) {
			System.out.printf("%d는 소수", intNum);
		} else {
			System.out.printf("%d는 소수 아님 ", intNum);
		}
	}

}
