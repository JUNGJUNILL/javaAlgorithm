package basicAlgorithm;

public class P001_소수판별 {

	public static void main(String[] args) {

		//소수만 출력하는 메소드
		int a=1; 
		int b=10; 
		for(int i=a; i<b; i++){
			isPrime(i);
		}
		
		
	}

	public static void isPrime(int num){
		//0과 1은 소수가 아니다.
		if(num < 2){return;}
		
		//2는 소수이다. 
		if(num==2){System.out.println(num);return;} 
		
		for(int i=2; i<num; i++){
			if(num % i == 0){return;}
		}
		
		System.out.println(num);
	}
	
}
