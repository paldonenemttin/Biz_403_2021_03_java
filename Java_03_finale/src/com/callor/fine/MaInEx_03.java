package com.callor.fine;

public class MaInEx_03 {
	
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		AddInt addInt = new AddInt();
		int sum = addInt.AddInt(num1, num2);
		System.out.println(sum);
	}

}
