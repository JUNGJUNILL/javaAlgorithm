package Algorithm_nano;

import java.util.ArrayList;

public class P006_피보나치수열 {
	
	// 1 1 2 3 5 8 13 21 24 55 ...
	
	//01 가장 전통적 
	static int fibonacci(int x){
		if(x==0) return 0; 
		if(x <=2 )return 1; 
		return fibonacci(x-1) + fibonacci(x-2); 
		
	}
	
	
	//dp 메모제이션 
	static int[] arr=new int[100]; 
	static int dp(int x){
		
		if(x<=2)return 1; 
		if(arr[x] !=0)return arr[x]; 
		return arr[x] =  dp(x-1) + dp(x-2); 
	}
	
	//dp 바텀업 방식 
	static int[] newArr =new int[100]; 
	static int fibonacciBottomUp(int x){
		newArr[1]=1; 
		newArr[2]=1;
		
		for(int i=3; i<=x; i++){
			newArr[i] = newArr[i-1] + newArr[i-2]; 
		}
		return newArr[x]; 
		
	}
	
	//프로그래머스 피보나치 수열
	static ArrayList<Integer> list =new ArrayList<>(); 
	static int programmersFibonacci(int x){
		list.add(0,0);
		list.add(1,1);
		list.add(2,1); 
		
		for(int i=3; i<=x; i++){
			int sum = (list.get(i-1) + list.get(i-2))%1234567; 
			list.add(i,sum); 
		}
		return list.get(x); 
	}


	public static void main(String[] args) {
		
		System.out.println(dp(40));
		System.out.println(fibonacci(0));
		
		System.out.println(fibonacciBottomUp(40));
		System.out.println(programmersFibonacci(40));
		//8을 구한다고 가정해보자. 
		/*
		 [1] = 1 , [2] = 2
		 
		 i
		 [3] = [2] + [1] = 2
		 [4] = [3] + [2] = 3 
		 [5] = [4] + [3] = 5 
		 [6] = [5] + [4] = 8
		 [7] = [6] + [5] = 13
		 [8] = [7] + [6] = 21
		 
		 */
		
	}

}
