package com.callor.classes.service;

import com.callor.classes.model.IolistVO1;

public class IolistServiceV2 extends IolistServiceV1 {

	/*
	 * v1의 input method를 재 정의한다 매입단가, 매출단가는 반드시 0 이상이어야 한다 유효성 검사를 하도록 코드를 재 정의 한다
	 */
	@Override
	public void input() {
		// TODO 매입매출 등록

		System.out.println("====================");
		System.out.println("매입매출등록");
		System.out.println("----------------------");

		System.out.print("상품명 > ");
		String pname = scan.next();

		System.out.println("거래일자(yyyy-mm-dd) > ");
		String date = scan.next();

		System.out.println("거래처 > ");
		String dname = scan.next();

		System.out.println("매입매출분류 > ");
		String inout = scan.next();

		System.out.println("상품수량 > ");
		Integer qty = scan.nextInt();

		// 매입 단가와 매출단가는 0이상만 입력한다
		// 매입단가가 0 이상이면 다음 항목 입력 받고록하고
		// while() 문을 중단하고
		// 매입단가가 0 미만이면 계속해서
		// 반복문 내에서 입력을 받도록
		Integer inprice = 0;
		while (true) {
			System.out.println("매입단가 > ");
			inprice = scan.nextInt();
			if (inprice < 0) {
				System.out.println("0 미만으로 입력 불가");
			} else {
				break;
			}
		}

		Integer oprice = 0;
		while (true) {
			System.out.println("매출단가 > ");
			oprice = scan.nextInt();
			if (oprice > 0) {
				System.out.println("0 이하로 입력 불가");
				continue;
			}
			break;
		}
		
		IolistVO1 vo = new IolistVO1();
		vo.setPname(pname);
		vo.setDate(date);
		vo.setDname(dname);
		vo.setQty(qty);
		vo.setIprice(inprice);
		vo.setOprice(oprice);
		iolist.add(vo);
		
	}

}
