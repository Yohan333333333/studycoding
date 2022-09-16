package com.javalec.base;

public class basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         StringBuilder stringBuilder = new StringBuilder("abcdefg");
         StringBuffer  stringBuffer =new StringBuffer("12345");
	
	    System.out.println(stringBuilder);
	    stringBuilder.append("hidwqd");
	    stringBuilder.insert(3, "zzz");// 어펜드 안에 3번쨰 안부터 추가 
	    stringBuilder.delete(3, 5); //어펜드안에 3번쨰 5번째 글자를 지운다,
	    
	    
	    
	    
	    System.out.println(stringBuilder);
	}

}
