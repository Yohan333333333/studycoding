package com.javalec.base;

import java.util.Stack;

public class array1 {

	public static void main(String[] args) {
		//배열 (array)
		//문자열 7개를 넣을수 있는 배열 공간 만들기
//	    String str= "aaa";
//	     String str1 = new String("aaa");
//		 7개가 있으면 방이 0번부터 6까지 	     
	     /*
		String[] str = new String[7];
	     
		str[0] = "일요일";
		str[1] = "월요일";
		str[2] = "화요일";
		str[3] = "수요일";
		str[4] = "목요일";
		str[5] = "금요일";
		str[6] = "토요일";
		//length 리턴값이 인트다 (갯수 알려주는것) 
		for(int i=0; i<str. length; i++) {
			System.out.println(str[0]);
			
		}
	      System.out.println(str.length);

	}

}
*/
		//뱌열의 초기값을 넣고 작업하기 
		
//	     int[] intNum = {1,5,8,12,200,1002}; 
//	     int tot=0;
//	     double  avg =0.0;
//	     
//	     for(int i =0; i<intNum.length; i++) {
//	    	 System.out.println(intNum[i]);
//	     
//	     }
//	
//
//     //배열의 평균 구하기 
//     for(int i=0; i<intNum.length; i++) {
//    	 tot+=intNum[i];
//     }
//     System.out.println(tot);
//     avg =(Double)tot/intNum.length;
//     System.out.println("평균:" +avg);
//     
         			 
//배열의 해당되는 구구단 출력하기 
		int[] intNum = {5, 3, 9};
	for(int j=1; j<=9;   j++) {
		for(int i=1; i<=9; i++) {
			
			
			System.out.println(i +"X" + j + " = " + (j*i) + "\t");
			 
			     System.out.print("\t\t");	
			     
			System.out.println("");
		}
	}
	
		 








}
	}

