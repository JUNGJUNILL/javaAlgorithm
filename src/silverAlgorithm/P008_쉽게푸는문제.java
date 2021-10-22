package silverAlgorithm;

import java.util.Scanner;

public class P008_쉽게푸는문제 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);

		int a=sc.nextInt();
		int b= sc.nextInt();
		//3, 5 인 경우..
		
		int[] arr = new int[1001]; 
		int i=1 ,j=1; 
		int sum = 0; 
		
		while(i < 1001){
			
			for(int q=0; q<j; q++){
				arr[i]=j;
				//i=1 , j=1 ["",1]
				
				//i=2 , j=2 ["",1,2]
				//i=3 , j=2 ["",1,2,2]
				
				//i=4 , j=3 ["",1,2,2,3]
				//i=5 , j=3 ["",1,2,2,3,3]
	
				if(i>=a && i<=b){
				//1>=3 && 1<=5 false 
				
				//2>=3 && false 
				//3>=3 && 3<=5 true 
					
				//4>=3 && 4<=5 true
				//5>=3 && 5<=5 true
					
					sum=sum+arr[i];
					//sum=2 
					//sum=5
					//sum=8
				
				}
				if(i==b){
					//5==5 true 
					
					System.out.println(sum);
					return;
				}
				i=i+1;
				
			}
			j=j+1;
			
		}
		
	}

}
