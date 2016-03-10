package Exam160310;

public class Demo8 {

	public static void main(String[] args) {
		char AZ = 'A';
		char az = 'a';
		char num = '1';

		for (int i = 0; i < 26; i++) {
			System.out.print(AZ+" ");
			AZ= ++AZ;
		}System.out.println("");
		for (int i = 0; i < 26; i++) {
			System.out.print(az+" ");
			az= ++az;
		}System.out.println("");
		for (int i = 0; i < 9; i++) {
			System.out.print(num+ " ");
			num = ++num;
		}
	}

}
