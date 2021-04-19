package com.callor.classes;

import java.util.ArrayList;
import java.util.List;

public class class_02 {
	
	public static void main(String[] args) {
		
		/*
		 * java에서 제공되는 매우 사용이 편리한 배열자료구조
		 * 1. 몇개의 데이터를 저장할지 미리 정하지 않아도됌
		 * 2. 필요에 따라 갯수를 늘리거나 줄이기 가능
		 * 3. 매우 다양한 여러 기능이 이미 준비되어 있다.
		 * 
		 * Integer 형(type)의
		 *        데이터를 다수 저장(List형 데이터)할
		 *        intList  객체를 선언
		 * Integer[] intList = new Integer[??];
		 * 
		 *List 클래스를 사용하여 intList 객체를 선언한다
		 *   단, intList에는 
		 *       Integer 형 데이터만 저장가능
		 * <Integer> : Generic 선언
		 * 		저장된 데이터의 type을 규정하는방법
		 *       primitive형은 포함될 수 없다
		 *       반드시 wrapper class 형만 포함할 수 있다
		 * 
		 * List 형 객체 : List클래스를 사용한 객체
		 *         선언 할 때는 LIst를 사용하고
		 *         생성(초기화)할때는 AssayList() 생성자를 사용
		 *  
		 * List 형 객체를 선언하고 ArrayList()로 생성ㅇ르 하면
		 *       size가 0인 배열 객체가 생성되는 것과 유사함
		 */
		List<Integer> intList = new ArrayList<Integer>();
		List<String> strList = new ArrayList<String>();
		List<Double> douList = new ArrayList<Double>();
		List<Boolean> booleanList = new ArrayList<Boolean>();
		List<Float> floatList = new ArrayList<Float>();
		List<Character> charList = new ArrayList<Character>();
		
		//배열에 값을 저장할때는 원하는  length만큼
		//배열을 선언 생성하고 첨자를 사용하여
		//위치를 지정한 후 값을 저장
		int[] nums = new int[5];
		nums[0] = 100;
		
		//List형 객체에 데이터를 저장할땐
		//"추가"를 하여 저장
		// List형 객체에 데이터를 추가할땐
		// .add() method 사용하여 데이터를 추가
		
		// intList의 size가 1이 되고
		//자동으로 0번 위치에 100이 저장
		intList.add(100);//0번 위치
		intList.add(200);//1번 위치
		intList.add(300);//2번 위치
		
		// intList의 0번 위치에 저장된 값을 읽고 싶다
		System.out.println(intList.get(0));
		System.out.println(intList.get(1));
		System.out.println(intList.get(2));
		
		//값을 읽을때 저장된 데이터의 갯수의 index범위를 벗어날 수 없다
		//위에서 add를 3번 실행했기 때문에 
		//size는 3이 되고
		//get(index)를 수행할때
		//index 값은  size -2까지만 사용 할 수 있다
		
	}

}
