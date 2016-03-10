package Exam160310;

public class Demo9 {

	public static void main(String[] args) {
		float pi = 3.141592f;
		float shortpi = (int)(pi*1000)/1000f;
		System.out.println(shortpi);
		
		float pi2 = 3.141592f;
		float shortpi2 = (int)(pi*1000+0.5)/1000f;
		System.out.println(shortpi2);
		
		boolean bl1 = (10.0==10.0f);
		boolean bl2 = (0.1==0.1f);
		boolean bl3 = ('A'>'B');
		boolean bl4 = ('A'+1=='B');
		System.out.println("bl1:"+bl1 +" bl2:"+bl2+" bl3:"+bl3+" bl4:"+bl4);
		
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
