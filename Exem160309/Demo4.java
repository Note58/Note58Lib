package Exem160309;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score = 0;
		int i = 0;

		System.out.print("점수를 입력하세요 (100점 만점):");
		score = Integer.parseInt(scan.nextLine());
		switch (score / 10) {
		case 9:
			if (score >= 95) {
				System.out.println("+A 학점");
				break;
			} else {
				System.out.println("A 학점");
				break;
			}
		case 8:
			if (score >= 85) {
				System.out.println("+B 학점");
				break;
			} else {
				System.out.println("B 학점");
				break;
			}
		case 7:
			if (score >= 75) {
				System.out.println("+C 학점");
				break;
			} else {
				System.out.println("C 학점");
				break;
			}
		case 6:
			if (score >= 65) {
				System.out.println("+D 학점");
				break;
			} else {
				System.out.println("D 학점");
				break;
			}
		case 10:
			System.out.println("++A 학점");
				break;
			
		case 5:
			if (score >= 55) {
				System.out.println("+F 학점");break;
			} else {
				System.out.println("F 학점");break;
			}
		default : 
			System.out.println("낙제입니다");
		}
		// if (score >= 90) {
		// if (score >= 95) {
		// System.out.println("+A 학점");
		// } else {
		// System.out.println("A 학점");
		// }
		// } else if (score >= 80) {
		// if (score >= 85) {
		// System.out.println("+B 학점");
		// } else {
		// System.out.println("B 학점");
		// }
		// } else if (score >= 70) {
		// if (score >= 75) {
		// System.out.println("+C 학점");
		// } else {
		// System.out.println("C 학점");
		// }
		// } else if (score >= 60) {
		// if (score >= 65) {
		// System.out.println("+D 학점");
		// } else {
		// System.out.println("D 학점");
		// }
		// } else {
		// if (score >= 55) {
		// System.out.println("+F 학점");
		// } else {
		// System.out.println("F 학점");
		// }
		//
		// }
	}

}
