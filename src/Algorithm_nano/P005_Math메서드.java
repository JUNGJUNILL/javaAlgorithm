package Algorithm_nano;

public class P005_Math�޼��� {

	public static void main(String[] args) {
	
		
		//Math.round �Լ��� �Ǽ��� �Ҽ��� ù���� �ڸ��� 
		//�ݿø��Ͽ� ������ȯ
		float f1 = 3.4f;
		float f2 = 3.5f;
		float pie=3.141592f; 
		
		System.out.println(Math.round(f1));//�ݿø�
		System.out.println(Math.round(f2));//�ݿø�
		System.out.println(Math.ceil(f1));  //�ø�
		System.out.println(Math.floor(f1)); //����
		System.out.println("==============================");
		
		//�Ҽ��� ù°�ڸ����� �ݿø� 
		System.out.println("pie*10="+(pie*10)+"  :: "+Math.round(pie*10)/10.0);
		
		//�Ҽ��� ��°�ڸ����� �ݿø� 
		System.out.println("pie*100="+(pie*100)+"  :: "+Math.round(pie*100)/100.0);
		
		//�Ҽ��� ��°�ڸ����� �ݿø� 
		System.out.println("pie*1000="+(pie*1000)+" :: "+Math.round(pie*1000)/1000.0);
		
	}

}
