package com.javalec.com;

import com.javalec.function.Car;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Car car = new Car();
		  
		  System.out.println("제작회사 :" + car.company);
		  System.out.println("모델명 :" + car.model);
		  System.out.println("색상 :" +car.color);
		  System.out.println("최고속도 :" +car.maxspeed);
		  System.out.println("현대속도 :" +car.speed);
				  
		  car.maxspeed = 60;
		  System.out.println("수정된 속도 :"+ car.speed);
		  
		  Car myCar = new Car();
		  System.out.println("my cardml 속도:" + myCar.speed);
	      System.out.println(car == myCar);
	
	}

}
