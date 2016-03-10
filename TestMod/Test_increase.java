package TestMod;
//0309
public class Test_increase {

	public static void main(String[] args) {
		int y = 0;
		int t = 0;
		int z = 0;

		// 증감연산자 ++ 전위 후위에 따른 결과
		// ++i 일시 +1을 저장하고 결과값출력 , i++ 일시 +1을 저장하고 이전값출력
		// 1.while1문
		while (t <= 5) {
			t = ++t;// t++일시 +1을 해놓고 0값을 저장다시 들어가서 무한 루프에 빠진다.
					// ++t일시 +1을 해놓고 +1값을 저장 하기 때문에 무한 루프에 빠지지 않는다.
			y = y++;
			System.out.println("while t" + t + " y" + y);
		} // while2문
		System.out.println("\n");// 띄어쓰기
		while (z <= 5) {
			z = y++;// y++일시 y값이 +1이 되기때문에 무한루프에 빠지지 않는다.
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
