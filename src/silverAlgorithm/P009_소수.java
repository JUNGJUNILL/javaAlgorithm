package silverAlgorithm;

import java.util.Scanner;

public class P009_�Ҽ� {

	
	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/2581
		
		Scanner sc = new Scanner(System.in);

		int a= sc.nextInt();
		int b= sc.nextInt();
		
		int sum=0; 
		int min=0; 
		
		//�Ҽ��� ���ڸ� ����ϵ��� ����. 
		for(int i=a; i<b; i++){
			
			if(isPrime(i)!=0 && min==0){
				min=isPrime(i);
			} 
			sum=sum+isPrime(i); 
			
		}
		
		if(sum ==0 ){
			System.out.println(-1);
			 
		}else{
			System.out.println(sum);
			System.out.println(min);
			
	
		}
		
		
		
	
	}
	
	public static int isPrime(int num){
		//0�� 1�� �Ҽ��� �ƴϴ�.
		if(num < 2){return 0;}
		
		//2�� �Ҽ��̴�. 
		if(num==2){return num;} 
		
		for(int i=2; i<num; i++){
			if(num % i == 0){return 0;}
		}
		
		return num; 
	}

}
