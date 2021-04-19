package com.callor.apps;

import com.callor.apps.Service.ScoreServiceV5;

public class App_05 {
	
	public static void main(String[] args) {
		
		//ssV5 객체를 선언하고 생성자를 호출하여
		//       인스턴스화 하는 코드
		// 객체는 인스턴스가 되어야 포함도니 코드(method)를 호출할 수 있다
		ScoreServiceV5 ssV5 = new ScoreServiceV5(10);
		/*
		 * ssV5.makeScore() 명령이 실행되면
		 * Score.V5 클래스의 makeScore() method 코드가 실행된다
		 * 코드가 모두 정상종료되거나
		 * 아니면 중간에 return 명령문을 만나면
		 * system.out.println("입력...); 명령문이 이어서 실행된다
		 */
		ssV5.makeScores();
		System.out.println("입력 업무 중단!!!");
		
		// static method
		// method에  static keyword가 부착되면 객체를 생성하는 절차 없이 method를 직접 호출가능
		// 클래스.method()
		// static method는 프로젝트가 시작됨가 동시에 자동으로 만들어져 언제든지 호출 할 수 있다.
		// 다만, 지금 사용하지 않더라도 항상 메모리에 상주하고 있기에
		// 경우에 따라 불필요하게 메모리를 차지해 메모리 낭비를 불러올 수 있다
		// static method(static 변수)들은 꼭 필요한 경우에만 선언하는 것이 좋다
		System.out.println(ScoreServiceV5.dLine());
	}

}
