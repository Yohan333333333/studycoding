package com.javalec.base;

public class Evenodd_2 {

	public Evenodd_2 () {
		
	}
     public int numCalc (int num1, int num2 ) {
    	 
     int sum= 0;
     for(int i=num1; i <= num2; i++) {
    	 sum=i;
     }
     return sum;     
     }
     public String evenodd_2(int sum) {     
     String result="";
     if(sum % 2 ==0) {
    	 result = "짝수";
     }else {
    	 result ="홀수";
     }return result;
     
     
	
     }
}
	
	
	
	
     
	
	
	
	
	
	
	
