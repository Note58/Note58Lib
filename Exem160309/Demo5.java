package Exem160309;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {

		int score = 0;
		char first = 0;
		char second = 0;
		String str = null;
		String score1 = null;
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.print("점수를 입력하세요 : ");
			str = scan.nextLine();
			if (str.length() != 1) { 
				first = str.charAt(0);
				second = str.charAt(1);
			}
			score = Integer.parseInt(str);
			if (score > 100) {
				System.out.println("어디서 약을팔아!");
				continue;
			} // 100점보다 큰수를 입력할 경우 출력

			switch (first) {
			case '9':
				if (second == 'A') { // 1자리숫자만 받았을때 부터 검사
					score1 = "낙제";
				} else if (second >= '5') {// 2자리 이상 받았을때 + 학점 검사
					score1 = "+A";
				} else {
					score1 = "A";
				}
				break;
			case '8':
				if (second == 'A') {
					score1 = "낙제";
				} else if (second >= '5') {
					score1 = "+B";
				} else {
					score1 = "B";
				}
				break;
			case '7':
				if (second == 'A') {
					score1 = "낙제";
				} else if (second >= '5') {
					score1 = "+C";
				} else {
					score1 = "C";
				}
				break;
			case '6':
				if (second == 'A') {
					score1 = "낙제";
				} else if (second >= '5') {
					score1 = "+D";
				} else {
					score1 = "D";
				}
				break;
			case '5':
				if (second == 'A') {
					score1 = "낙제";
				} else if (second >= '5') {
					score1 = "+E";
				} else {
					score1 = "E";
				}
				break;
			case '4':
				if (second == 'A') {
					score1 = "낙제";
				} else if (second >= '5') {
					score1 = "+F";
				} else {
					score1 = "F";
				}
				break;
			case '1':
				if (score == 100) { // 1자리수만 받았을때 검사
					score1 = "++A";
				} else if (second == 'A') {
					score1 = "낙제";
				} else {// 100점일 경우
					score1 = "F";
				}
				break;
			default:
				score1 = "F";
			}
			if (str.length() == 1) {
				score1 = "낙제";
			}
			System.out.println(score1 + "학점입니다.");
		}

	}
	

}
