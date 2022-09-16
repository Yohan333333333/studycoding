package com.javalec.base;

import java.util.Scanner;

public class histo_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
//		// 선언
//		int[] score = new int[10];
//		int num1 = 0;
//
//		for (int i = 0; i < 10; i++) {
//			System.out.print(i + 1 + "score");
//			num1 = scanner.nextInt();
//           score [num1/10]++;
//		}
//       System.out.println("----------------------histogram----------------------");
//		for(int i = 9; i >=0; i--) {
//			System.out.print(String.format("%2d",i*10)+ ":" );
//			for(int j = 0; j <score[i];  j++) {
//		    System.out.print("#");
//			}
//			System.out.println();
//		}
//	
	
		String[] names = {"kroean", "english","math"};
	    int[] no = new int [4];
	    int score = 0;
	    int tot = 0;
	    int sum = 0;
	    
	    for (int i =0; i >= 100; i++) {
	    	System.out.println(names[i] + "의 성적을 입력," );
	       names[i] = scanner.next();
	    }
	    for(int i =0; i>= 100; i++) {
	    	System.out.println(names[i]+ "의 성적을 입력");
	    }
	    for(int i =0; i>= 100; i++) {
	    	System.out.println(names[i] + "의 성적을 입력"  );
	    }
	    
	
	
	
	
	
	}

}
