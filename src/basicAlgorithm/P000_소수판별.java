package basicAlgorithm;

import java.util.Scanner;
//�ȳ�sssdddd
public class P000_�Ҽ��Ǻ� {
	
			public static void main(String[] args) {
				isPrime(2); 
			      
			}
	
		//�Ҽ��� �Ǻ��ϴ� �Լ� 
		//0�� 1�� �Ҽ��� �ƴϴ�.
	
		//true  �Ҽ��Դϴ�.  
		//false �Ҽ��� �ƴմϴ�.
		public static void isPrime(int num){
			
			//0�� 1�� �Ҽ��� �ƴϴ�.
			if(num < 2){
				System.out.println("0�� 1�� �Ҽ��� �ƴմϴ�.");
				return; 
			}
			//i*i<=num
			//i<=Math.sqrt(num) 
			//i<=num/2 ��н����� �ٲ� �� �ִ�.  
			//�� ����� 2�� �Ҽ����� �Ǻ��ϱ����� ����̱⵵ �ϴ�.
			for(int i=2; i*i<=num; i++){
				//num�� 4�� ���(�Ҽ��ƴ�) 
				//i=2; 4<=4; i++ => i=3;  9<=4 false return
				//4 % 2 -- 0 �Ҽ��ƴ�. 
				 
			
				//num�� 7�� ���(�Ҽ���) 
				//i=2; 4<=7 i++ ==> i=3; 9<=7 false return
				//7 % 2 -- 1 �Ҽ���.
				 		
				//num�� 13�� ���(�Ҽ���) 
				//i=2; 4<=13; i++  ==> i=3; 9<=13 true
				//13 % 2 -- 1 �Ҽ��� 
				
				//i=3; 9<=13; i++  ==> i=4; 16<=13 false
				//13 % 9 -- 4 �Ҽ��� 
				
				if(num % i ==0) {
					System.out.println("�Ҽ��ƴ�"); return; 
				}
			}
			
			
			System.out.println("�Ҽ���");
			return; 
		}
		
	
	

}
