package com.javalec.base;

import java.util.Scanner;

public class numbercompare {

	public static void main(String[] args) {
		// 선언부
		Scanner scanner = new Scanner(System.in); //scanner 정의
		int inpuNum1; //첫번째숫자
	    int inpuNum2; //두번째숫자
	    String result; //결과값멘
	    //사용자 입력내용 가져오
		 System.out.print("첫번째 숫자를 입력하세요 :");
		 int num1 = scanner.nextInt();
		
		System.out.print("두번째 숫자를 입력하세요 :");
		int num2 = scanner.nextInt();
		    
		
		
        //두수 비교하여 출력하기
		//num1 < num2
       if (num1 < num2 )  { 
           System.out.println( "num1 은 num2 보다 작습니다" );
        
       }
       //num1 > num2
       if (num1 > num2) {
    	   
    	   System.out.println("num1 은 num2 보다 큽니다"); 
       
       }
       //num1 == num2
      
       if (num1 == num2) {
    	   System.out.println("num1 은 num2 보다 동일합니다.");
    	   		
    	  
       }
       
       
       
     
       
		
	   

	}

	
	{
		
	}
}
