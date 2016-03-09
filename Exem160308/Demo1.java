package Exem160308;

import java.util.Scanner;

public class Demo1 {
	public static void Stop(String str) {
		char calc = '\0';
		calc = str.charAt(0);

		if (calc == 'q' || calc == 'Q') {
			System.out.println("정수를 입력하세요");
			
		}

	}

	public static void main(String[] args) {

		int num1, num2, sum = 0;
		char[] cal2 = { '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' };
		String str = null;
		char calc = '\0';
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("첫번째 수를 입력하세요 >");
			str = scan.nextLine();
			Stop(str);
			num1 = Integer.parseInt(str);
			System.out.print("두번째 수를 입력하세요 >");
			str = scan.nextLine();
			calc = str.charAt(0);
			if (calc == 'q' || calc == 'Q') {
				System.out.println("정수를 입력하세요");
				continue;
			}
			num2 = Integer.parseInt(str);
			System.out.print("계산식을 입력하세요(+,-,*,/,%,p(종료)) >");

			calc = scan.nextLine().charAt(0);

			if (calc == 'q' || calc == 'Q') {
				break;
			}
			switch (calc) {
			case '+':
				sum = num1 + num2;
				break;
			case '/':
				sum = num1 / num2;
				break;
			case '*':
				sum = num1 * num2;
				break;
			case '-':
				sum = num1 - num2;
				break;
			case '%':
				sum = num1 % num2;
				break;
			default:
				calc = '\0';
			}
			if (calc == '\0') {
				System.out.println("계산식이 없습니다.");
			} else {
				System.out.println("계산결과 :" + sum);
			}
		}
	}
}
