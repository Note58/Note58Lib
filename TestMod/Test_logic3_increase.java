package TestMod;

public class Test_logic3_increase {

	public static void main(String[] args) {
		int i = 0;
		int y = 0;
		//++i +1�ϰ� ���簪 ��� 
		//i++ +1�ϰ� ������ ���
		i = 10;
		i=i+++i;
		//10+11  i++���� ���� i�� ������ 11�̵Ǿ� 10+11�� ��� 
		System.out.println(i);
		
		i = 10;
		y=i;
		i=i++ +y;
		//10+10 i++���� ���� i�� ������ 11�̵ǰ� �������� ��ȯ�� 10, y�� 10�̿��� 10+10���� ���
		System.out.println(i);
		
		i = 10;
		y=i;
		i=y+++i;
		//10+10 y++���� ���� y�� ������ 11�̵ǰ� �������� ��ȯ�� 10, i�� 10�̿��� 10+10���� ���
		System.out.println(i);
		
		i = 10;
		i=i+(++i);
		//10+11 (++i) ���� �����̵����� �տ� i�� ������ ���� ���� 10+11�� ���
		System.out.println(i);
		
		i = 10;
		y=i;
		i=i+(++y);
		//10+11 (++y) ���� ����Ǿ� 10+11�� ���
		System.out.println(i);
		

	}

}
