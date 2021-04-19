package com.callor.apps.medel;
/*
 *  주소록 관리를 위한 프로젝트를 수행하기 위해
 *  주소록 데이터를 저장할 클래스를 설계하기
 *  
 *  이름. 전화번호, 주소, email, 관계, 나이, SNS
 *  
 *  추상화 단계
 *  지금 내가 만들고자 한느 프로젝트에서 어떤 데이터가
 *  반드시 필요한가, 또는 없어도 되는 무엇인가를 판단하여 간추려내는 작업
 *  이름, 휴대전화, email, 나와의 관계, 주소
 *  
 *  VO 클래스
 *   Value Object : 데이터를 저장하는 용도의 객체
 *   DTO(Data Transfer Object)
 */
public class AddressVO {
	
	/*
	 * 추상화과정을 거쳐 간추려진 데이터를저장한 변수 선언
	 */
	
	public String name;
	public String cellphone;
	public String email;
	public String chain;
	public String address;
	

}
