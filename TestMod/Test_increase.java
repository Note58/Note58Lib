package TestMod;

public class Test_increase {

	public static void main(String[] args) {
		int y = 0;
		int t = 0;

		// ���������� ++ ���� ������ ���� ���
		//++i �Ͻ� +1�� �����ϰ� �������� , i++ �Ͻ� +1�� �����ϰ� ���������
		// 1.while��
		while (t <= 5) {
			t = ++t;// t++�Ͻ� 0���� ���� ���� ������ ������.
			y = y++;
			System.out.println("while t" + t + " y" + y);
		}
		System.out.println("\n");//����
		// 2. for1��
		for (int i = 0; i <= 5; i++) {
			y = ++y;
			System.out.println("for1 i" + i + " y" + y);
		}
		System.out.println("\n");//����
		// for2��
		for (int i = 0; i <= 5; ++i) {
			y = y++;
			System.out.println("for2 i" + i + " y" + y);
		}
		System.out.println("\n");//����
		// 3. ������ ������
		y = y++;
		System.out.println(y);
		y = y++;
		System.out.println(y);
		System.out.println("\n");//����
		y = ++y;
		System.out.println(y);
		y = ++y;
		System.out.println(y);

	}

}