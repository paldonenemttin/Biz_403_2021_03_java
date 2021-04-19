package com.callor.apps.service;

public class ScoreEx_02 {
	
	public static void main(String[] args) {
		
		// 한번 선언하고 코딩된 클래스는 어디서든 인스턴스로 생성하면
		//클래스에 만들어진 코드를 호출하여 명령 수행이 가능
		ScoreService sService = new ScoreService();
		
		// ScpreService 클래스의 makeScore() 메서드를
		// 호출하여 무언가 실행한다
		sService.makeScore();
		sService.printScore();
		
		ScoreService sSv1 = new ScoreService();
		sSv1.makeScore();
		sSv1.printScore();
		
		ScoreService sSv2 = new ScoreService();
		sSv2.makeScore();
		sSv2.printScore();
	}

}
