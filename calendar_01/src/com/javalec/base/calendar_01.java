package com.javalec.base;

import java.util.Calendar;

public class calendar_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Calendar calendar = Calendar.getInstance(); //현재의 년월일 시초 가져옴 클라스 인스턴스
	    
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH)+1;
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		int minute =calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		
		String dayer[] = { "월", "화","수","목","금","토","일"};  
		System.out.println(year+"."+month+"."+day);
		System.out.println(hour +":"+minute+":"+second );
		System.out.println(dayer[calendar.get(Calendar.DAY_OF_WEEK)-1]);
		
		
	}

}
