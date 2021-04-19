package com.callor.classes.service;

public class ValueService {
	/*
	 * 클래스의 맴버변수를 public으로 선언하는것은
	 * 매우 위험한 코드이다
	 * 어떤 이유로든 public으로 된 맴버 변수는
	 *      값이 변경될 수 잇다
	 *      원하느 않는 값으로 변수 내용이 오염될 수 있다
	 * 그러한 현상을방지하기 위해
	 * 맴버변수는 가급적 private로 선언을 하고
	 * 맴버변수값을 객체.변수 형식으로 읽어내고자 할때는
	 * getter() method를 만들어 주는 것이 좋다
	 * == 정보의 은닉
	 */
	private int retNum;
	public int getRetNum() {
		return retNum;
	}
	
	public void nums() {
		// nums method는 어떤 연산을 수행하고
		// 그 결과값은 100을 호출한 곳에 return 하고 싶다
		// void method에서는 값을 return할 수 없다
		// 맴버 변수를 선언하고 맴버변수에 값을 저장해 두었다
		retNum = 100;
	}
	
	public Integer numsRet() {
		return 100;
	}

}
