package com.callor.score.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.StudentVO;
import com.callor.score.service.StudentService;

public class StudentServiceImplV1 implements StudentService {

	protected List<StudentVO> studentList;
	
	protected final int 학번 = 0;
	protected final int 이름 = 1;
	protected final int 학년 = 2;
	protected final int 반 = 3;
	protected final int 학과 = 4;
	protected final int 주소 = 5;

	
	public StudentServiceImplV1() {
		studentList = new ArrayList<StudentVO>();
		this.loadStudent();
		this.printStudent();

	}
	
	//public StudentServiceImplV1(String fileName) {
		//studentList = new ArrayList<StudentVO>();
		//this.loadStudent();
		//this.printStudent();

	//}

	@Override
	public void loadStudent() {

		String fileName = "src/com/callor/score/student.txt";
		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			String reader = new String();
			while ((reader = buffer.readLine()) != null) {
				String data[] = reader.split(":");
				StudentVO studentVO = new StudentVO();
				studentVO.setNum(data[학번]);
				studentVO.setName(data[이름]);
				studentVO.setSubject(data[학과]);
				studentVO.setGrade(data[학년]);
				studentVO.setAdd(data[주소]);
				
				// 디버깅 코드
				//System.out.println(studentVO.toString());
				studentList.add(studentVO);
			}
			buffer.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일 없숭~");
		} catch (IOException e) {
			System.out.println("읽는 도중 문제 발생");
		}

	}

	@Override
	public void printStudent() {
		
		System.out.println("=".repeat(80));
		System.out.println("학번   이름   학과    학년   주소");
		System.out.println("-".repeat(80));
		
		/*
		 * 배열을 사용하여 for() 반복문을 구현할때는
		 * 배열.length 속성을 직접 반복문의 조건으로 설정한다
		 * 		i < 배열.length
		 * 
		 * List 객체는 특성상 수시로 데이터의 개수가 변경된다
		 * List에 담긴 개수를 알려주는 size() method는
		 * 호출될때마다 List에 담긴 데이터 개수를 다시
		 * 		헤아리는 코드가 실행된다
		 * 
		 * for() 반복문 내에서 i < list.size() 코드를 사용하면
		 * for() 반복문이 반복되는 동안 계속해서 개수를
		 * 		헤아리게 된다
		 * 데이터의 개수가 몇개 안될때는 큰 문제가 없지만
		 * 데이터 개수가 많아지면 그만큼 성능이 떨어지게 된다
		 * 
		 * list 전체를 for() 반복문을 사용하여 순회할때는
		 * 먼저 size() 값을 int 형 변수에 담아놓고 시작하자
		 * 
		 */

		int nSize = studentList.size();
		for (int i = 0; i < nSize; i++) {
			StudentVO vo = studentList.get(i);
			System.out.print(vo.getNum() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getSubject() + "\t");
			System.out.print(vo.getGrade() + "\t");
			System.out.print(vo.getAdd() + "\n");

		}
		System.out.println("=".repeat(80));
	}

	@Override
	public void insertStudent() {
		// TODO Auto-generated method stub

	}

	@Override
	public StudentVO getStudent(String num) {
		 // 학번으로 학생조회하여 학생정보 return
		
		int sSize = studentList.size();
		for(int i = 0; i < sSize ; i++) {
			// for() 풀이
			// int num;
			// num= 100;
			// int num = 100;
			
			// 아래 if() 풀이
			// StudentVO vo = null;
			// vo = studentList.get(i);
			StudentVO vo = studentList.get(i);
			if(vo.getNum().equals(num)) {
				return vo;
			}
		}
		
		// 2번 코드
		// 새로운 for, forEach
		for(StudentVO vo : studentList) {
			if(vo.getNum().equals(num))	return vo;
		}
		return null;

}

}
