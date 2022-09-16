package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 
		Scanner scanner = new Scanner(System.in);
		int score = 0;
	    String grades = "";
	   
		System.out.println("점수를 입력하세요.");
        
		score = scanner.nextInt();
		
		if     (score>=90)  {
			System.out.println("당신의 학점은 A입니다.");
		
		}
		else if (score>=80) {
			System.out.println("당신의 학점은 B입니다,");
			
		}
		else if (score>=70) {
		    System.out.println("당신의 학점은 C입니다,");
		    
		}
		else if (score>=60) {
			System.out.println("당신의 학점은   D입니다.") ;
			
		}
		else     {
			System.out.println("당신의 학점은 F입니다.");
		}
	}

}
