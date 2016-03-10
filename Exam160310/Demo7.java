package Exam160310;

public class Demo7 {
	public static void main(String[] args){
		char c1 = 'a';
		char c2= c1;
		char c3 = ' ';
		
		int i = c1 +1;
		
		c3 = (char)(c1 +1);
		c2++;
		c2++;
		
		System.out.println(i);
		System.out.println(c2);
		System.out.println(c3);
	}

}
