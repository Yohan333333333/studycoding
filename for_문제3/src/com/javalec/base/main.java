package com.javalec.base;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 구구단  출력
		
		//
//		for(int j=2; j<=9; j++) {//단 
//			System.out.println(">>>"+ j + "단<<<");
//			for(int i=1; i<=9; i++) {//곱해지는 수
//				System.out.println(j + "X"+ i + "=" + (5*i));
//			}
//	        System.out.println("----------------------");	
//		}
		for(int j=1; j<=9; j++) {
		 //System.out.print("\t"+ j + "단"+ "\t");
			for(int i=2; i<=9; i++) {
			 
				if(j%2==0 || i%2==0) {
					System.out.print(i + " X " + j + " = " + (j*i) + "\t");
				}else  {
//				System.out.print(i + " X " + j + " = " + (j*i) + "\t");
					System.out.print("\t\t");
				}
			}
			System.out.println("");
		}				
	}
}
			
	 
	
	
	
	
			
		
		
		
		
		
		
		
	

