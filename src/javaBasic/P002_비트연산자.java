package javaBasic;

public class P002_��Ʈ������ {

	public static void main(String[] args) {
		
		//9�� i��° ��Ʈ���� 0���� 1���� ���ض�
		//1 << 3 ���Ŀ� �������� and ������ �ϸ�ȴ�. 
		int num=9; // 1001
		int i  =3; 
		// 1 << 3 1000

		if((num & (1<<i)) == 1){
			System.out.println(num+"�� "+i+" ��° �ε����� "+ 1+" �̴�");
		}else{
			System.out.println(num+"�� "+i+" ��° �ε����� "+ 0+" �̴�");
		}
		
		System.out.println("===============================");
		
		//num�� i��° ��Ʈ���� 1�� �����ϴ� ��� 
		System.out.println(num | (1<<i));
		
		
		//num�� i��° ��Ʈ���� ������ 0���� �ϴ� ��� 
		System.out.println(num & ~(1<<i));
		
		System.out.println();
		
		
	}

}
