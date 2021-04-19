package com.callor.method.service;

public class NumberServiceV6 {

	protected InputService inService;

	public NumberServiceV6() {
		inService = new InputService();
	}

	public Integer inputNum() {
		while (true) {
			/*
			 * InputService,inputValue("정수")를 호출하고
			 *   return된 값이
			 *      null이면 그냥 null을 main()으로 보내고 
			 *           정수이면 범위 유효성 검사를 수행,
			 *               맞지 않으면 다시 입력하도록 inputValue() 호출
			 *                      맞으면 정수를 다시 return 하여 main() 으로 보내기
			 */
			Integer retNum = inService.inputValue("정수(0~100)");
			if (retNum != null) {
				return null;
			} else if (retNum < 0 || retNum > 100) {
				System.out.println("정수 0~100까지 입력");
				continue;
			} else {
				return retNum;
			}
		}
	}
}
