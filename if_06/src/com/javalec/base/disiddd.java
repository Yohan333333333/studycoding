package com.javalec.base;

import java.util.Scanner;

public class disiddd {

	public static void main(String[] args) {
		//패키지     >>>클라스   >>> 무수히많메소드
		
		
		//선언하기
		Scanner scanner =new Scanner(System.in);
		int inpuNumber1; //사용자 입력 숫자
		String result = ""; //홀수 짝수 글
		
		// 사용자 숫자 받기
	    System.out.println("숫자를 입력하세요!");
	   inpuNumber1 =scanner.nextInt();
	
	   
	   //실수는 짝수 홀수 없음 정수만 있음
	   // 짝수 인지 홀수 인지 판단하기
//	 if(inpuNumber1 % 2 == 0) { // 짝수인 경우
//		 System.out.println("입력하신" + inpuNumber1 + "(은)는 짝수 입니다.");
//		  result ="짝수";
//	 } else { //홀수인 경우
//		 System.out.println("입력하신" + inpuNumber1 + "(은)는 홀수 입니다.");
//		 result ="홀수";
//	   
//	   
	   
	   
	   //switch문
	   switch(inpuNumber1%2 ) {
	   case 0:
		   result ="짝수";
	      break;
	   
	   default:
		   result ="홀수";
		   break;
	   }
	
	   
	   
	   // 결과값 출력하기
		 System.out.println("입력하신" + inpuNumber1 + "(은)는"+ result + "입니다.");
	
	 }
	}  
