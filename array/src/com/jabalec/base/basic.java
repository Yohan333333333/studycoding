package com.jabalec.base;

import java.util.Scanner;

public class basic {

	public static void main(String[] args) {
		// 
        Scanner scanner= new Scanner(System.in);
        int[] num1 = new int[100];
        int   num2 = 0;      
        int   cnt  = 0;
        int   findNumber = 0;
        String dont;
        System.out.print("입력할 숫자의 갯수는 ?");
        cnt =  scanner.nextInt();
        
        for(int i= 0; i <cnt; i++) {
        	System.out.print((i+1) +  "의 숫자를 입력하세요." );
        	num1[i] =scanner.nextInt();
        }  
		System.out.print("검색할 숫자는 ?");
		   findNumber =scanner.nextInt();
		   
		   
		   
		         dont = (findNumber +"결과가 나올수 없습니다.");
		   for(int i = 0; i < cnt; i++ ) {
			   if(num1[i] == findNumber) {
				   System.out.print(findNumber+"의 위치는" + (i+1) + "번째 입니다.");
			   }  
				   
			   System.out.println(dont);
		   }
		
		
		
		
	}

}
