package TestMod;

import java.util.Scanner;

public class huendo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double dRandom = 0.0;
		int value = 0;
		String jjang = null;
		String com = null;
		int result = 0;
		int jjang2 = '0';

		dRandom = Math.random();
		value = (int) (dRandom * 3) + 1;
		System.out.print("���� , ���� , �� ���� :");
		jjang = scanner.nextLine();

		switch (jjang) {
		case "����":
			jjang2 = 1;
			break;
		case "����":
			jjang2 = 2;
			break;
		case "��":
			jjang2 = 3;
			break;
		}

		switch (value) {
		case 1:
			com = "����";
			break;
		case 2:
			com = "����";
			break;
		case 3:
			com = "��";
			break;
		}
		System.out.print("��ǻ�ʹ� " + com + " : ");

		result = jjang2 - value;

		if (result == 1 | value == -2) {
			System.out.println("����� �̰���ϴ�.");
		} else if (result == 0) {
			System.out.println("�����ϴ�.");

		} else if (result == -1 | result == 2) {
			System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
		}

	}
}