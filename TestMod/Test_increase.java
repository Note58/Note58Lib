package TestMod;

public class Test_increase {

	public static void main(String[] args) {
		int y = 0;
		int t = 0;
		int z = 0;

		// 증감연산자 ++ 전위 후위에 따른 결과
		// ++i 일시 +1을 저장하고 결과값출력 , i++ 일시 +1을 저장하고 이전값출력
		// 1.while1문
		while (t <= 5) {
			t = ++t;// t++일시 0값만 들어가서 무한 루프에 빠진다.
			y = y++;
			System.out.println("while t" + t + " y" + y);
		} // while2문
		System.out.println("\n");// 띄어쓰기
		while (z <= 5) {
			z = y++;
			// t++일시 0값만 들어가서 무한 루프에 빠진다.
			System.out.println("while z" + z + " y" + y);
		}
		System.out.println("\n");// 띄어쓰기
		// 2. for1문
		for (int i = 0; i <= 5; i++) {
			y = ++y;
			System.out.println("for1 i" + i + " y" + y);
		}
		System.out.println("\n");// 띄어쓰기
		// for2문
		for (int i = 0; i <= 5; ++i) {
			y = y++;
			System.out.println("for2 i" + i + " y" + y);
		}
		System.out.println("\n");// 띄어쓰기
		// 3. 문법이 없을시
		y = y++;
		System.out.println(y);
		y = y++;
		System.out.println(y);
		System.out.println("\n");// 띄어쓰기
		y = ++y;
		System.out.println(y);
		y = ++y;
		System.out.println(y);

	}

}
