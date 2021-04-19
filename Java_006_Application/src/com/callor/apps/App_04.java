package com.callor.apps;
/*
 *  배열에 저장된 값중에서 짝수가 저장된 최초의 위치는?
 */
import java.util.Random;

public class App_04 {
	
	public static void main(String[] args) {
		
		int[] nums = new int[20];
		
		Random rnd = new Random();
		
		for(int i = 0 ; i < nums.length ; i++) {
			nums[i] = rnd.nextInt(100) + 1;
		}
		
		for(int i = 0 ; i < nums.length ; i++) {
			if(nums[i] % 2 == 0) {
				//System.out.printf("%d번째 값 : %d" , i , nums[i]);
				System.out.println();
				System.out.println(i + "번");
				break;
			}
			
		}
		for(int i = 0 ; i < 20 ; i++) {
			if(nums[i] % 2 == 0) {
				System.out.println(nums[i]);
			}
		}
		
	}

}
