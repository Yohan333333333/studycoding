package com.javalec.base;

public class Maincalss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int i = 1;
       int j =10;
       int sum= 0;
       String result ="";
       
       
       SumEvenOdd evenOdd1 = new SumEvenOdd();
       sum = evenOdd1.sumCalc(i, j);
       result = evenOdd1.evenOdd(sum);
       System.out.println(i + "~" + j +"의 합은 "+ sum +"입니다");
       
		//개발은 planing이 필요하다. = process  -> 리서치앤 디벨롭먼트 ->  
		  //*시스템을 본느것이 중요하다.
		
		
		
	}

}
