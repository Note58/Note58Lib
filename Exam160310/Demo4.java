package Exam160310;

import java.util.Scanner;
//���������� ����
public class Demo4 {

	public static void main(String[] args) {
		double rand = 0.0;
		int com = 0;
		int usr = 0;
		int sum = 0;
		String usr1 = null;
		String usr2 = null;
 		String com2 = null;
		String str = null;
		char chek = '\0';
		Scanner scan = new Scanner(System.in);
		
		for(int i =0;i<5;i++){
			rand = Math.random();
			com = (int)(rand *3)+1;
			System.out.println("����,����,�� or ���� 1,2,3 ");			
			usr2 = scan.nextLine();
			chek = usr2.charAt(0);
			switch (chek){
			case '��':usr =1;break;
			case '��':usr =2;break;
			case '��':usr =3;break;
			case '1':usr =1;break;
			case '2':usr =2;break;
			case '3':usr =3;break;
			default : System.out.println("����� �Է����ּ���");continue;
			}
			sum = usr-com;
			switch (sum){
			case 1: case -2:
				if (com ==1){com2 = "����"; usr2 = "����";}
				else if (com ==2){com2 = "����";usr2 = "��";}
				else if (com ==3){com2 = "��";usr2 = "����";}
				str = "���� win!";
				break;
			case 2: case -1:
				if (com ==1){com2 = "����";usr2 = "��";}
				else if (com ==2){com2 = "����";usr2 = "����";}
				else if (com ==3){com2 = "��";usr2 = "����";}
				str = "��ǻ�� win!";
				break;
			case 0: 
				if (com ==1){com2 = "����";usr2 = "����";}
				else if (com ==2){com2 = "����";usr2 = "����";}
				else if (com ==3){com2 = "��";usr2 = "��";}
				str = "��ο�!";
				break;
			}
			System.out.println("������ "+usr2+" ��ǻ�ʹ� "+com2+" ��� :"+str);
		}

	}

}
