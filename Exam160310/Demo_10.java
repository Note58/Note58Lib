package Exam160310;

import java.util.Scanner;

public class Demo_10 {

	public static void main(String[] args) {
		char char1 = '\0';
		String str1 = null;
		String str2 = null;
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("����ҹ���,����,�ѱ۸���,�ѱ�����,Ư������ �ϳ��� �Է����ּ���\n�ϼ��� �ѱ��� �ν����� �ʽ��ϴ�(�����÷��� [����] �Է�): ");
			str1 = scan.nextLine();
			char1 = str1.charAt(0);
			if (str1 .equals("����")) {
				System.out.println("�����ڽ��ϴ�");
				break;
			}else if (str1.length() >= 2) {
				System.out.println("���ڸ��� �Է����ּ���");
				continue;
			}

			if (char1 >= 'a' && char1 <= 'z') {
				str2 = "�ҹ���";
			} else if (char1 >= 'A' && char1 <= 'Z') {
				str2 = "�빮��";
			} else if (char1 >= '0' && char1 <= '9') {
				str2 = "����";
			} else if (char1 >= '��' && char1 <= '��') {
				str2 = "�ѱ�";
			} else {
				str2 = "Ư������";
			}
			System.out.println("�Է��Ͻ� ���ڴ� : " + str1 + " " + str2 + "�Դϴ�.");

		}

	}

}
