package TestMod;

public class Test_overFlow {

	public static void main(String[] args) {
		int t = 0;
		int y = 0;
		long l = 0;
		long l1 =0;
		long l2 =0;
		//int형 연산후 long형 저장시 오버플로우 발생현상
		y = 1000000;
		t = 2000000;
		l = t*y;
		System.out.println(l);
		l1 = 10000000;
		l2 = 20000000;
		l = l1 *l2;
		System.out.println(l);
		l1 = 1000000*1000000;
		l2 = 1000000*1000000L;
		System.out.println(l1);
		System.out.println(l2);

	}

}
