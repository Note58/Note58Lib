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
		
		System.out.println("ù��°�� :");
		num1 = Integer.parseInt(scan.nextLine());
		System.out.println("�ι�°�� :");
		num2 = Integer.parseInt(scan.nextLine());
		System.out.println("��� ���(+,-,*,/,%) :");
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
			System.out.println("������ �߸��Ǿ����ϴ�.");			
		}
		System.out.println("����� ="+num1+calc+num2+"="+sum);

	}

}
