package Algorithm_nano;

public class P006_피보나치수열 {
	
	// 1 1 2 3 5 8 13 21 24 55 ...
	
	//01 가장 전통적 
	static int fibonacci(int x){
		
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


	public static void main(String[] args) {
		
		System.out.println(dp(40));
		System.out.println(fibonacci(40));
		System.out.println(fibonacciBottomUp(40));
		
	}

}
