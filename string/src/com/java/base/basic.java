package com.java.base;

public class basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //API
		String str = "aaaa";
	    
	    			
  	    String str2 ="abcdefg";
  	    String str3 ="FDAFSFASFA";
  	    String str4 ="GRWQERQTQT";
  	    String str5 ="    avd    wed  fewf";
  	    String str6 ="    ewffwfe     ";
  	    
	    System.out.println(str2.concat(str2));
	    System.out.println(str2.substring(3));
	    System.out.println(str2.substring(3,5));
	
	    String abc =str2.substring(3, 5);
	    
	    System.out.println(str2.length());//스트링은 캐릭터 하나하나로 구성되있음. 
	    System.out.println(str2.toUpperCase());//사용자가 뭐라쓰든 난 대문자로 입력하겟다
	    System.out.println(str2.toLowerCase());//사용자가 뭐라쓰든 난 소문자로 입력하겟다
	    //스트링은 캐릭터 하나하나로 구성되있음. 
	
	    System.out.println(str2.equals(str3));// 2와 3이 같냐
	    System.out.println(!str2.equals(str3));// 2와 3이 같지 않냐  ( ! =not )
	    System.out.println(str5.trim());// 트림은 앞뒤 공백을 없앤다.
        System.out.println(str5.length());//
        System.out.println(str5.trim().length());//str5의 앞,뒤 공백을 삭제하는 방법. 
	    
	    System.out.println(str2.replace('a', 'Z'));//a를 Z로 바꾸겠다. 
	    System.out.println(str2.replaceAll("abc", "aaaaaa"));// abc를 aaaaa로 바꾸겠다.
	    System.out.println(str2.replaceAll("abc", "   "));// abc를    로 바꾸겠다.(앞 글자의 칸수만큼 지우기)
	    
	    
	    
	   
	    
	}

}
