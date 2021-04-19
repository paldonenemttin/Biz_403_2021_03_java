package com.callor.score.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.StudentVO;

public class StudentServiceImplV1A implements StudentService {

	protected List<StudentVO> studentList;
	protected String studentFile;

	protected final int 학번 = 0;
	final int 이름 = 1;
	final int 학년 = 2;
	final int 반 = 3;
	final int 학과 = 4;
	final int 주소 = 5;

	/*
	 * new StudentServiceImplV1A() 생성자를 호출하여 객체를 생성하려고 하면 고정된
	 * 파일이름("src/com/callor/score/student.txt")을 사용하여 파일을 읽을 수 있도록 할 예정이다
	 * 
	 * 생성자에서는 new studentServiceImplV1("파일명")의 생성자 method를 다시 호출하는 구조가 된다
	 * 
	 */
	public StudentServiceImplV1A() {
		// 여기에서 다음의 생성자 메서들르 또 한번 호출
		// new StudentServiceImplV1("src/com/callor/score/student.txt");
		this("src/com/callor/score/student.txt");
	}

	public StudentServiceImplV1A(String fileName) {
		this.studentFile = fileName;
		studentList = new ArrayList<StudentVO>();
		// 클래스를 객체로 생성할때 method를 호출하여
		// 데이터를 사용하도록 준비해달라
		this.loadStudent();
	}

	@Override
	public void insertStudent() {
		// TODO Auto-generated method stub

	}

	/*
	 * student.txt 파일에서 학생정보를 읽어 studentList에 데이터 준비하기
	 */
	@Override
	public void loadStudent() {

		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(this.studentFile);
			buffer = new BufferedReader(fileReader);

			while (true) {
				String reader = buffer.readLine();
				if (reader == null)
					break;
				String[] sts = reader.split(":");
				StudentVO studentVO = new StudentVO();
				studentVO.setNum(sts[학번]);
				studentVO.setName(sts[이름]);
				studentVO.setGrade(sts[학년]);
				studentVO.setSubject(sts[학과]);
				studentVO.setAdd(sts[주소]);
				System.out.println(studentVO.toString());
				studentList.add(studentVO);
			}
			buffer.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없다");
		} catch (IOException e) {
			System.out.println("읽는 중 에러났다");
		}

	}

	@Override
	public StudentVO getStudent(String num) {
		// TODO 학번으로 학생을 조회해 학생정보 return
		
		return null;
	}

	@Override
	public void printStudent() {

		System.out.println("=".repeat(50));
		System.out.println("학번\t이름\t학과\t학년\t주소");
		System.out.println("=".repeat(50));
		
		/*
		 * 배열을 사용하여 for() 반복문을 구현할때는
		 * 배열.length속성을 직접 반복문의 조건으로 설정한다
		 *     i < 배열.length
		 *     
		 * List 객체는 특성상 수시로 데이터의 갯수가 변경된다
		 * List에 담긴 갯수를 알려주는 size() method는
		 * 호출될때마다 List에 담긴 데이터 갯수를 다시 헤아리는 코드가 실행된다
		 * 
		 * for() 반복문 안에서 i < list.size() 코드를 사용하면
		 * for() 반복문이 반복되는 동안 계속해서 갯수를 세게 된다
		 * 
		 * 데이터의 갯수가 몇개 안될땐 문제가 없지만
		 * 데이터의 갯수가 많아지면 그만큼 성능이 저하된다
		 * 
		 * list 전체를 for() 반복문을 사용하여 순회할때는
		 * 먼저 size() 값을 int 형 변수에 담아놓고 시작하자
		 */
		int nSize = studentList.size();
		for (int i = 0; i < nSize; i++) {
			
			StudentVO vo = studentList.get(i);
			
			System.out.print(vo.getNum()+ "\t");
			System.out.print(vo.getName()+ "\t");
			System.out.print(vo.getGrade()+ "\t");
			System.out.print(vo.getSubject()+ "\t");
			System.out.print(vo.getAdd()+ "\n");
		}
		System.out.println("=".repeat(50));
	}

}
