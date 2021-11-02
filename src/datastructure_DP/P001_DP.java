package datastructure_DP;

public class P001_DP {
	
	
	//메모제이션
	public static int[] arr = new int[100]; 
	public static int dp(int x){
		if(x==1)return 1;  
		if(x==2)return 1; 
		if(arr[x]!=0)return arr[x]; 
		return arr[x] = dp(x-1)+dp(x-2); 
		
	}
	


	public static void main(String[] args) {

		System.out.println(dp(10 ));
		
	}

}
