package Exam160310;

import java.util.Scanner;
//가위바위보 예문
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
			System.out.println("가위,바위,보 or 숫자 1,2,3 ");			
			usr2 = scan.nextLine();
			chek = usr2.charAt(0);
			switch (chek){
			case '가':usr =1;break;
			case '바':usr =2;break;
			case '보':usr =3;break;
			case '1':usr =1;break;
			case '2':usr =2;break;
			case '3':usr =3;break;
			default : System.out.println("제대로 입력해주세요");continue;
			}
			sum = usr-com;
			switch (sum){
			case 1: case -2:
				if (com ==1){com2 = "가위"; usr2 = "바위";}
				else if (com ==2){com2 = "바위";usr2 = "보";}
				else if (com ==3){com2 = "보";usr2 = "가위";}
				str = "유저 win!";
				break;
			case 2: case -1:
				if (com ==1){com2 = "가위";usr2 = "보";}
				else if (com ==2){com2 = "바위";usr2 = "가위";}
				else if (com ==3){com2 = "보";usr2 = "바위";}
				str = "컴퓨터 win!";
				break;
			case 0: 
				if (com ==1){com2 = "가위";usr2 = "가위";}
				else if (com ==2){com2 = "바위";usr2 = "바위";}
				else if (com ==3){com2 = "보";usr2 = "보";}
				str = "드로우!";
				break;
			}
			System.out.println("유저는 "+usr2+" 컴퓨터는 "+com2+" 결과 :"+str);
		}

	}

}
