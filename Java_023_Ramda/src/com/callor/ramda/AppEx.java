package com.callor.ramda;

import com.callor.ramda.service.OnClickService;
import com.callor.ramda.service.impl.OnClickServiceImplV1;

public class AppEx {
	
	public static void main(String[] args) {
		OnClickService on1 = new OnClickServiceImplV1();
		
		on1.onClick("응애");
			
		}

}
