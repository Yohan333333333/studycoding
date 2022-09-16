package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Scanner scanner = new Scanner(System.in);
		int num1= 0;
		int num2= 0;
		int add = 0;
		int sub = 0;
		int mulp = 0;
		int div = 0;
		int rest = 0;
		
		System.out.println("첫번째 숫자를 입력하세요:");
		 num1 = scanner.nextInt(); 
		System.out.println("두번째 숫자를 입력하세요:");
	     num2 = scanner.nextInt();
	     
	     add = (num1+num2);
  	     sub = (num1-num2);
  	     mulp= (num1*num2);
  	     div = (num1/num2);
  	     rest= (num1%num2);
  	     System.out.println(add);
	     System.out.println(sub);
	     System.out.println(mulp);
	     System.out.println(div);
	     System.out.println(rest);
	
	
	
	
	
	
	
	
	
	
	}

}
