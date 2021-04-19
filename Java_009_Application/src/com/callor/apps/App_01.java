package com.callor.apps;

import com.callor.apps.Service.ScoreServiceV1A;

public class App_01 {
	
	public static void main(String[] args) {
		
		/*
		 *  ScoreServiceV1 클래스를 사용하여
		 *  객체를 생성할때 정수 5를 전달해주고
		 *  5만큼의 배열을 생성하도록 코드를 변경
		 */
		ScoreServiceV1A ssV1 = new ScoreServiceV1A();
		
		/*
		 * method 를 호출하여 명령 실행하기
		 * ssV1.makeScore() 명령을 한줄
		 */
		ssV1.makeScore();
		
		ssV1.addNum();
		
		/*
		 *  intputScore() method 는 private으로 선언되어 있기 때문에
		 *  객체.intputScore() 형식으로 사용 할 수 없다
		 */
		// ssV1.intputScore();
	}

}
