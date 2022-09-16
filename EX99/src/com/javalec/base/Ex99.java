package com.javalec.base;

import java.util.Scanner;

public class Ex99 {

	public static void main(String[] args) {
		// //사용자에게 시작값과 끝값을 입력 받아 합계 구하기
		// 선언부

		// 몇개의 숫자를 입력하겠습니까 ?
		Scanner scanner = new Scanner(System.in);

		int starNum = 0;
		int endNum = 0;
		int sum = 0;
		int oddsum = 0; // 홀수의 합
		int evenSum = 0; // 짝수의 합
		double avg = 0; // 평균
		double oddavg = 0;// 수평균
		double evenavg = 0;// 짝수평균
		// -------------------------------

		System.out.println("시작값을 입력하세요.");
		starNum = scanner.nextInt();

		System.out.println("끝값을 입력하세요.");
		endNum = scanner.nextInt();

		for (int i = starNum; i <= endNum; i++) {
			sum += i;
			if (i % 2 == 0) {
				evenSum += i;
				evenavg += 1;
			} else if (i % 2 == 1) {
				oddsum += i;
				oddavg += 1;

			}
			avg = (double) sum / (endNum - starNum + 1);
			System.out.println("합계는" + sum + "입니다");
			System.out.println("홀수의 합계는" + oddsum + "입니다");
			System.out.println("짝수의 합계는" + evenSum + "입니다");
			System.out.println("평균은" + avg + "입니다");
			System.out.println("홀수평균은" + ((double) evenSum / evenavg) + "입니다");
			System.out.println("짝수평균은" + ((double) oddsum / oddavg) + "입니다");

		}

	}

}
