package Algorithm_nano;

public class P014_10_100_1000���� {

	public static void main(String[] args) {

		int length=10; 
		for(int i=1; i<=1000; i++){
			
			if(i==length){
				System.out.println(length);
				length*=10; 
			}
			//��... ��� �̷� ������ ����...

		}
		
		System.out.println("----------------------------");

		
		int length02=10;
		for(int i=1; i<=1000; i++){
			
			if(i % length02==0){
				System.out.println(length02);
				length02*=10;
			}
			
		}
		//���ƴ� ��¥ ��� �̷������� ����??
		
		
	}
}
