package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//선언하기
		//홀수 지정 짝수 지정  관련된 문제 내가 만들어보기
		//for문 하나만 가지고 1~100까지 숫자의 짝수의 합과홀수의 합을 구하여
//		int  sum1= 0;
//		int  sum2= 0;
//		
		Scanner scanner= new Scanner(System.in);
//      for(int i= 1;  i<=100;  i++) {
//    	    
//    	  if(i % 2 == 1) {
//    		sum1=sum1+i;
//    	}else {
//    		sum2=sum2+i;    		
//    		
//    	}
//      }
//        
//    	  
//    	  System.out.println(sum1);
//    	  System.out.println(sum2);
//      
//시작 숫자를 입력
//끝  숫자를 입력
//		>>짝수의합 입니다 
//		>>홀수의합 입니다 
//		>>전체 평균은 입니다. 
      
		
		//선언
	     int num1 = 0;
	     int num2 = 0;
	     int sum1 = 0;
	     int sum2 = 0;
	     double avg =0;
	     int box = 0;
	    //숫자 받기
	     //시작숫자가 더크고 끝 숫자를 작게 시작할경
	     //짝수인경우
	     System.out.println("시작 숫자를 입력하세요.");
	     num1 = scanner.nextInt();
	     //홀수인 경우	     
	     System.out.println("끝 숫자를 입력하세요.");
	     num2 = scanner.nextInt();
	     //@끝 숫자가 더 크고 시작 숫자가 더 작을경우 임의의 공간(박스를) 만들어 뒤숫자를 박스안에 넣고 
	     //num1과 num2를 같게 만든다음 
	     
	     if(num1 > num2) {
	    	 box = num1;
	    	num1 = num2;		 
	    	num2 = box;		 
	     //
	     }
	     
	     for(int i=num1; i<=num2; i++) {
	    	 if (i % 2 ==0) {
	    		 sum1=sum1+i;
	    	 }else {
	    		 sum2=sum2+i;
	    	 }
	         
	     }
	     //짝수
	     System.out.println("짝수의 합은" +sum1+ "입니다.");
	     //홀수
	     System.out.println("홀수의 합은" + sum2 + "입니다.");
	     //평균
	     System.out.println("평균은"+(sum1+sum2)/(num2-num1+1.0)+"입니다.");
	     
	}

}
