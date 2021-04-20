package com.callor.word.domain.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import com.callor.word.domain.ScoreVO;
import com.callor.word.domain.WordVO;

/*
 * 점수처리
 * 단어를 맞추면 점수를 (+)
 * 단어를 틀리면 재도전 (-)
 * 힌트를 요구하면 점수를 (-)
 * 건너뛰기 (-)
 * 
 */
public class WordServiceImplV2 extends WordServiceImplV1 {

	protected WordVO gameWord;
	protected ScoreVO score;
	protected String basePath;
	
	protected final int 맞은갯수 = 0;
	protected final int 틀린갯수 = 1;
	protected final int 포인트 = 2;
	
	
	public WordServiceImplV2() {
		// TODO 생성자
		score = new ScoreVO(3);
		basePath = "src/com/callor/word/";
		this.loadScore();
	}

	/*
	 * gerSuffleWord() method를 호출하여 suffle된 영단어를 받고
	 * 
	 * 반복하여 suffle된영단어를 inputWord()에게 전달하여 게임을진행하낟
	 */
	public void startGame() {
		// TODO 스타트게임
		while (true) {
			
			score.set힌트보기(0);
			score.set재도전(2);
			
			// 게임용 단어 만들기
			int nWordIndex = rnd.nextInt(nWordCount);
			WordVO wordVO = wordList.get(nWordIndex);

			// getsuffleWord사용 않고
			// 직접suffleWord사용 하도록 변경
			String viewWord[] = this.suffleWord(wordVO.getEnglish());
			while (true) {
				String strInput = this.inputWord(viewWord);
				if (strInput.equals("QUIT")) {
					this.viewScore();
					this.saveScore();
					System.out.println("게임종료");
					/*
					 * return문은 반복문의 겹침 갯수에 관계 없이 무조건 현재 method 자체가 끝난다
					 */
					return;
				} else if (strInput.equals("1")) {
					/*
					 * 반복문{반복문{}}처럼 반복문이 겹쳐 있을때 안쪽의 반복문에서 break를 실행하면 한계단씩 반복문이 해제 된다
					 */
					break;
				} else if (strInput.equals("2")) {
					this.hint(wordVO);
					// System.out.println("*".repeat(50));
					// System.out.println("힌트");
					// System.out.println(wordVO.getKorea());
					// System.out.println("*".repeat(50));
				} else {
					// 점수계산
					this.yesNo(wordVO, strInput);
					
					// if (wordVO.getEnglish().equalsIgnoreCase(strInput));
					// 짧게 하고 싶으면 getEnglish를 변수에 담아 if에서 equals넣기
					// System.out.println("님 맞음 ㅊㅊ");
				}
			}
		} // main while
	}

	
	protected void hint(WordVO wordVO) {
		//TODO 힌트보기
		System.out.println("*".repeat(50));
		System.out.println(wordVO.getKorea());
		System.out.println("*".repeat(50));

		score.set힌트보기(score.get힌트보기() + 1);
	}

	
	
	protected void yesNo(WordVO wordVO, String input) {
		// TODO 단어 채점
		String strEng = wordVO.getEnglish();
		if (strEng.equalsIgnoreCase(input)) {
			score.set맞은갯수(score.get맞은갯수() + 1);
			System.out.println("올 ㅋ");
		} else {
			score.set틀린갯수(score.get틀린갯수());
			score.set재도전(score.get재도전());
		}
	}

	
	
	
	
	protected void viewScore() {
		// TODO 점수 보여주기
		System.out.println("=".repeat(50));
		System.out.println("현재 스코어");
		System.out.println("-".repeat(50));
		System.out.printf("맞은갯수 : %d\n", score.get맞은갯수());
		System.out.printf("틀린갯수 : %d\n", score.get틀린갯수());
		System.out.printf("포인트 : %d\n", score.get포인트());
	}

	protected void saveScore() {
		// TODO 점수 저장
		while (true) {
			System.out.println("저장할 파일이름 입력");
			System.out.print(">>");
			String fileName = scan.nextLine();
			if (fileName.equals("")) {
				System.out.println("파일 이름은 입력 하십쇼");
				continue;
			}
			FileWriter fileWriter = null;
			PrintWriter out = null;

			try {
				fileWriter = new FileWriter(basePath + fileName);
				out = new PrintWriter(fileWriter);
				out.printf("%d:%d:%d\n", score.get맞은갯수(), score.get틀린갯수(), score.get포인트());

				out.flush();
				out.close();
				System.out.println("게임 저장 완료");
				return;
			} catch (IOException e) {
				System.out.println(fileName + "파일 생성 오류");
				System.out.println("파일 이름을 다시 입력하세여");
			}

		} // end while

	}// end saveScore

	protected void loadScore() {
		// TODO 점수 불러오기
		while (true) {
			
			System.out.println("불러올 파일 이름을 입력하세요");
			System.out.print(">> ");
			String fileName = scan.nextLine();
			if(fileName.equals("")) {
				System.out.println("게임을 처음부터 시작합니다");
				score = new ScoreVO(3);
				return;
			}
			
			FileReader fileReader = null;
			BufferedReader buffer = null;
			
			try {
				fileReader = new FileReader(basePath + fileName);
				buffer = new BufferedReader(fileReader);
				String reader = buffer.readLine();
				String[] sc = reader.split(":");
				
				this.score = new ScoreVO();
				
				score.set맞은갯수(Integer.valueOf(sc[맞은갯수]));
				score.set틀린갯수(Integer.valueOf(sc[틀린갯수]));
				score.set포인트(Integer.valueOf(sc[포인트]));
				buffer.close();
				return;
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("파일 없음");
				System.out.println("파일명 재입력 필요");
				continue;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("파일 읽기 불가");
				score = new ScoreVO();
				return;
			}
			
			
		}
	}

	/*
	 * suffle된 단어배열을 매개변수로 받고 게임을 진행하기
	 */

	protected String inputWord(String[] viewWord) {
		// TODO 메뉴
		System.out.println("=".repeat(50));
		System.out.println("뤼팽의 영단어 게임 V2");
		System.out.println("-".repeat(50));
		System.out.println("다음 보여지는 단어를 바르게 배열");
		System.out.println(Arrays.toString(viewWord));
		System.out.println("-".repeat(50));
		while (true) {
			System.out.println("1. 다음게임(skip)");
			System.out.println("2. 힌트보기");
			System.out.println("QUIT : 게임중단");

			System.out.println("-".repeat(50));
			System.out.print("> ");
			String strInput = scan.nextLine();
			if (strInput.equals("")) {
				System.out.println("단어나 메뉴를 선택하세요");
				continue;
			}
			return strInput;
		}

	}

	/*
	 * List에서 getter된 영단어VO를 전역변수(클래스 영역에 맴버변수)로 선언하고 단어를 저장했다
	 * 
	 * 그랬더니 영단어VO는 다른method에서도 참조하는 변수가 되고 method간에 서로 관심을 가져야 되는 사이가 되어버린다 이런 상황이
	 * 진행되면 영단어VO변수의 상태를 잘 관리해야 하는 문제가 발생한다
	 * 
	 * getSuffleWord()를 사용하지 않고 list에서 영단어 VO
	 */
	// protected String[] getSuffleWord() {

	// String[] suffleEnglish = this.wordsuffle(gameWord.getEnglish());
	// System.out.println(Arrays.toString(suffleEnglish));

	// return suffleEnglish;
	// }

}