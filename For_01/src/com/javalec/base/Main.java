package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //반복문
		int tot = 0; //누적합용
		int i =0;
		
		//범위가 정해져있을떄 자주쓰는 반복문 for 	
	   for(i =1; i <= 10; i++) {
		        //초기값(이프) 비교값  증가값
	      tot = tot + i ;
	      
	   }
	   tot = 0;
	   for(i =1; i <= 10; i++) {
         tot +=1;	   
	   }
	   
	    System.out.println("1부터"+ --i +"까지의 합은"+tot);
	    
	
	
	} 
	
	

}
