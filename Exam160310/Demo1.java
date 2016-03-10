package Exam160310;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		int seson = 0;
		int t = 0;
		String str = null;
		Scanner scan = new Scanner(System.in);

		//for문
		for (int i = 0; i < 5; i++) {
			System.out.print("당신이 원하는 계절을 입력하세요 :");
			seson = Integer.parseInt(scan.nextLine());
			switch (seson) {
			case 1: case 2: case 12:
				str = "겨울";
				break;
			case 3: case 4: case 5:
				str = "봄";
				break;
			case 6: case 7: case 8: case 9:
				str = "여름";
				break;
			case 10: case 11:
				str = "가을";
				break;
			default:
				str = "존재하지 않는 계절 ";
			}
			System.out.println(str + "입니다");
		}
		
		//while문
		while (t < 5) {
			System.out.print("당신이 원하는 계절을 입력하세요 :");
			seson = Integer.parseInt(scan.nextLine());
			switch (seson) {
			case 1: case 2: case 12:
				str = "겨울";
				break;
			case 3: case 4: case 5:
				str = "봄";
				break;
			case 6: case 7: case 8: case 9:
				str = "여름";
				break;
			case 10: case 11:
				str = "가을";
				break;
			default:
				str = "존재하지 않는 계절 ";
			}
			System.out.println(str + "입니다");
			t = ++t;

		}
		for (int i =0; i<5;i++){
			System.out.print("당신이 원하는 계절을 입력하세요 :");
			seson = Integer.parseInt(scan.nextLine());
			if (seson <3 ||seson ==12){
				str = "겨울";
			}else if (seson>2 && seson<6){
				str = "봄";
			}else if (seson>5 && seson<10){
				str = "여름";
			}else if (seson>9 && seson<12){
				str = "가을";
			}else {
				str = "존재하지 않는 계절 ";
			}System.out.println(str + "입니다");
			
		}

	}

}
