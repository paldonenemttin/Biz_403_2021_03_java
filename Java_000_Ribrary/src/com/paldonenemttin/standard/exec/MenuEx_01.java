 package com.paldonenemttin.standard.exec;

import com.paldonenemttin.standard.MenuService;
import com.paldonenemttin.standard.impl.MenuServiceImplV1;

public class MenuEx_01 {
	
	public static void main(String[] args) {
		
		
		// new MenuServcie ImplV1()처럼 호출 할 수 없다
		// 왜 : 생성자에 매개변수를 선언했기 때문에
		MenuService menuService = new MenuServiceImplV1(null, null);
	}

}
