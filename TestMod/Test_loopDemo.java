package TestMod;
//0309
import java.util.Scanner;

public class Test_loopDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = null;
		char calc = '\0';
 

		int i = 0;// ���� ���� �ʱ�ȭ
		while (i < 3) {
			// (��������)
			System.out.println(i + "��°  i");
			System.out.print("while ��Ƽ��\'q\'");
			str = scan.nextLine();
			calc = str.charAt(0);
			System.out.println(calc + "�Է�");
			if (calc == 'q' || calc == 'Q') {
				continue;
			}
			i = ++i;// �����ʱ�ȭ
		}
		for (int y = 0; y < 5; ++y) {
			// (���ʺ����ʱ�ȭ; ��������; �����ʱ�ȭ)
			System.out.println(y + "��°    y");
			System.out.print("for ��Ƽ��\'q\'");
			str = scan.nextLine();
			calc = str.charAt(0);
			System.out.println(calc + "�Է�");
			if (calc == 'q' || calc == 'Q') {
				continue;
			}
		}

	}

}
