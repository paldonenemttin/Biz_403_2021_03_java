package com.callor.reload.service;

public class PrimeServiceV5 extends PrimeServiceV4 {

	@Override
	public void PrimeNum() {
		int index = 0;
		int rndNum = 0;
		for (index = 0; index < 50; index++) {
			rndNum = rnd.nextInt(51) + 50;
			if(rndNum % index == 0) {
				break;
			}
		}
		if(index >= rndNum) {
			intList.add(rndNum);
		}
	}

}
