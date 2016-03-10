package Exam160310;

public class Demo6 {

	public static void main(String[] args) {
		int int1 = 0;
		int int2 = 0;
		long long0 = 0;
		long long1 =0;
		long long2 =0;
		
		//int형 연산후 long형 저장시 오버플로우 발생현상 예문
		
		//long = int +int
		int1 = 1000000;
		int2 = 2000000;
		long0 = int1*int2;//int +int int형 계산으로 오버플로우되 값이 long0에 저장
		System.out.println(long0);
		
		//long= long+long
		long1 = 10000000;
		long2 = 20000000;
		long0 = long1 *long2;
		System.out.println(long0);
		//long +long long형 계산으로 오버플로우되지 않고  정상적인 값이 long0에 저장
		
		//long = int+int(리터널)
		//long = int+long(리터널)
		long1 = 1000000*1000000;
		long2 = 1000000*1000000L;
		//리터널 +리터널은 JVM이 메모리에 보내지 않고 스스로 계산하여 값을 저장해서 오버플로우가 발생하지 않는다.
		System.out.println(long1);//리터널 int + 리터널int int형 계산으로 오버플로우되 값이 long1에 저장 
		System.out.println(long2);
		//int +long long형 계산으로 오버플로우되지 않고  정상적인 값이 long2에 저장

	}

}
