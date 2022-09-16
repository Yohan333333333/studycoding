package com.javalec.function;

import java.util.Scanner;

public class Calc {
    //field
	Scanner scanner =new Scanner(System.in);
	public int num1= 12;
	public int num2= 10;
	public int add = 0;
	public int sub = 0;
	public int Mulp = 0;
	public int div = 0;
	public int rest = 0;
	
	
    //constructor
    public Calc() {
    	
    }
   
       
    
    
    
    //method
    public int printname (int num1,int num2) {
    	add=num1+num2;
    	System.out.println(add);
    	sub=num1-num2;
    	System.out.println(sub);
    	Mulp=num1*num2;
    	System.out.println(Mulp);
    	div=num1/num2;
    	System.out.println(div);
    	rest=num1%num2;
    	System.out.println(rest);
    	
    	
    	return 0;
    }
    
    
    
	
	
	
	
}
