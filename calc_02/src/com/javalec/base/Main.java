package com.javalec.base;

import java.util.Scanner;
//가져오다 패키지안에 클라스의 메소드가 구성이 되어있다.
public class Main {

	public static void main(String[] args) {
		// 사용자의 입력값이 짝수 인지 홀수 인지 알려주기!
	    // 컨트롤 스페이스 누르면 썻던거 나옴 
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력해 주세요 :" ); 
		int num1 = scanner.nextInt();
		
		String result = (num1 % 2) == 0  ? "짝수" : "홀수"; 
	
		System.out.println("입력한 숫자" +result + "입니다.");
		
//제어문control
		//상황을 판단하여 트루일경우와 퍼즈일경우를 판단하는 (ex:문장if..)
		
		//반복문loop
	//상황을 판단하여 트루일경우 동일한 작업을 반복
	
		
		
     System.out.println();
	}

}
