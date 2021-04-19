package com.callor.method.service;

public class NumberServiceV7 {
	
	protected InputService inService;
	
	public NumberServiceV7() {
		inService = new InputService();
	}
	
	public Integer InputScore() {
			
			while(true) {
				Integer intKor = inService.inputValue("국어");
				if(intKor != null) {
					return null;
				}else {
					
				}
				
			}
			
	
		
		
		
	}

}
