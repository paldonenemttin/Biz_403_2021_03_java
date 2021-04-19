package com.callor.classes.model;
/*
 * 매입매출 관리를 위해
 * 수량,매입단가 매출단가 상품이름 거래처 매입매출구분 거래일자
 * 데이터가 필요
 * 수향 매입단가 매출단가는 곱셈연산이 필요한 데이터
 */
public class IolistVO {
	
	private String name;//상품이름
	private String com;//거래처
	
	private Integer num;//수량
	private Integer buy;//매입단가
	private Integer sell;//매출단가
	private Integer divide;// 매입매출 구분
	private Integer day;// 거래일자
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getCom() {
		return com;
	}
	public void setCom(String com) {
		this.com = com;
	}
	
	
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	
	
	public Integer getBuy() {
		return buy;
	}
	public void setBuy(Integer buy) {
		this.buy = buy;
	}
	
	
	public Integer getSell() {
		return sell;
	}
	public void setSell(Integer sell) {
		this.sell = sell;
	}
	
	
	public Integer getDivide() {
		return divide;
	}
	public void setDivide(Integer divide) {
		this.divide = divide;
	}
	
	
	public Integer getDay() {
		return day;
	}
	public void setDay(Integer day) {
		this.day = day;
	}
	
	
	

}
