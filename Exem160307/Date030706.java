package Exem160307;

import java.util.Scanner;

public class Date030706 {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("ù��°�� : ");
		num1 = Integer.parseInt(scan.nextLine());
		System.out.println("�ι�°�� : ");
		num2 = Integer.parseInt(scan.nextLine());
		System.out.println("��� ������ : ");
		char calc = scan.nextLine().charAt(0);

		switch (calc) {
		case '+':
			System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
			break;
		case '-':
			System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
			break;
		case '*':
			System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
			break;
		case '/':
			System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
			break;
		case '%':
			System.out.println(num1 + "%" + num2 + "=" + (num1 % num2));
			break;
		default:
			System.out.println("�����Ŀ� ������ �ֽ��ϴ�.");
		}

	}

}
