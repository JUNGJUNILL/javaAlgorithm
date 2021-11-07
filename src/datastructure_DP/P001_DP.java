package datastructure_DP;

public class P001_DP {
	
	//Tip
	//어떻게 할지 모르겠을땐, 하나씩 그려보면서 규칙 찾기 
	//점화식을 명확하게 세우고 코드 짜기 
	//점화식 안세우고 코드부터 짜면 절대로 못푼다.
	
	//하나의 문제를 단 한번만 풀도록 하는 알고리즘
	//큰 문제를 작은 문제로 나눌 수 있다. 
	//작은 문제에서 구한 정답은 그것을 포하한 큰 문제에서도 동일하다.
	
	//메모제이션
	public static int[] arr=new int[100]; 
	public static int dp(int x){
		if(x==1)return 1;
		if(x==2)return 1; 
		if(arr[x] !=0) return arr[x]; 
		return arr[x] = dp(x-1) + dp(x-2); 
		
	}

	public static void main(String[] args) {

		System.out.println(dp(10));
		
		Fibonacci f = new Fibonacci(); 
		System.out.println(f.fibonacciBottomUp(30));

		
	}

}

//바텀업 방식
class Fibonacci{
	
	int arr[] =new int [100]; 
	public Fibonacci(){
		arr[1]=1; 
		arr[2]=1; 
	}
	
	public int fibonacciBottomUp(int x){
		
		for(int i=3; i<=x ; i++){
			arr[i] = arr[i-1] + arr[i-2]; 
		}
		return arr[x]; 
	}
	
	
}
