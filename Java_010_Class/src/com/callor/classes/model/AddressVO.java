package com.callor.classes.model;

public class AddressVO {
	
	private String name;
	private String addr;
	private String tel;
	private Integer age;
	/*
	 * age변수에 값을 저장하려면
	 * 반드시 setAge(setter() method)를 통해서값을 저장해야 함
	 * 
	 * setAge() method는 매개변수로 받은 나를 
	 * 유효성 검사를 수행한 다음
	 *       유효한 버무이에 있지 않으면 null을 저장하여
	 *       
	 */
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public void setName() {
		this.name = name;
	}
	
	public void setAddr() {
		this.addr = addr;
	}
	
	public void setTel() {
		this.tel = tel;
	}
	
	
	//private로 선언된 변수를 외부에서 읽을 수있도록 일부 제한적으로 개방
	public String getName() {
		return this.name;
	}
	
	public String getAddr() {
		return this.addr;
	}
	public String getTel() {
		return this.tel;
	}
	
	public Integer getAge() {
		return this.age;
	}

}
