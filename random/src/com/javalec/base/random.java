package com.javalec.base;

import java.util.Random;

public class random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		String  rps[] = { "r", "p","s"};
		Random random =new Random();
		
		System.out.println( rps [random.nextInt(3)] + rps [random.nextInt(3)]);
		
		
		
		
	}

}
