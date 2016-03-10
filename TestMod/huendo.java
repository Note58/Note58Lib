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
		System.out.print("가위 , 바위 , 보 선택 :");
		jjang = scanner.nextLine();

		switch (jjang) {
		case "가위":
			jjang2 = 1;
			break;
		case "바위":
			jjang2 = 2;
			break;
		case "보":
			jjang2 = 3;
			break;
		}

		switch (value) {
		case 1:
			com = "가위";
			break;
		case 2:
			com = "바위";
			break;
		case 3:
			com = "보";
			break;
		}
		System.out.print("컴퓨터는 " + com + " : ");

		result = jjang2 - value;

		if (result == 1 | value == -2) {
			System.out.println("당신이 이겼습니다.");
		} else if (result == 0) {
			System.out.println("비겼습니다.");

		} else if (result == -1 | result == 2) {
			System.out.println("컴퓨터가 이겼습니다.");
		}

	}
}