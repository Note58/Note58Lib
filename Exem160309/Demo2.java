package Exem160309;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = 0;

		System.out.print("���ڸ� �Է��ϼ��� :");
		num1 = Integer.parseInt(scan.nextLine());
		if (num1 == 0) {
			System.out.println("�Է��Ͻ� ���ڴ� :" + num1 + "�Դϴ�.");
		}else {
			System.out.println("�Է��Ͻ� ���ڴ� : \'0\' �̾ƴմϴ�.");
			System.out.println("�Է��Ͻ� ���ڴ� :" + num1 + "�Դϴ�.");
		}
	}

}
