package Exem160307;

import java.util.Scanner;

public class Date030705 {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int sum =0;
		char calc = '\0';
		String str = null;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째수 :");
		num1 = Integer.parseInt(scan.nextLine());
		System.out.println("두번째수 :");
		num2 = Integer.parseInt(scan.nextLine());
		System.out.println("계산 방식(+,-,*,/,%) :");
		str = scan.nextLine();
		calc =str.charAt(0);
		
		switch (calc){
		case '+':sum = num1+num2;
			break;
		case '-':sum = num1-num2;
			break;
		case '*':sum = num1*num2;
			break;
		case '/':sum = num1/num2;
			break;
		case '%':sum = num1%num2;
			break;
		default : 
			System.out.println("계산식이 잘못되었습니다.");			
		}
		System.out.println("계산결과 ="+num1+calc+num2+"="+sum);

	}

}
