package com.paldonenemttin.standard;

/*
 * interface
 * java언어를 사용하는 프로젝트를 구현할때
 * 모든 코드는 클래스를 기초로 만들어진다
 * 클래스를 만들기 위해스는 여러 조건에 맞도록 설계 해야 한다
 * 설계를 하고 설계된 내용으로 문서화를 하는데
 * 실제 개별 현장에서 문서화 된 설계 내용은
 * 잘 지켜지지 않는 경우가 있다
 * 
 * 그러한 상황이 많아지면
 * 여러 클래스가 연동되는 프로젝트의 경우
 * 특히 method의 이름을 잘못 지어(다르게 지어) 
 * 코드 연결(연동)이 어려워 진다
 * 
 * 인터페이스는 여러 개발들이 협업을 할때
 * 클래스, method 규칙을 코드로 구현하여
 * 클래스를 만들대 반드시 implements하도록 강제한다
 * 인터페이스를 impl 한 클래스는 인터페이스에 설계된 
 * 추상 메서드를 반드시 자신이 만들 클래스에서 구현해야 한다
 * 그렇나 규칙을 강제 하므로써 연결(연동)의 혼란을 최소화 하는 것이다.
 * 
 * 
 * 
 * 키보드로 정수를 입력받기 위한 나의 클래스
 * 키보드로 정수를 입력받으면서
 * QUIT를 입력 받으면 입력을 취소하고 null을 return
 * 정수를 입력 받으면 정수값을 return
 */
public interface InputService {
	
	public Integer inputValue(String title);
	public Integer inputValue(String title, int start);
	public Integer inputValue(String title, int start, int end);

}
