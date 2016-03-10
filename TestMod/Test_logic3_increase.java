package TestMod;

public class Test_logic3_increase {

	public static void main(String[] args) {
		int i = 0;
		int y = 0;
		//++i +1하고 현재값 출력 
		//i++ +1하고 이전값 출력
		i = 10;
		i=i+++i;
		//10+11  i++부터 연산 i는 저장후 11이되어 10+11로 출력 
		System.out.println(i);
		
		i = 10;
		y=i;
		i=i++ +y;
		//10+10 i++부터 연산 i는 저장후 11이되고 이전값을 반환해 10, y는 10이여서 10+10으로 출력
		System.out.println(i);
		
		i = 10;
		y=i;
		i=y+++i;
		//10+10 y++부터 연산 y는 저장후 11이되고 이전값을 반환해 10, i는 10이여서 10+10으로 출력
		System.out.println(i);
		
		i = 10;
		i=i+(++i);
		//10+11 (++i) 부터 연산이되지만 앞에 i에 영향을 주지 않음 10+11을 출력
		System.out.println(i);
		
		i = 10;
		y=i;
		i=i+(++y);
		//10+11 (++y) 부터 연산되어 10+11을 출력
		System.out.println(i);
		

	}

}
