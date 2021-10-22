package basicAlgorithm;

import java.util.Scanner;
//안녕sssdddd
public class P000_소수판별 {
	
			public static void main(String[] args) {
				isPrime(2); 
			      
			}
	
		//소수를 판별하는 함수 
		//0과 1은 소수가 아니다.
	
		//true  소수입니다.  
		//false 소수가 아닙니다.
		public static void isPrime(int num){
			
			//0과 1은 소수가 아니다.
			if(num < 2){
				System.out.println("0과 1은 소수가 아닙니다.");
				return; 
			}
			//i*i<=num
			//i<=Math.sqrt(num) 
			//i<=num/2 요론식으로 바꿀 수 있다.  
			//이 방법은 2는 소수임을 판별하기위한 방법이기도 하다.
			for(int i=2; i*i<=num; i++){
				//num이 4인 경우(소수아님) 
				//i=2; 4<=4; i++ => i=3;  9<=4 false return
				//4 % 2 -- 0 소수아님. 
				 
			
				//num이 7인 경우(소수임) 
				//i=2; 4<=7 i++ ==> i=3; 9<=7 false return
				//7 % 2 -- 1 소수임.
				 		
				//num이 13인 경우(소수임) 
				//i=2; 4<=13; i++  ==> i=3; 9<=13 true
				//13 % 2 -- 1 소수임 
				
				//i=3; 9<=13; i++  ==> i=4; 16<=13 false
				//13 % 9 -- 4 소수임 
				
				if(num % i ==0) {
					System.out.println("소수아님"); return; 
				}
			}
			
			
			System.out.println("소수임");
			return; 
		}
		
	
	

}
