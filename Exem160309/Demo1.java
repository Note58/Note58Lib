package Exem160309;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		int num1 = 0, num2 = 0, sum = 0;
		char calc = '\0';
		String str = null;
		Scanner scan = new Scanner(System.in);
		
		
		for(int i =0;i<=5;i++){
			System.out.print("ù��°���� �Է��ϼ��� :");
			str = scan.nextLine();
			calc = str.charAt(0);
			if(calc == 'q'||calc == 'Q'){
				break;
			}
			num1 = Integer.parseInt(str);
			System.out.print("�ι�°���� �Է��ϼ��� :");
			str = scan.nextLine();
			calc = str.charAt(0);
			if(calc == 'q'||calc == 'Q'){
				break;
			}
			num2 = Integer.parseInt(str);
			System.out.print("������ �Է��ϼ���(+-*/% ���� q) :");
			str = scan.nextLine();
			calc = str.charAt(0);
			
			if(calc == 'q'||calc == 'Q'){
				break;
			}
			switch (calc){
			case '+':sum = num1+ num2;
			break;
			case '-':sum = num1- num2;
			break;
			case '*':sum = num1* num2;
			break;
			case '%':sum = num1% num2;
			break;
			case '/':sum = num1/ num2;
			break;
			default :System.out.println("���Ŀ� �������ֽ��ϴ�.");
			}
		
			
			System.out.println(i+"��° ����� :"+sum);
		}
	}

}
