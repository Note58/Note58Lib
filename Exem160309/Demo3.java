package Exem160309;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score = 0;

		System.out.print("점수를 입력하세요 :");
		score = Integer.parseInt(scan.nextLine());
		if (score >= 90) {
			if (score >= 95) {
				System.out.println("+A 학점");
			} else {
				System.out.println("A 학점");
			}
		} else if (score >= 80) {
			if (score >= 85) {
				System.out.println("+B 학점");
			} else {
				System.out.println("B 학점");
			}
		} else if (score >= 70) {
			if (score >= 75) {
				System.out.println("+C 학점");
			} else {
				System.out.println("C 학점");
			}
		} else if (score >= 60) {
			if (score >= 65) {
				System.out.println("+D 학점");
			} else {
				System.out.println("D 학점");
			}
		} else {
			if (score >= 55) {
				System.out.println("+F 학점");
			} else {
				System.out.println("F 학점");
			}

		}

	}
}
