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
//		// Math.random() 0.0���� 1.0�̸��� ���� �ش� double��
//		for (int i = 0; i < 5; i++) {
//			bRandom = Math.random();
//			ex1 = (int) (bRandom * 21) + 50;
//			// (����ȯ)(bRandom*��������)+����ũ��
//			ex2 = (int) (bRandom * (200 - 100 + 1)) + 100;
//			// (����ȯ)(bRandom*(�ִ밪-�ּҰ�+1))+�ּҰ�
//			System.out.println("ex1 = " + ex1);// �����Ҷ����� �ٸ� ������� �ش�
//			System.out.println("ex2 = " + ex2);// �����Ҷ����� �ٸ� ������� �ش�
//			System.out.println();// �ٹٲ�
//		}
	}
}
