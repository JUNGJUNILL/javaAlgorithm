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
		System.out.println(Math.ceil(f1));  //������ �ø�
		System.out.println(Math.floor(f1)); //������ ����
		System.out.println("==============================");
		
		//https://coding-factory.tistory.com/250
		//�Ҽ��� n°�ڸ� ���� ǥ���ϱ�
		//n=10    ù°
		//n=100   ��°
		//n=1000  ��°
		System.out.println("pie*10="+(pie*10)+"  :: "+Math.round(pie*10)/10.0);
		
	
		System.out.println("pie*100="+(pie*100)+"  :: "+Math.round(pie*100)/100.0);
		
		
		System.out.println("pie*1000="+(pie*1000)+" :: "+Math.round(pie*1000)/1000.0);
		
		
		//Math.abs ���밪�� ��ȯ�ϴ� �Լ� 
		int initValue=-1004; 
		double doubleValue=-3.14; 
		float floatValue=-15; 
		
		System.out.println("initValue="+Math.abs(initValue));
		System.out.println("doubleValue="+Math.abs(doubleValue));
		System.out.println("floatValue="+Math.abs(floatValue));
	
	
		 
		
		//100�� ������
		int number01=(int)Math.sqrt(100); 
		
		//10�� ���� 
		int number02=(int)Math.pow(10,2); 
		System.out.println("������="+number01);
		System.out.println("����="+number02);
		
	}

}
