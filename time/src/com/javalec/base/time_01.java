package com.javalec.base;

public class time_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str1 ="a";
        long startime1 = System.currentTimeMillis();
        
        for(int i=1; i<= 50000; i++) {
        	str1 = str1+ "a";
        }
	    long endtime1 = System.currentTimeMillis();
	    System.out.println("Term1 :" + (endtime1 - startime1));
	
	
	    
	    StringBuilder stringBuilder = new StringBuilder("a");
	    long endtime2 = System.currentTimeMillis();
	    for(int i=1; i<=50000; i++) {
	    	stringBuilder = stringBuilder.append("a");
	    }
	    
	    
	    System.out.println("Term2:" + (endtime2 - startime1));
	}

}
