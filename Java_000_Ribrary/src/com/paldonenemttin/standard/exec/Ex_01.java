package com.paldonenemttin.standard.exec;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import com.paldonenemttin.standard.impl.inputServiceImplV1;

public class Ex_01 {
	
	public static void main(String[] args) {
		
		inputServiceImplV1 isV1 = new inputServiceImplV1();
		
		isV1.inputValue("새우깡");
		isV1.inputValue("새우깡", 0);
		isV1.inputValue("새우깡", 0, 1000);
		
		/*
		 * List 인터페이스를 구현한 클래스를
		 * ArrayList, LinkedList, Vector 등 3가지가 있다
		 * 3가지의클래스는 코드에 List 인터페이스를 impl 했을 것이다
		 * 이러한 클래스는 선언과 생성을 할때
		 * 인터페이스로 선언을 하고 클래스의 생성자로 객체를 생성하는것이 좋다
		 * 
		 * List 인터페이스를 impl
		 */
		List<Integer> intList = new ArrayList<Integer>();
		intList = new LinkedList<Integer>();
		intList = new Vector<Integer>();
		ArrayList<String> strLisst = new ArrayList<String>();
	}

}
