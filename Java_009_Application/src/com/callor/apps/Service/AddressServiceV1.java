package com.callor.apps.Service;

import com.callor.apps.medel.AddressVO;

public class AddressServiceV1 {
	/*
	 * name, email,phone 3개의 매개 변수를 통해
	 * 문자열로 전달받고 전달받은 문자열을  Console에 출력하기
	 */
	public void printAddress(String name, String email, String phone) {
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(phone);
	}
	
	// AddressVO 클래스를 매개 변수로 받는 method
	public void printAddress(AddressVO adVO) {
		
		System.out.println(adVO.name);
		System.out.println(adVO.email);
		System.out.println(adVO.chain);
		System.out.println(adVO.address);
		System.out.println(adVO.cellphone);
	}

}
