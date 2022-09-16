package com.javalec.base;

public class SumEvenOdd {

	public SumEvenOdd() {
		// TODO Auto-generated constructor stub
	
	}
  	//퍼블릭은 오픈한다 비밀은 프라이빗  퍼블릭뒤에 예를들어 인ㅌ트 더블 불린스트링//  안줄거야 는 로이드 
    public  int sumCalc(int startNum, int endNum) {
    	int sum = 0;
    	for(int i=startNum; i<=endNum; i++) {
    		sum+=i;
    		
    	
    	}
    return sum;	
    }
    public String evenOdd(int sum) {
    	String result="";
    	if(sum % 2 ==0) {
    		result = "짝수";
    	}else {
    		result ="홀수";
    		
    	}return result;
     
    }
    
    
    
	
	
}
