package com.javalec.base;

public class intString_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		
		int num1=123;
		String str1 ="12345";
		String str2 ="abcde";
		String str3 =Integer.toString(num1);//저 숫자는 문자로 바뀜 대문자 인티저가 해준다.
		System.out.println(str2.concat(str3));
		
	int num2 = Integer.parseInt(str1);
	System.out.println(num1 + num2 );
	}

}
