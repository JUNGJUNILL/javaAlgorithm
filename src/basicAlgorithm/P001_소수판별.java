package basicAlgorithm;

public class P001_�Ҽ��Ǻ� {

	public static void main(String[] args) {

		//�Ҽ��� ����ϴ� �޼ҵ�
		int a=1; 
		int b=10; 
		for(int i=a; i<b; i++){
			isPrime(i);
		}
		
		
	}

	public static void isPrime(int num){
		//0�� 1�� �Ҽ��� �ƴϴ�.
		if(num < 2){return;}
		
		//2�� �Ҽ��̴�. 
		if(num==2){System.out.println(num);return;} 
		
		for(int i=2; i<num; i++){
			if(num % i == 0){return;}
		}
		
		System.out.println(num);
	}
	
}
