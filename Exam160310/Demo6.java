package Exam160310;

public class Demo6 {

	public static void main(String[] args) {
		int int1 = 0;
		int int2 = 0;
		long long0 = 0;
		long long1 =0;
		long long2 =0;
		
		//int�� ������ long�� ����� �����÷ο� �߻����� ����
		
		//long = int +int
		int1 = 1000000;
		int2 = 2000000;
		long0 = int1*int2;//int +int int�� ������� �����÷ο�� ���� long0�� ����
		System.out.println(long0);
		
		//long= long+long
		long1 = 10000000;
		long2 = 20000000;
		long0 = long1 *long2;
		System.out.println(long0);
		//long +long long�� ������� �����÷ο���� �ʰ�  �������� ���� long0�� ����
		
		//long = int+int(���ͳ�)
		//long = int+long(���ͳ�)
		long1 = 1000000*1000000;
		long2 = 1000000*1000000L;
		//���ͳ� +���ͳ��� JVM�� �޸𸮿� ������ �ʰ� ������ ����Ͽ� ���� �����ؼ� �����÷ο찡 �߻����� �ʴ´�.
		System.out.println(long1);//���ͳ� int + ���ͳ�int int�� ������� �����÷ο�� ���� long1�� ���� 
		System.out.println(long2);
		//int +long long�� ������� �����÷ο���� �ʰ�  �������� ���� long2�� ����

	}

}
