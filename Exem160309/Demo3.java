package Exem160309;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score = 0;

		System.out.print("������ �Է��ϼ��� :");
		score = Integer.parseInt(scan.nextLine());
		if (score >= 90) {
			if (score >= 95) {
				System.out.println("+A ����");
			} else {
				System.out.println("A ����");
			}
		} else if (score >= 80) {
			if (score >= 85) {
				System.out.println("+B ����");
			} else {
				System.out.println("B ����");
			}
		} else if (score >= 70) {
			if (score >= 75) {
				System.out.println("+C ����");
			} else {
				System.out.println("C ����");
			}
		} else if (score >= 60) {
			if (score >= 65) {
				System.out.println("+D ����");
			} else {
				System.out.println("D ����");
			}
		} else {
			if (score >= 55) {
				System.out.println("+F ����");
			} else {
				System.out.println("F ����");
			}

		}

	}
}
