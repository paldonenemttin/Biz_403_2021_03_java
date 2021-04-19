package com.callor.classes;

import com.callor.classes.model.IolistVO1;

public class IolistEx_01 {
	
	/*
	 * 진입점 method
	 * 시작점 method
	 * Run을 했을때 제일 먼저 실행(호출) 되는 method
	 * 
	 * 1.소스코드 코딩하기 : IolistEx_01 *.Java 파일을 저장하기
	 * 2.컴파일 : IolistEx_01 *.java 파일을 번역하여 컴퓨터가 알수 있는 부호들(코드)로 변환하는 작업
	 *            javac IolistEx_01 *.java
	 * 
	 * 3.실행 ;  컴파일 되어서 생성된 파일을 컴퓨터 메모리에 load하고 프로젝트를 실행(java IolistEx_01
	 * 
	 * 4.가상머신 : 자바코드를 번역한 *.class 파일을 열어서 
	 *              코드를 한개씩 운영체제, CPU에게 보내서 결과를 얻을 수 있게 하는 어플
	 *              운영체제, CPU에 관계 코드를 살행하여 같은 결과를 내도록 하는 역할을 수행한다
	 * 
	 * 5.진입점 method : static으로 작성된 main() method 가상머신이 
	 *                    java로 컴파일된 코드파일에서 제일 먼저 찾는 method
	 *                    
	 *                    java iolistEx_01이라고 실행을 지시하면
	 *                    IolistEx_01.main("lsdkfjwe")를 호출하여
	 *                    코드를 실행하기 시작한다
	 */
	public static void main(String[] args) {
		
		/*
		 * VO클래스는 데이터를저장하여 연산이 필요한 곳으로
		 * 이동 복사들을 할때 사용하는 도구, 바구니 역할을 함
		 * 
		 * VO클래스에 데이터를 저장한다
		 *  : VO클래스에 만들어진 맴버변수에 값을 저장한다
		 * 1. VO클래스를 사용하여 객체를 생성해야 하낟
		 * 2. 객체.맴버변수 = 값 형식으로 데이터를 저장
		 * 3. 지금 만든 IolistVO1클래스의 맴버변수는 모두 private 형식이기에
		 *    객체.맴버변수 형식으로는 값을 저장하기 불가능
		 * 4. 맴버변수에 값을 저장할때 setter method를 통해서 저장해야 함
		 */
		IolistVO1 iolistVO1 = new IolistVO1();
		
		iolistVO1.setPname("신라면");
		iolistVO1.setDate("2021-03-31");
		iolistVO1.setDname("농심");
		iolistVO1.setInout("매입");
		iolistVO1.setIprice(500);
		iolistVO1.setQty(100);
		printIolist(iolistVO1);
		
		//입력된 매입매출 데이터를데이터리스트에 담기
		//iolist.add(iolistVO1);
	}
	
	public static void printIolist(IolistVO1 iolistVO1) {
		System.out.println("======================================");
		System.out.println("상품명\t일자\t거래처\t구분\t수량\t단가");
		System.out.println("-".repeat(50));
		System.out.print(iolistVO1.getPname() + "\t");
		System.out.print(iolistVO1.getDate() + "\t");
		System.out.print(iolistVO1.getDname() + "\t");
		System.out.print(iolistVO1.getInout() + "\t");
		System.out.print(iolistVO1.getIprice() + "\n");
	}

}
