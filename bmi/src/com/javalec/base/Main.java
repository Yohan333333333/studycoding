package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//BMI공식 = 몸무게(kg) / (키(m)  *  키(m))
	
		
		
		//선
		Scanner scanner = new Scanner(System.in);
		double Kg = 0;
		double CM  = 0;
		double Bmi = 0;
		String result = "";
		
		//
		System.out.println("몸무게를 입력하세요.(Kg)");
		 Kg = scanner.nextInt();
		 
		 
		 System.out.println("신장을 입력하세요.(CM)");
		 CM =  scanner.nextInt()/100.0;
         
		 Bmi = Kg/(CM*CM);
		    if (Bmi>=30) {
		    	result = "고도비만";
		    }
		    else if (Bmi>=25) {
		    	result = "비만";
		    }   		
		    else if (Bmi>=23) {
		    	result ="과체중";
		    	
		    }   
		    else if (Bmi>=18.5){
		        result ="정상체중";
			
		    }   
		    else if (Bmi>=0&&Bmi<18.5){
			    result = "저체중";
		    }   
			 
		    System.out.println("당신의BMI지수는" + Bmi + " 이므로 당신은 " + result +"입니다");
		    
		    
		
}
	   
	    		
	
	
				 

}
