package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//선언
         
		Scanner scanner = new Scanner(System.in);
		int inpuNum1; 
		String result= "";
		System.out.println( "금액을 입력하세요:");
		inpuNum1 = scanner.nextInt();
		
		if (inpuNum1 > 8000) {
			result = "너무 비쌉니다.";
			
			
		}
		else if(inpuNum1 > 5000) {
        	result = "조금 비쌉니다.";
        	
        }
		else if(inpuNum1 > 3000) {
        	result = "적당합니다.";
        
       
        }
	
		else { System.out.println(" 싼 편입니다.");
		   
	}
		System.out.println(result);
	
      
	} //main
} // Main
	
            

