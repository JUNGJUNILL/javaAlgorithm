package silverAlgorithm;

import java.util.Scanner;

public class P009_소수 {

	
	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/2581
		
		Scanner sc = new Scanner(System.in);

		int a= sc.nextInt();
		int b= sc.nextInt();
		
		int sum=0; 
		int min=0; 
		
		//소수인 숫자만 출력하도록 하자. 
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
		//0과 1은 소수가 아니다.
		if(num < 2){return 0;}
		
		//2는 소수이다. 
		if(num==2){return num;} 
		
		for(int i=2; i<num; i++){
			if(num % i == 0){return 0;}
		}
		
		return num; 
	}

}
