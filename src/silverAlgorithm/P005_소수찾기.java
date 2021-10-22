package silverAlgorithm;
import java.util.*;

public class P005_�Ҽ�ã�� {

	//�Ҽ��� �Ǻ��ϴ� �Լ� 
	//0�� 1�� �Ҽ��� �ƴϴ�.
	//true  �Ҽ��Դϴ�.  
	//false �Ҽ��� �ƴմϴ�.
	public static boolean isPrime(int num){
		
		//0�� 1�� �Ҽ��� �ƴϴ�.
		if(num < 2) return false; //num �� 1�� ���� false�� ��ȯ�ض� 
		
		//i*i<=num
		//i<=Math.sqrt(num) 
		//i<=num/2 ��н����� �ٲ� �� �ִ�.  
		for(int i=2; i*i<=num; i++){
			//num�� 4�� ���(�Ҽ��ƴ�) 
			//i=2; 4<=4; i++ => i=3; 9<=4 false return
			//4 % 2 -- 0 �Ҽ��ƴ�. 
			 
		
			//num�� 7�� ���(�Ҽ���) 
			//i=2; 4<=7 i++ ==> i=3; 9<=7 false return
			//7 % 2 -- 1 �Ҽ���.
			 		
			//num�� 13�� ���(�Ҽ���) 
			//i=2; 4<=13; i++  ==> i=3; 9<=13 true
			//13 % 2 -- 1 �Ҽ��� 
			
			//i=3; 9<=13; i++  ==> i=4; 16<=13 false
			//13 % 9 -- 4 �Ҽ��� 
			
			
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
