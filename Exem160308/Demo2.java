package Exem160308;

public class Demo2 {

	public static void main(String[] args) {
		char ch ='A';
		String ah = "A";
		int code =(int)ch;
		int a = ch+1;
		System.out.println(ah+a);
		System.out.printf("%c=%d(%#X)%n", ch, code,code);
		
		char hch = '°¡';
		System.out.printf("%c=%d(%#X)%n", hch, (int)hch, (int)hch );

	}

}
