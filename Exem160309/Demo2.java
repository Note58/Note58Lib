package Exem160309;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = 0;

		System.out.print("숫자를 입력하세요 :");
		num1 = Integer.parseInt(scan.nextLine());
		if (num1 == 0) {
			System.out.println("입력하신 숫자는 :" + num1 + "입니다.");
		}else {
			System.out.println("입력하신 숫자는 : \'0\' 이아닙니다.");
			System.out.println("입력하신 숫자는 :" + num1 + "입니다.");
		}
	}

}
