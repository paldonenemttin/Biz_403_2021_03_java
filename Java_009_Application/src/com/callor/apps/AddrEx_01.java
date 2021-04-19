package com.callor.apps;

import com.callor.apps.Service.AddressServiceV1;
import com.callor.apps.medel.AddressVO;

public class AddrEx_01 {
	/*
	 * Java에서는 변수명, 클래스명, method명, 객체명 등을
	 * 모두 한글로 작성 가능
	 * 팀프로젝트를 할때는 혼자 만드는 프로젝트가 아니다 보니
	 * 이름들을 지을때 프로젝트 규칙을 따라야 한다,
	 * 
	 * 일부에서 한글로 변수명 등을 지으면
	 * 코드에서 문제가 발생한다 라고 하지만
	 * 근거 없는 이야기
	 * 
	 * 다만 한글로 이름을 짓게 되면 CamelCase 방식의 명명이
	 * 힘들어 코드작성이 다소 어려워진다
	 * 
	 */
	public static void main(String[] args) {
		// 설계된 VO 클래스를 사용하여 홍길동 객체를 생성
		AddressVO 홍길동 = new AddressVO();
		
		//객체의 맴버 변수에 값을 저장
		홍길동.name = "홍길동";
		홍길동.cellphone = "123-5678-6491";
		홍길동.email = "dkasfjd@dkefd.com";
		홍길동.chain = "지인";
		홍길동.address = "모스크바";
		
		AddressServiceV1 ssV1 = new AddressServiceV1();
		
		ssV1.printAddress("홍길동", "callor", "123-5678-6491");
		System.out.println("====================================");
		ssV1.printAddress(홍길동);
		}

}
