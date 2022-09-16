package com.javalec.base;

import java.util.Scanner;

public class array2 {

	public static void main(String[] args) {
		//

		Scanner scanner = new Scanner(System.in);
		// 선언
//		int[] intNum = new int[5];
//		int tot=0;
//		double avg= 0.0;
//		
//		
//		for(int i = 0; i < intNum.length; i++) {
//		//배열사용 
//			System.out.println(i+1+"번의 숫자를 입력하세요.");
//			intNum[i] = scanner.nextInt();
//			tot += intNum[i];
//		}
//		avg =tot/intNum.length;
//		System.out.println("합계는" + tot + "평균은" + avg +"입니다"  );

		// -------------------------------------------------------------
		// 선언
		String[] names = { "james", "cathy", "kenny", "mantin", "Crystal" };
		int[] height = new int[names.length];
		int tot = 0;
		double avg = 0.0;
		int min = 300;
		int max = 0;
		int max_index = 0;
		int min_index = 0;

		for (int i = 0; i < height.length; i++) {
			System.out.println(names[i] + "의 신장을 구하세요.");
			height[i] = scanner.nextInt();
			tot += height[i];
		}
		avg = tot / height.length;
		System.out.println("평균신장" + avg + "입니다,");

		for (int i = 0; i < names.length; i++) {
			if (max < height[i]) {
				max = height[i];
				max_index = i;
			} else if (min > height[i]) {
				min = height[i];
				min_index = i;

			}
		}
		System.out.println("가장 큰 사람은" + names[max_index] + "이고 그학생의 신장은 " + height[max_index] + "입니다.");
		System.out.println("가장 작은 사람은" + names[min_index] + "이고 그학생의 신장은 " + height[min_index] + "입니다.");

	}
}
