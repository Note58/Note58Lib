package Exam160310;

import java.util.Scanner;

public class Demo_10 {

	public static void main(String[] args) {
		char char1 = '\0';
		String str1 = null;
		String str2 = null;
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("문자 하나를 입력해주세요 : ");
			str1 = scan.nextLine();
			char1 = str1.charAt(0);
			if (str1.length() >= 2) {
				System.out.println("한자리만 입력해주세요");
				continue;
			}

			if (char1 >= 'a' && char1 <= 'z') {
				str2 = "소문자";
			} else if (char1 >= 'A' && char1 <= 'Z') {
				str2 = "대문자";
			} else if (char1 >= '0' && char1 <= '9') {
				str2 = "숫자";
			} else {
				str2 = "특수문자";
			}
			System.out.println("입력하신 문자는 : " + str1 + " " + str2 + "입니다.");
			if (char1 == 'q' || char1 == 'Q') {
				break;
			}

		}

	}

}
