package TestMod;
//0309
import java.util.Scanner;

public class Test_loopDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = null;
		char calc = '\0';
 

		int i = 0;// 최초 변수 초기화
		while (i < 3) {
			// (종료조건)
			System.out.println(i + "번째  i");
			System.out.print("while 컨티뉴\'q\'");
			str = scan.nextLine();
			calc = str.charAt(0);
			System.out.println(calc + "입력");
			if (calc == 'q' || calc == 'Q') {
				continue;
			}
			i = ++i;// 변수초기화
		}
		for (int y = 0; y < 5; ++y) {
			// (최초변수초기화; 종료조건; 변수초기화)
			System.out.println(y + "번째    y");
			System.out.print("for 컨티뉴\'q\'");
			str = scan.nextLine();
			calc = str.charAt(0);
			System.out.println(calc + "입력");
			if (calc == 'q' || calc == 'Q') {
				continue;
			}
		}

	}

}
