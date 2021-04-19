package com.callor.controller;

public class Cont_05 {
	
	public static void main(String[] args) {
		
		String strName = "";
		
		strName = "이민주";
		
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println(strName + ",");
		}
		
		String strNames = "";
		for(int i = 0; i < 5; i++) {
			strNames += strName;
		}
		
		for(int i = 0; i < 5; i++) {
			strNames += strName;
		}
		
		for(int i = 0; i < 10 ; i++) {
			System.out.println(strNames);
		}
	}

}
