package com.callor.score;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * score 패키지 아래에 쌤 킷허브에서 샘플데이터 복수 후 파일로 저장
 * 아래 student.txt 파일을 읽어들인 후 학생 이름과 주소를 아래와 같은 형식으로 출력
 * =================================
 * ㅇㅇㅇ  서울시
 * =================================
 */
public class Student_01 {
	
	public static void main(String[] args) {
		
		// 선언하는 코드와 생성하는 코드를 분리하자
		// FileWriter, FileReader : 파일을 open
		// PrintWriter , BufferedReader : 내용을 쓰고 읽기
		
		String fileName = "src/com/callor/score/student.txt";
		
		FileReader fileReader = null;
		BufferedReader buffer = null;
		System.out.println("=".repeat(80));
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			
			/*
			 * ==========================================
			 * while(true)반복문의 사용
			 * 1. 조건없이 무한 반복을 수행하는 코드
			 * 2. 무한 반복 코들르 수행하는 과정에서
			 *   if() 조건문을 추가하여 반복을 중단하기
			 * 3. 무한반복을 조건을 부여하여 탈출구를 만들때
			 *    일반적으로 쉽게 구현할 수 잇는 코드
			 * 4. if() 조건문이 필요하고 때로는 
			 *    추가되는 코드가 필요하기도 하다
			 * 5. 무한반복 코드가 실행되는 동안에 탈출구를
			 *    어떻게 만들지 고민해야 하고
			 * 6. 다양한 조건과 방법의 탈출구를 필요할때 적절하게 구현 가능
			 */
			// 파일을 무조건 한 라인씩 읽어라
			while(true) {
				String str = buffer.readLine();
				// 파일의 끝에 다다르면 더이상 읽지 마라
				// EOF(End Of File) 가 되면  str 변수에 null 값이 담기게 된다
				// str에 null 값이 담겨 있다 = 다 읽었다
				if(str == null) break;
				String[] sh = str.split(":");	
				System.out.printf("%s\t%s\n",sh[1],sh[5]);
			}
			/*
			 * ================================================
			 * while(조건식) 무한반복문
			 * 1. 무한 반복코드가 중단되는 조건이 하나만 있을 경우 사용
			 * 
			 * 2. 조건식을 어떻게 만들것인가 잘 구상해야함
			 * 
			 * 3. while(조건식)이 시작되기 전에
			 *    최초에 조건이  true가 되도록 만들어야 함
			 *    
			 * 4. 적절하게 탈출을 하려면 코드내에서 
			 *    조건식이 false 되도록 연산을 수행
			 *    
			 * 5. 코드내에서 조건이 false가 되더라도
			 *    이후의 명령들이 한번씩 실행되고 나서
			 *    탈출이 이뤄진다
			 */
			// 문자열 변수  str 을 null이 아닌 값으로 생성하기
			String str = new String();
			//최초의 while()문에서  reader != null 은 true가 된다
			// != null 조건문을 실행하기 전에
			// str = buffer.readLine() 을 실행하고
			// str 저장된 값이 null인지 비교한다
			//1. str = buffer.readLine()을 실행하고
			//2. reader에 저장된 값을 마치 method가 return한 것처럼 동작한다
			// 3. ()return 하는 값이 null이 아닌가를 비교한다
			// 4. 그 결과가 true이면 계속 코드 진행
			// 5. 그 결과가 false이면 즉시 while명령이 끝난다
			
			while((str = buffer.readLine()) != null) {
				//str = buffer.readLine();
				//System.out.println(str);
				
				// students 배열은
				// 자동으로 분해된 문자열 갯수만큼 생성
				// 각 요소에 값이 저장된
				String students[] = str.split(":");
				System.out.printf("%s\t$s\n",students[1], students[5]);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println(fileName + "파일이 없슴다");
			//e.printStackTrace();
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println();
		}
		System.out.println("=".repeat(80));
		
	}

}
