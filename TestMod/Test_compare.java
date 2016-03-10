package TestMod;

public class Test_compare {

	public static void main(String[] args) {
		//리터널값 비교연산 하여 true와 false 결과값 출력
		boolean bl1 = (10.0==10.0f);
		boolean bl2 = (0.1==0.1f);
		boolean bl3 = ('A'>'B');
		boolean bl4 = ('A'+1=='B');
		System.out.println("bl1:"+bl1 +" bl2:"+bl2+" bl3:"+bl3+" bl4:"+bl4);
		
		//문자열 비교연산 하여 true와 false 결과값 출력
		String str1 ="abc";
		String str2 = new String ("abc");
		System.out.printf("\"abc\"==\"abc\"? %b%n", "abc"=="abc");
		System.out.printf(" str1 ==\"abc\"? %b%n", str1=="abc");
		System.out.printf(" str2 ==\"abc\"? %b%n", str2=="abc");
		System.out.printf(" str1 .equals(\"abc\")? %b%n", str1.equals("abc"));
		System.out.printf(" str2 .equals(\"abc\")? %b%n", str1.equals("abc"));
		System.out.printf(" str2 .equals(\"ABC\")? %b%n", str1.equals("ABC"));
		System.out.printf(" str2 .equalsIgnoreCase(\"ABC\")? %b%n", str1.equalsIgnoreCase("ABC"));

		
	}

}
