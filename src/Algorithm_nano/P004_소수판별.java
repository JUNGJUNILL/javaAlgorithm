package Algorithm_nano;

public class P004_소수판별 {
	
	public static void isPrime(int x){
		
		//0과 1은 소수가 아닙니다.
		if(x < 2)return; 
		if(x == 2){System.out.println("2는 소수입니다.");return;}
	
		for(int i=2; i<x; i++){
			if(x % i == 0){
				return; 
			}
		}
		
		System.out.println("소수 입니다.");
	}

	
	public static void main(String[] args) {

		isPrime(3);
		
	}
}
