package Exem160307;

import java.util.Scanner;

public class Date030701 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int num = Integer.parseInt(scan.nextLine());
		String numst = Integer.toBinaryString(num);
		System.out.printf("number = %d 이진법 표현 = %s",num,numst);
				

	}

}
