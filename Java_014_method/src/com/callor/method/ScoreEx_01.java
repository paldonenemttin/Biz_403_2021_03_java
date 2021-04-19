package com.callor.method;

import com.callor.method.medel.ScoreVO;

public class ScoreEx_01 {
	
	public static void main(String[] args) {
		
		ScoreVO scoreVO = new ScoreVO();
		
		scoreVO.setNum("001");
		scoreVO.setName("홍길동");
		scoreVO.setKor(80);
		scoreVO.setEng(77);
		scoreVO.setMath(66);
		
		System.out.println(scoreVO.toString());
		
	}

}
