package silverAlgorithm;
import java.util.*;

public class P005_소수찾기 {

	//소수를 판별하는 함수 
	//0과 1은 소수가 아니다.
	//true  소수입니다.  
	//false 소수가 아닙니다.
	public static boolean isPrime(int num){
		
		//0과 1은 소수가 아니다.
		if(num < 2) return false; //num 이 1인 경우는 false를 반환해라 
		
		//i*i<=num
		//i<=Math.sqrt(num) 
		//i<=num/2 요론식으로 바꿀 수 있다.  
		for(int i=2; i*i<=num; i++){
			//num이 4인 경우(소수아님) 
			//i=2; 4<=4; i++ => i=3; 9<=4 false return
			//4 % 2 -- 0 소수아님. 
			 
		
			//num이 7인 경우(소수임) 
			//i=2; 4<=7 i++ ==> i=3; 9<=7 false return
			//7 % 2 -- 1 소수임.
			 		
			//num이 13인 경우(소수임) 
			//i=2; 4<=13; i++  ==> i=3; 9<=13 true
			//13 % 2 -- 1 소수임 
			
			//i=3; 9<=13; i++  ==> i=4; 16<=13 false
			//13 % 9 -- 4 소수임 
			
			
			if(num % i ==0) return false; 
		}
		
		
		return true; 
	}
	
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	      int T = sc.nextInt();
	      int result=0; 
	      
	      for(int i=0; i<T; i++){
	    	  int num = sc.nextInt(); 
	    	  if(isPrime(num)) result++; 
	      }
	      
	      System.out.println(result);
	      
	}

}
