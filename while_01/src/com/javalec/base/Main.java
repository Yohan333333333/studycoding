package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// 반복문
		int i=0, tot =0;
		
		while(true) {
			tot+=i;
			i++;
		if (i>100) {
			//브레이크는 반복문을 빠진다 이프빠지는게 아님
			//ex 스위치에서 빠지지 케이스에서 빠지지않는다.
			//데이터베이스에서 데이터 가져올때 많이씀
			break;
		   }
		}
        //문제는 포문을 가지고와일문을 다루면 좋음
		System.out.println(tot);
		
	}

}
