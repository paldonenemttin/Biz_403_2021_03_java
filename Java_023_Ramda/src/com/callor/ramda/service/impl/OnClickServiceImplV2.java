package com.callor.ramda.service.impl;

import com.callor.ramda.service.OnClickService;

public class OnClickServiceImplV2 implements OnClickService{

	@Override
	public void onClick(String msg) {
		// TODO Auto-generated method stub
		
		msg += "방가방가";
		System.out.println(msg);
		
	}

}
