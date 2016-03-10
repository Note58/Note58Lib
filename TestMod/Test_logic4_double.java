package TestMod;

public class Test_logic4_double {

	public static void main(String[] args) {
		
		//소수점 4자리까지 표시
		float pi = 3.141592f;
		float shortpi = (int)(pi*1000)/1000f;
		//(정수변환)(실수*표기할자리수만큼 0)/실수형으로 표기할자리수만큼0;
		System.out.println(shortpi);
		
		//소수점 4자리까지 반올림 하여 표시
		float pi2 = 3.141592f;
		float shortpi2 = (int)(pi*1000+0.5)/1000f;
		//(정수변환)(실수*표기할자리수만큼 0+0.5반올림)/실수형으로 표기할자리수만큼0;
		System.out.println(shortpi2);

	}

}
