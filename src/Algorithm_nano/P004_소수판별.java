package Algorithm_nano;

public class P004_�Ҽ��Ǻ� {
	
	public static void isPrime(int x){
		
		//0�� 1�� �Ҽ��� �ƴմϴ�.
		if(x < 2)return; 
		if(x == 2){System.out.println("2�� �Ҽ��Դϴ�.");return;}
	
		for(int i=2; i<x; i++){
			if(x % i == 0){
				return; 
			}
		}
		
		System.out.println("�Ҽ� �Դϴ�.");
	}

	
	public static void main(String[] args) {

		isPrime(3);
		
	}
}
