package com.callor.classes.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.classes.model.IolistVO1;

/*
 * IolistVO는 1개의 데이터를 담을 수 있도록 설계한 것
 * 실제 프로젝트에서는 1개의 데이터만 있는 경우는 없음
 * 
 * 여러개의 데이터 묶음으로 연산을 수행해야 함
 * 데이터의 묶음을 처리할때는 보통 배열을 많이 사용함
 * 다만 배열은 그 구조상 사용이 불편할때가 많음
 * Java에서는 배열을 사용해야 하는 프로젝트에서 
 *      List 클래스를 사용한 객체를 생성하여 진행 함
 * 
 */
public class IolistServiceV1 {
	/*
	 * 매입매출 데이터들을 사용하여 연산을 수행할텐데
	 * 매입매출 데이터들의 묶음 을 List형 객체 사용하겠다
	 * 
	 * List형 객체에 포함된 (개별)데이터는IolistVO 형으로 사용하겠다
	 * 
	 * 낱개 데이터는 IolistVO클래스 형으로 사용하고
	 * 그 데이터들을 묶어서 List형으로 연산 수행을 하겠다라는 선언
	 * 
	 * private을 선언하는 이유
	 *   혹시 외부에서 iolist데이터에 접근하여 값을 저장하는 일을 방지하기 위함임
	 * V1클래스를 상속하여 사용하 ㄹ예정이라면
	 * protected로 선언을 한다
	 */
	
	// TODO 맴버변수 선언하기 
	// todo 책갈피 기능
	protected List<IolistVO1> iolist;
	protected Scanner scan;
	
	public IolistServiceV1() {
		// TODO 클래스생성자
		iolist = new ArrayList<IolistVO1>();
		scan = new Scanner(System.in);
		
	}
	
	public void input() {
		// TODO 업무 선택하기 메뉴
		System.out.println("====================");
		System.out.println("매입매출등록");
		System.out.println("----------------------");
		
		System.out.print("상품명 > ");
		String pname = scan.nextLine();
		
		System.out.println("거래일자(yyyy-mm-dd) > ");
		String date = scan.nextLine();
		
		System.out.println("거래처 > ");
		String dname = scan.nextLine();
		
		System.out.println("매입매출분류 > ");
		String inout = scan.nextLine();
		
		System.out.println("상품수량 > ");
		Integer qty = scan.nextInt();
		
		
		System.out.println("매입단가 > ");
		Integer inprice = scan.nextInt();
		
		System.out.println("매출단가 > ");
		Integer oprice = scan.nextInt();
		
		IolistVO1 iolistVO1 = new IolistVO1();
		iolistVO1.setPname(pname);	
		iolistVO1.setDate(date);
		iolistVO1.setDname(dname);
		iolistVO1.setInout(inout);
		iolistVO1.setQty(qty);
		iolistVO1.setIprice(inprice);
		iolistVO1.setOprice(oprice);
		iolist.add(iolistVO1);
	}
	
	public void printIolist(IolistVO1 vo) {
		// TODO 1개 데이터 출력하기
		System.out.print(vo.getPname() + "\t");
		System.out.print(vo.getDate() + "\t");
		System.out.print(vo.getDname() + "\t");
		System.out.print(vo.getInout() + "\t");
		System.out.print(vo.getQty() + "\t");
		System.out.print(vo.getIprice() + "\t");
		System.out.print(vo.getOprice() + "\n");
		
	}
	/*
	 * ==================================
	 * KMS 쇼핑몰 업무관리
	 * ----------------------------------
	 * 1. 매입매출 등록
	 * 2. 매입매출 리스트 출력
	 * 0. 업무 종료
	 * ----------------------------------
	 * 업무선택>
	 * ==================================
	 */
	
	//public 으로 선언된 method는객체.method() 형식으로 호출이 가능한 method
	//return type이 결저오디지 않았을땐 void형으로 작성을 한다
	public void slectMenu() {
		
		while(true) {
		System.out.println("=".repeat(50));
		System.out.println("KMS 쇼핑몰 업무 관리");
		System.out.println("-".repeat(50));
		System.out.println("1. 한명 성적 추가");
		System.out.println("2. 매입매출 리스트 출력");
		System.out.println("0. 업무종료");
		System.out.println("-".repeat(50));
		
		System.out.println("업무선택 > ");
	    String strMenu = scan.nextLine();
	    
	    if(strMenu.equals("QUIT")) {
	    	break;
	    }
		Integer intMenu = null;
		try {
			intMenu = Integer.valueOf(strMenu);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("메뉴 선택 오류");
			System.out.println("메뉴는 1,2" + "QUIT만 입력가능");
			continue;
		}
		if(intMenu == 1) {
			this.input();
		}else if(intMenu == 0) {
			break;
		}else if(intMenu == 2) {
			this.printAllList();
		}
		}	
		
	}
	
	public void printAllList() {
		// TODO 저장된 리스트 출력하기
		System.out.println("=".repeat(50));
		System.out.println("매입매출리스트");
		System.out.println("-".repeat(50));
		System.out.println("상품명 ");
		
		for(int i = 0; i < iolist.size() ; i++) {
			//IolistVO1vo = iolist[i]
			//IolistVO1 vo = iolist.get(i);
			//this.printIolist(vo);
			
			this.printIolist(iolist.get(i));// method가 method를 포함하는 구조
		}
		System.out.println("=".repeat(50));
	}
	
	
	
	

}
