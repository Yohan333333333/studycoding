package com.javelec.base;

import java.util.Scanner;

public class ififif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 제일 중요한거 이프 폴 커넥션 클라스 메소드 !!!!!!!!!
		//컬렉션을 이해하면 빅데이터를 안다
		//시나리오 짜듯이 한다!!!! 
		//지금은 프로그램 언어배우기
		//실행시키는 메소드가 메인 메소드이다
		Scanner scanner = new Scanner(System.in);
		//클래스,타입.   객체     ------------------------생성자       
		        //오브젝트
		
		String strID = null; //ID
		String strPW = null; //Password
		               //널의 의미 아직 데이터가 잡히진 않았으나 입력이 안된상태.
		System.out.println("ID를 입력하세요!");
		strID =  (scanner.next());
		
		System.out.println("Password를 입력하세요!");
		strPW =  (scanner.next());
		
	    //id root pw 1234
		if (strID.equals("root")&& strPW.equals("1234")) {
	//		System.out.println("환영합니다!");
	//	} else {
	//	    System.out.println("ID와PW를 확인하세요!");	   
		}
	    if(strID.equals("root")) {
	    	System.out.println("***환영합니다.");
	    }else {
	    	System.out.println("***PW를 확인하세요!");
	    }
	    	
	    
		
		scanner.close(); //클로즈는 메모리 정리를 위해 마지막에 쓴다.
	    
	}

}
