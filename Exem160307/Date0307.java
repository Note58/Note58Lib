package Exem160307;

import java.util.Scanner;

public class Date0307 {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int sum = 0;
		String str = null;
		char calc = '\0';

		Scanner scan = new Scanner(System.in);// �Է��� ���ڿ��� ����

		System.out.print("ù��° ���� �Է� :");
		str = scan.nextLine();
		num1 = Integer.parseInt(str);

		System.out.print("�ι�° ���� �Է� :");
		str = scan.nextLine();
		num2 = Integer.parseInt(str);

		System.out.print("��� ��� ����(+,-,*,/,%) :");
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
//			System.out.println("������ ���� ����Դϴ�.");
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
			System.out.println("������ ���� ����Դϴ�.");
			break;

		}

		System.out.println("��� ��� :" + num1 + calc + num2 + "=" + sum);

	}

}
