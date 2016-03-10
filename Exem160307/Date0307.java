package Exem160307;

import java.util.Scanner;

public class Date0307 {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int sum = 0;
		String str = null;
		char calc = '\0';

		Scanner scan = new Scanner(System.in);// 입력을 문자열로 리턴

		System.out.print("첫번째 정수 입력 :");
		str = scan.nextLine();
		num1 = Integer.parseInt(str);

		System.out.print("두번째 정수 입력 :");
		str = scan.nextLine();
		num2 = Integer.parseInt(str);

		System.out.print("계산 방식 선택(+,-,*,/,%) :");
		str = scan.nextLine();
		calc = str.charAt(0);

//		if (calc == '+') {
//			sum = num1 + num2;
//		} else if (calc == '-') {
//			sum = num1 - num2;
//		} else if (calc == '/') {
//			sum = num1 / num2;
//		} else if (calc == '*') {
//			sum = num1 * num2;
//		} else if (calc == '%') {
//			sum = num1 % num2;
//		} else {
//			System.out.println("계산식이 없는 방식입니다.");
//		}

		switch (calc) {
		case '%':
			sum = num1 % num2;
			break;
		case '/':
			sum = num1 / num2;
			break;
		case '*':
			sum = num1 * num2;
			break;
		case '+':
			sum = num1 + num2;
			break;
		case '-':
			sum = num1 - num2;
			break;
		default:
			System.out.println("계산식이 없는 방식입니다.");
			break;

		}

		System.out.println("계산 결과 :" + num1 + calc + num2 + "=" + sum);

	}

}
