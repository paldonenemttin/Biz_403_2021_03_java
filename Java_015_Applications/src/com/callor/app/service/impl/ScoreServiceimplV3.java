package com.callor.app.service.impl;
/*
 * V2는 V1을 상속받고
 * V3은 V2를 상속 받았다
 * V3은 V1을 상속받고 V2의 재 정의된 inputNum()을 상속받는 효과가 있다
 * 
 * 즉 V3은 V1에 구현된 객체, 변수, method를 모두 글대로 물려 받으면서
 * V2에서 새롭게 작성한 inputNum()을 상속받아서 사용하고 있다
 * 
 */
public class ScoreServiceimplV3 extends ScoreServiceimplV2 {

	@Override
	public void selectMenu() {
		while(true) {
			System.out.println("빛나라 고교 성적 처리 V3");
			System.out.println("=".equals(50));
			System.out.println("1. 성적등록");
			System.out.println("2. 성적리스트 출력");
			System.out.println("3. 성적 파일에 저장");
			System.out.println("QUIT. 업무종료");
			String strM = scan.nextLine();
			if(strM.equals("QUIT")) {
				System.out.println("업무종료");
				return;
			}
			Integer intM = null;
			try {
				intM = Integer.valueOf(strM);
			} catch (NumberFormatException e) {
				System.out.println("메뉴보고 다시 바르게 해주세요");
				continue;
			}
			if(intM == 1) {
				this.inputScore();
			} else if(intM == 2) {
				this.printScore();
			} else if(intM == 3){
				// 파일에 저장
				this.scoreToFile();
			}
		}
	}
	// 파일에 저장하기
	protected void scoreToFile() {
		
	}
	
	

}
