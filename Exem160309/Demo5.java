package Exem160309;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {

		int score = 0;
		String score1 = null;
		char first = 0;
		char second = 0;
		char third = 0;
		String str = null;
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.print("������ �Է��ϼ��� : ");
			str = scan.nextLine();
			if (str.length() == 3) { // 3�ڸ� ���ڸ� �޾�����
				first = str.charAt(0);
				second = str.charAt(1);
				third = str.charAt(2);
			} else if (str.length() == 2) {//2�ڸ� ���ڸ� �޾�����
				first = str.charAt(0);
				second = str.charAt(1);
				third = 'A';
			} else if (str.length() == 1) {//1�ڸ� ���ڸ� �޾�����
				first = str.charAt(0);
				second = 'A';
				third = 'A';
			}

			score = Integer.parseInt(str);
			if (score > 100){System.out.println("��� �����Ⱦ�!");continue;}// 100������ ū���� �Է��� ��� ���
			

			switch (first) {
			case '9':
				if (second == 'A') { //1�ڸ����ڸ� �޾����� ���� �˻�
					score1 = "����";
				} else if (second >= '5') {//2�ڸ� �̻� �޾����� + ���� �˻�
					score1 = "+A";
				} else {
					score1 = "A";
				}
				break;
			case '8':
				if (second == 'A') {
					score1 = "����";
				} else if (second >= '5') {
					score1 = "+B";
				} else {
					score1 = "B";
				}
				break;
			case '7':
				if (second == 'A') {
					score1 = "����";
				} else if (second >= '5') {
					score1 = "+C";
				} else {
					score1 = "C";
				}
				break;
			case '6':
				if (second == 'A') {
					score1 = "����";
				} else if (second >= '5') {
					score1 = "+D";
				} else {
					score1 = "D";
				}
				break;
			case '5':
				if (second == 'A') {
					score1 = "����";
				} else if (second >= '5') {
					score1 = "+E";
				} else {
					score1 = "E";
				}
				break;
			case '4':
				if (second == 'A') {
					score1 = "����";
				} else if (second >= '5') {
					score1 = "+F";
				} else {
					score1 = "F";
				}
				break;
			case '1':
				if (second == 'A') { // 1�ڸ����� �޾����� �˻�
					score1 = "����";
				} else if (third >= 'A') {//2�ڸ����� �޾����� �˻�
					score1 = "F";
				} else {//100���� ��� 
					score1 = "++A";
				}
				break;
			default:
				score1 = "����";
			}
			System.out.println(score1 + "�����Դϴ�.");
		}

	}

}
