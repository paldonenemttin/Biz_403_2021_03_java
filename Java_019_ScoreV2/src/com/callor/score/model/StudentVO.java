package com.callor.score.model;

public class StudentVO {
	
	private String num;
	private String name;
	private String subject;
	private String grade;
	private String add;
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "StudentVO [학번=" + num + ", 이름=" + name + ", 학과=" + subject + ", 학년=" + grade + ", 주소=" + add
				+ "]";
	}
	
	
	
	
	
	
	

}
