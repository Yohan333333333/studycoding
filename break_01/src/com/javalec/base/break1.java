package com.javalec.base;

public class break1 {

	public static void main(String[] args) {
		// 1에서 100까지 출력중 10을 만나면 find라는 글자를 출력하고 종료하기 
             //for문이든 while문이든 브레이크로 빠져나옴
		 for( int i=0; i<=100; i++) {
			 if(i%10==0) { 
//				 System.out.println("Find");
//				 break;
				 continue;
			 }
             System.out.println(i);		 
		 }
	}

}
