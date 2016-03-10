package Exam160310;

public class Demo2 {

	public static void main(String[] args) {
		double bRandom = 0.0;
		int ex1 = 0;
		int ex2 = 0;
//		for (int i =1; i<=300;i++){
//			bRandom = Math.random();
//			ex1 = (int)(bRandom*501)+500;
//			System.out.print(" " + ex1);
//			if (i%15 ==0){
//				System.out.println(" ");
//			}
//		}
		for (int i =1; i<=3000;i++){
			bRandom = Math.random();
			ex1 = (int)(bRandom*501)+500;
			if (ex1 ==1000){
				System.out.println(" " + ex1);
			}
		}
//		// Math.random() 0.0부터 1.0미만의 값을 준다 double형
//		for (int i = 0; i < 5; i++) {
//			bRandom = Math.random();
//			ex1 = (int) (bRandom * 21) + 50;
//			// (형변환)(bRandom*수의차이)+수의크기
//			ex2 = (int) (bRandom * (200 - 100 + 1)) + 100;
//			// (형변환)(bRandom*(최대값-최소값+1))+최소값
//			System.out.println("ex1 = " + ex1);// 실행할때마다 다른 결과값을 준다
//			System.out.println("ex2 = " + ex2);// 실행할때마다 다른 결과값을 준다
//			System.out.println();// 줄바꿈
//		}
	}
}
