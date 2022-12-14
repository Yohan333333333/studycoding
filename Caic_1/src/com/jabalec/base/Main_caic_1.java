package com.jabalec.base;

public class Main_caic_1 {

	public static void main(String[] args) {
		// 연산자 종류별 출력
		int num1 = 10, num2 = 2, num3 = 5;

		System.out.println("<<<< 산술 연산자 >>>>");
		System.out.println("덧셈:" + num1 + " + " + num2 + "=" + (num1 + num2));

		System.out.println("뺄셈:" + num1 + " - " + num2 + "=" + (num1 - num2));
		System.out.println("나눗셈: " + num1 + " / " + num2 + "=" + (num1 / num2));
		System.out.println("나눗셈나머지:" + num1 + " % " + num2 + "=" + (num1 % num2));
		// 나눗셈 나머지를 많이씀
		System.out.println("<<<< 자동증감 연산자 >>>>");
		// 자동 증감 연산자
		// num1 = num1 +1;
		// num1 += 1;
		num1++;

		System.out.println("증가 :" + num1);

		num1 = num1 - 1;
		num1 -= 1;
		num1--;
		// 간단하게 쓰라고 나온거
		System.out.println("감소 :" + num1);

		System.out.println("<<<< 동등비교 관계 연산자 >>>>");
		System.out.println("num1 == num2 : " + (num1 == num2));
		// 넘원과 넘투가 같냐 라는 = 조건문 즉 아이디등을 입력했을떄 맞는지 ?
		System.out.println("num1 !== num2 : " + (num1 != num2));
		// 넘원과 넘투가 틀리냐 !=틀리냐를 표현
		System.out.println("num1 > num2 : " + (num1 > num2));
		// 넘원이 넘투보다 크냐
		System.out.println("num1 < num2 : " + (num1 < num2));
		// 넘원이 넘투보다 작냐
		System.out.println("num1 >= num2 : " + (num1 >= num2));
		// 넘원이 넘투랑크거나 같냐
		// 부호 순서 맞춰야함 => 는 안됨
		System.out.println("num1 <= num2 : " + (num1 <= num2));
		// 넘원이 넘투보다 작거냐 같냐

		System.out.println("<<<< 논리  연산자 >>>>");
		System.out.println(num1 + ">" + num2 + "&&" + num2 + ">" + num3 + " : " + ((num1 > num2) && (num2 > num3)));
		System.out.println(num1 + ">" + num2 + "||" + num2 + ">" + num3 + " : " + ((num1 > num2) || (num2 > num3)));
		//
		// 앤드조건은 모두가참일때만 참이고 하나라도틀리면 거짓 &&
		// or조건은 하나만 맞아도 참이다 모두가 틀리면 거짓 ||
		System.out.println("<<<< 삼항  연산자 >>>>");
		String result = num3 == 5 ? "Yes" : "No";

		System.out.println("삼항 연산 결과 (num3 == 5 ? 1:2) : " + (num3 == 5 ? "YES" : "NO"));

	}

}
