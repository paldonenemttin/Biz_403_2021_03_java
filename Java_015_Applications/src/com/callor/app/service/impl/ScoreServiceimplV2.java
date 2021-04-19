package com.callor.app.service.impl;

import com.callor.app.model.ScoreVO;

/*
 * S.S.implV1을 상속받고
 * inputScore() method를 재 정의
 * 학생의 학번을 입력 받을때 이미 입력된 학생인 경우
 * 이미 입력된 학생임을 메시지로 보여주고 다시 입력 받는다
 * 학생이름, 성적등은 V1과 같다
 */
public class ScoreServiceimplV2 extends ScoreServiceimplV1 {

	/*
	 * scoreList에 성격정보를 추가할때 학번을 입력받을텐데 이미 등록된학번 정보가 있으면 그 학번은 추가 하지 못하도록 하는 코드
	 * 
	 * V1의 inpuNum() method를 재 정의한다 V1의 inputNum() method를 재 정의 하기 위해서 private를
	 * protected로 변경했다
	 */
	@Override
	protected String inputNum() {

		while (true) {
			Integer intNum = inService.inputValue("학번", 1);
			if (intNum == null) {
				return null;
			}
			String strNum = String.format("%03d", intNum);

			/*
			 * 생성한 strNum에 저장된 학번이scoreList에 있는지 확인
			 */
			int index = 0;
			// index는 0 ~ scoreList.size() -1 반복하는 과정에서
			// 0 ~ scoreList.size() -1에 해당한 값을 갖게 된다
			for (index = 0; index < scoreList.size(); index++) {
				ScoreVO scoreVO = scoreList.get(index);
				if (scoreVO.getNum().equals(strNum)) {
					break;
				}
			}

			// for() 반복문이 모두 정상종료 되었는지 ? : index >= size()
			// 아니면 중간에 중단되고 빠져나왔는지? : index < size()
			// for()
			if (index < scoreList.size()) {
				System.out.println(strNum + "는 이미 등록되어 있음");
			}
			return null;
		}
	}

}
