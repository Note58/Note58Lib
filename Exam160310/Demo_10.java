package Exam160310;

import java.util.Scanner;

public class Demo_10 {

	public static void main(String[] args) {
		char char1 = '\0';
		String str1 = null;
		String str2 = null;
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("영대소문자,숫자,한글모음,한글자음,특수문자 하나를 입력해주세요\n완성형 한글은 인식하지 않습니다(끝내시려면 [종료] 입력): ");
			str1 = scan.nextLine();
			char1 = str1.charAt(0);
			if (str1 .equals("종료")) {
				System.out.println("끝내겠습니다");
				break;
			}else if (str1.length() >= 2) {
				System.out.println("한자리만 입력해주세요");
				continue;
			}

			if (char1 >= 'a' && char1 <= 'z') {
				str2 = "소문자";
			} else if (char1 >= 'A' && char1 <= 'Z') {
				str2 = "대문자";
			} else if (char1 >= '0' && char1 <= '9') {
				str2 = "숫자";
			} else if (char1 >= 'ㄱ' && char1 <= 'ㆎ') {
				str2 = "한글";
			} else {
				str2 = "특수문자";
			}
			System.out.println("입력하신 문자는 : " + str1 + " " + str2 + "입니다.");

		}

	}

}
