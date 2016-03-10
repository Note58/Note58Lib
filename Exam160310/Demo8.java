package Exam160310;

public class Demo8 {

	public static void main(String[] args) {
		char AZ = 'A';
		char az = 'a';
		char han = '¤¡';
		char num = '1';
		int uc = 0;

		for (int i = 0; i < 26; i++) {
			System.out.print(AZ + " ");
			AZ = ++AZ;
		}
		System.out.println("");
		for (int i = 0; i < 26; i++) {
			System.out.print(az + " ");
			az = ++az;

		}
		System.out.println("");
		for (int i = 0; i < 9; i++) {
			System.out.print(num + " ");
			num = ++num;

		}
		System.out.println("");
		for (int i = 1; i < 95; i++) {
			System.out.print(han + " :");
			uc = han;
			System.out.print(uc + " |");
			han = ++han;
			if (i % 10 == 0) {
				System.out.println("");
			}
		}

	}

}
