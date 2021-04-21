package com.callor.app;

public class ScoreVO {
	
	private String strNum;
	private Integer kor;
	private Integer eng;
	private Integer meth;
	
	private Integer avg;
	private Integer total;
	
	public String getStrNum() {
		return strNum;
	}
	public void setStrNum(String strNum) {
		this.strNum = strNum;
	}
	public Integer getKor() {
		return kor;
	}
	public void setKor(Integer kor) {
		this.kor = kor;
	}
	public Integer getEng() {
		return eng;
	}
	public void setEng(Integer eng) {
		this.eng = eng;
	}
	public Integer getMeth() {
		return meth;
	}
	public void setMeth(Integer meth) {
		this.meth = meth;
	}
	public Integer getAvg() {
		return avg;
	}
	public void setAvg(Integer avg) {
		this.avg = avg;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "ScoreVO [strNum=" + strNum + ", kor=" + kor + ", eng=" + eng + ", meth=" + meth + ", avg=" + avg
				+ ", total=" + total + "]";
	}
	
	

}
