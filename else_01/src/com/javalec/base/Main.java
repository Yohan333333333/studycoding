package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//선언
         
		Scanner scanner = new Scanner(System.in);
	    String str1 = new String("ABC");
		//객체   인스트 =  뉴 생성자 
		
		int inpuNum1; 
		String result= "";
		System.out.println( "금액을 입력하세요:");
		inpuNum1 = scanner.nextInt();//next 정수값 
		
		
		
		//case 1
		if (inpuNum1 > 8000) {
			result = "너무 비쌉니다.";
			
			
		}//case 2
		else if(inpuNum1 > 5000) {
        	result = "조금 비쌉니다.";
        	
        }//case 3
		else if(inpuNum1 > 3000) {
        	result = "적당합니다.";
        
       
        }
	
		else { System.out.println(" 싼 편입니다.");
		   
	}
		System.out.println(result);
	
      
	} //main
} // Main
	
            

