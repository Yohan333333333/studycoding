package com.javalec.base;

import java.util.Scanner;

public class Square_number {

	public static void main(String[] args) {
		//

//		double num = 1;
//
//		for (int i = 0; i < 10; i++) {
//			System.out.println("10^" + String.format("%2d", i) + "=" + (String.format("%12.0f", num)));
////    	 num = num * 10;
//			num *= 10;
//		}
//      
//		Scanner scanner = new Scanner(System.in);
//		int num1 = 0;
//		int tot = 0;
//		int num2 = 0;
//		System.out.println("몇개의 숫자를 합할까요?");
//		num1 = scanner.nextInt();
//
//		for (int i = 1; i <= num1; i++) {
//		System.out.println(num1 + "의 숫자를 입력하세요.");
//
//			num2 = scanner.nextInt();
//			tot += num2;
//			System.out.println(tot);
//		
//		}
    
    	
 //  }
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		int num2= 0;
		int remain = 0;
		int sum =0;
		System.out.println("Enter an ineger (0~9):");
		num =scanner.nextInt();
		while( num >= 1) {
			remain = num % 10;
			sum += remain;
			num = num / 10;
		   
		
		}
		System.out.println(sum);
		
		
	}

}

