package com.callor.controller;

public class Score_07 {
	
	public static void main(String[] args) {
		
		int intKor = 0;
		int intEng = 0;
		int intMath = 0;
		
		int intSum = intKor + intEng + intMath;
		float floatAvg = (float)intSum / 3;
		
		if(floatAvg >= 95) {
			System.out.println("장원입니다");
		} else if(floatAvg >= 90) {
			System.out.println("차석입니다");
		} else if(floatAvg >= 85) {
			System.out.println("우등입니다");
		} else if(floatAvg >= 80) {
			System.out.println("아차상입니다");
	}

}
}
