package com.javalec.base;

import java.util.Scanner;

public class dndjdjd {

	public static void main(String[] args) {
		// 선
		Scanner scanner = new Scanner(System.in);

		int num1 = 0;
		int num2 = 0;
		int rest = 0;
		int start = 0;
		int stop = 0;
		int min = 0;
		int max = 0;
		int cnt = 0;
		int sum = 0;
		int avg = 0;
		System.out.println("시작하는 숫자를 정하세요.");
		num1 = scanner.nextInt();
		System.out.println("범위의 끝 숫자를 정하세요.");
		num2 = scanner.nextInt();
		System.out.println("원하는 나머지 값의 수는?");
		rest = scanner.nextInt();

		start = num1;
		stop = num2;

		if (num1 > num2) {
			start = num2;
			stop = num1;

		}
		min = stop;
		max = start;
		for (int i = start; i <= stop; i++) {
			if (i % 10 == rest) {
				cnt++;
				sum = sum + i;

				if (i < min) {
					min = i;
				}
				if (i > max) {
					max = i;

				}

			}

		}
		avg = sum / cnt;
		System.out.println(num1 + "부터" + num2 + "의 범위중 10으로 나눠었을 경우");
		System.out.println("나머지가" + rest + "인 숫자의 갯수는" + cnt + "개이고 합" + sum + "이다");
		System.out.println("나머지가" + rest + "인 숫자의 평균은" + avg + "이다");
		System.out.println("나머지가" + rest + "인 숫자의 최대 합계는" + max + "이고 최소 숫자는" + min + "이다");

	}

}
