package com.javalec.base;

import java.util.Scanner;

public class array3 {

	public static void main(String[] args) {
		//
//       int num1 = 0;
//       Scanner scanner= new Scanner(System.in);
//       num1 = scanner.nextInt();
//       for(int i=1; i <=9; i++) {
//    	   System.out.print(num1 + "X" + i  + "=" + (num1*i) + "\t" );
//    	   System.out.print((num1+1) + "X" + i  + "=" + ((num1+1)*i) + "\t" );
//    	   System.out.print((num1+2) + "X" + i  + "=" + ((num1+2)*i) + "\t" );
//    	   System.out.print((num1+3) + "X" + i  + "=" + ((num1+3)*i) + "\t" );
//    	 
//    	   
//    	   System.out.println();
//       }
		// string.formet()
//    		   int num = 98;
//    		   double dNum=12.34567;
//    		   String str ="abcdefg";
//    		   System.out.println("AAA:"+String.format("%10d", num));
//    		   System.out.println("BBB:"+String.format("%10.2F", dNum));
//    		   System.out.println("CCC:"+String.format("%10s", str));
//    		   
		// 팩토리얼 구하
//    		   Scanner scanner= new Scanner(System.in);
//    		   int num1 =0;
//    		   int fac = 1;
//    		   System.out.println("입력한 수의 펙토리얼 구하기" );
//    		    num1 = scanner.nextInt();
//    		    
//    		   for(int i = 1; i<=num1; i++) {
//    			   fac =fac*i;
//    			   
//    		   }
//    		   System.out.println( fac  );
//    				   
		// 더한 숫자들의 개수를정한 후 숫자를 입력 받아서 입력한 숫자의합을 구하는 프로그램 작성
//		Scanner scanner = new Scanner(System.in);
//		int num1 = 0;
//		int tot = 0;
//		int num2 = 0;
//		System.out.println("몇개의 숫자를 합할까요?");
//		num1 = scanner.nextInt();
//
//		System.out.println(num1 + "의 숫자를 입력하세요.");
//		for (int i = 1; i <= num1; i++) {
//
//			num2 = scanner.nextInt();
//			tot += num2;
//		}
//		System.out.println(tot);
		Scanner scanner = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int max = 0;
		int[] box = new int[100];
		int score = 0;
		System.out.println("입력할 숫자를 넣으세요(100개까지)");
		num1 = scanner.nextInt();

		if (num1 < 100) {
			System.out.println(num1 + "개의 숫자를 입력하세요.");
			for (int i = 1; i <= num1; i++) {
				box[i] = scanner.nextInt();

				if (max < box[i]) {
					max = box[i];
					score = i;
					
				}
				}

			System.out.println("최대값" + max + "이고" + "자릿수는" + score + "입니다");
		}

	}

}
