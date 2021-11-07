package Algorithm_basic_Top10;

import java.util.Scanner;

public class DP {

	public static int[] array = new int[1001]; 
	public static int dp(int x){
		if(x==1)return 1; 
		if(x==2)return 2;
		if(array[x]!=0)return array[x]; 
		
		return array[x] = (dp(x-1) + dp(x-2)) % 10007;  
		
	}
	//https://www.acmicpc.ne t/problem/11726
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println(dp(sc.nextInt()));

	}
}
