package com.javalec.base;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// 
		Scanner scanner = new Scanner(System.in);
	    double  Language = 0;
	    double  English  = 0;
	    double  Math     = 0;
		double  avr      = Language + English + Math /3.0;//평균점수
		String result;
		System.out.println("국어 점수를 입력하세요.");
	    Language = scanner.nextInt();
	    if(Language >100||Language < 0 ) {
	    	System.out.println("0~100점 사이로 입력해주세요.");
	        return;
	    }//
	    
	    
	    System.out.println("영어 점수를 입력하세요.");{
	    English = scanner.nextInt();
	    if (English > 100||English < 0 ) {
	    	System.out.println("0~100점 사이로 입력해주세요.");
	    	return;
	    }
	    System.out.println("수학 점수를 입력하세요.");
	    Math = scanner.nextInt();
	    if (Math > 100||Math < 0 ) {
	    	System.out.println("0~100점 사이로 입력해주세요.");
	    	return;
	    }
	      avr      = Language + English + Math /3.0;{
	       System.out.println("평균점수:" + avr);
	     }       
	    //국어점수
	    if      (Language>avr) { 
	       System.out.println("국어 점수보다 평균점수가 낮습니다");
	    }
	    else if (Language<avr) {
	        System.out.println("국어 점수가 평균점수보다 높습니다");
	        
	    }
	    else 
	        System.out.println("국어 점수와 평균점수가 같습니다.");
	    
	    }
	    //영어점수
	    if      (English>avr) {
	    	System.out.println("영어 점수보다 평균점수가 낮습니다");
	    }
	    else if (English<avr) {
	    	 System.out.println("영어 점수가 평균점수보다 높습니다");
	    }
	    else {
	    	System.out.println("영어 점수와 평균점수가 같습니다.");
	    }
	    //수학점수
	    if     (Math<avr) {
	    	System.out.println("수학 점수보다 평균점수가 낮습니다");
	    }
	    else if(Math>avr) {
	    	System.out.println("수학 점수보다 평균점수가 높습니다");
	    }
	    else  {
	    	System.out.println("영어 점수와 평균점수가 같습니다.");
	    }
	
	

	}
}


