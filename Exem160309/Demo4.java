package Exem160309;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score = 0;
		int i = 0;

		System.out.print("������ �Է��ϼ��� (100�� ����):");
		score = Integer.parseInt(scan.nextLine());
		switch (score / 10) {
		case 9:
			if (score >= 95) {
				System.out.println("+A ����");
				break;
			} else {
				System.out.println("A ����");
				break;
			}
		case 8:
			if (score >= 85) {
				System.out.println("+B ����");
				break;
			} else {
				System.out.println("B ����");
				break;
			}
		case 7:
			if (score >= 75) {
				System.out.println("+C ����");
				break;
			} else {
				System.out.println("C ����");
				break;
			}
		case 6:
			if (score >= 65) {
				System.out.println("+D ����");
				break;
			} else {
				System.out.println("D ����");
				break;
			}
		case 10:
			System.out.println("++A ����");
				break;
			
		case 5:
			if (score >= 55) {
				System.out.println("+F ����");break;
			} else {
				System.out.println("F ����");break;
			}
		default : 
			System.out.println("�����Դϴ�");
		}
		// if (score >= 90) {
		// if (score >= 95) {
		// System.out.println("+A ����");
		// } else {
		// System.out.println("A ����");
		// }
		// } else if (score >= 80) {
		// if (score >= 85) {
		// System.out.println("+B ����");
		// } else {
		// System.out.println("B ����");
		// }
		// } else if (score >= 70) {
		// if (score >= 75) {
		// System.out.println("+C ����");
		// } else {
		// System.out.println("C ����");
		// }
		// } else if (score >= 60) {
		// if (score >= 65) {
		// System.out.println("+D ����");
		// } else {
		// System.out.println("D ����");
		// }
		// } else {
		// if (score >= 55) {
		// System.out.println("+F ����");
		// } else {
		// System.out.println("F ����");
		// }
		//
		// }
	}

}
