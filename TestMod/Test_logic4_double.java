package TestMod;

public class Test_logic4_double {

	public static void main(String[] args) {
		
		//�Ҽ��� 4�ڸ����� ǥ��
		float pi = 3.141592f;
		float shortpi = (int)(pi*1000)/1000f;
		//(������ȯ)(�Ǽ�*ǥ�����ڸ�����ŭ 0)/�Ǽ������� ǥ�����ڸ�����ŭ0;
		System.out.println(shortpi);
		
		//�Ҽ��� 4�ڸ����� �ݿø� �Ͽ� ǥ��
		float pi2 = 3.141592f;
		float shortpi2 = (int)(pi*1000+0.5)/1000f;
		//(������ȯ)(�Ǽ�*ǥ�����ڸ�����ŭ 0+0.5�ݿø�)/�Ǽ������� ǥ�����ڸ�����ŭ0;
		System.out.println(shortpi2);

	}

}
