package com.javalec.base;

import java.util.Scanner;

public class basic_line {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int[] score = { 100 };
		int[] num1 = new int[score.length];
		int tot = 0;
		int avg = 0;

		for (int i = 0; i < num1.length; i++) {
			System.out.println("몇개의 숫자를 입력하겠습니까?");
			score[i] = scanner.nextInt();
			System.out.println("번째 숫자를 입력하세요.");
			i = scanner.nextInt();
			tot = score[i];
		}

	}

}
