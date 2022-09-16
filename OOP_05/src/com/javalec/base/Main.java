package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.Calc;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner= new Scanner(System.in);
		int num1=0;
        int num2=0;
		Calc calc = new Calc();
		num1=scanner.nextInt();  
        num2=scanner.nextInt();
		calc.printname(num1, num2);
		
		
		
		
		
	
		}
}
