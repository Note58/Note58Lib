package Exam160310;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		int seson = 0;
		int t = 0;
		String str = null;
		Scanner scan = new Scanner(System.in);

		//for��
		for (int i = 0; i < 5; i++) {
			System.out.print("����� ���ϴ� ������ �Է��ϼ��� :");
			seson = Integer.parseInt(scan.nextLine());
			switch (seson) {
			case 1: case 2: case 12:
				str = "�ܿ�";
				break;
			case 3: case 4: case 5:
				str = "��";
				break;
			case 6: case 7: case 8: case 9:
				str = "����";
				break;
			case 10: case 11:
				str = "����";
				break;
			default:
				str = "�������� �ʴ� ���� ";
			}
			System.out.println(str + "�Դϴ�");
		}
		
		//while��
		while (t < 5) {
			System.out.print("����� ���ϴ� ������ �Է��ϼ��� :");
			seson = Integer.parseInt(scan.nextLine());
			switch (seson) {
			case 1: case 2: case 12:
				str = "�ܿ�";
				break;
			case 3: case 4: case 5:
				str = "��";
				break;
			case 6: case 7: case 8: case 9:
				str = "����";
				break;
			case 10: case 11:
				str = "����";
				break;
			default:
				str = "�������� �ʴ� ���� ";
			}
			System.out.println(str + "�Դϴ�");
			t = ++t;

		}
		for (int i =0; i<5;i++){
			System.out.print("����� ���ϴ� ������ �Է��ϼ��� :");
			seson = Integer.parseInt(scan.nextLine());
			if (seson <3 ||seson ==12){
				str = "�ܿ�";
			}else if (seson>2 && seson<6){
				str = "��";
			}else if (seson>5 && seson<10){
				str = "����";
			}else if (seson>9 && seson<12){
				str = "����";
			}else {
				str = "�������� �ʴ� ���� ";
			}System.out.println(str + "�Դϴ�");
			
		}

	}

}
