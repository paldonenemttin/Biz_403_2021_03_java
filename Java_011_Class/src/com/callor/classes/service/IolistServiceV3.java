package com.callor.classes.service;

import com.callor.classes.model.IolistVO1;

public class IolistServiceV3 extends IolistServiceV1{

	@Override
	public void input() {
		// TODO Auto-generated method stub
		System.out.println("====================");
		System.out.println("매입매출등록");
		System.out.println("----------------------");
		
		System.out.print("상품명 (QUIT:입력중단 ) >");
		String pname = scan.next();
		if(pname == "QUTI") {
		}
		System.out.println("거래일자(yyyy-mm-dd) > ");
		String date = scan.next();
		
		System.out.println("거래처 > ");
		String dname = scan.next();
		
		System.out.println("매입매출구분 > ");
		String inout = scan.next();
		
		System.out.println("상품수량 > ");
		Integer qty = scan.nextInt();
		
		Integer iprice = this.inputPrice("매입");
		if(iprice == null) {
			return;
		}
		Integer oprice = this.inputPrice("매출");
		if(oprice == null) {
			return;
		}
		
		IolistVO1 vo = new IolistVO1();
		vo.setPname(pname);
		vo.setDate(date);
		vo.setDname(dname);
		vo.setInout(inout);
		vo.setQty(qty);
		vo.setInout(inout);
		vo.setOprice(oprice);
		
	}
	
	private Integer inputPrice(String title) {
		while(true) {
			System.out.println(title +"단가를 입력하시오");
			System.out.println(title + "단가는 0이상으로 입력하셈");
			System.out.println("-1 을 입력하면 입력을 중단");
			System.out.println(title + "단가 > ");
			Integer price = scan.nextInt();
			if(price == -1) {
				return null;
			}else if(price < 0) {
				System.out.println(title + "단가는 0 이상임");
			}else {
				return price;
			}
		}
	}
	

}
