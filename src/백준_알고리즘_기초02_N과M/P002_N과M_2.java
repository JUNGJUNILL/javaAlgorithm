package 백준_알고리즘_기초02_N과M;

import java.util.Scanner;

public class P002_N과M_2 {
	
	static boolean[] check;
	static 	int[] arr;

	static void Combination(int idx, int k, int kind, int MAX){
		if(k==kind){		
			for(int i=0; i<MAX; i++){
				if(check[i]){
					System.out.print(arr[i]+" ");	
				}
			}
			System.out.println();
		}
		
		for(int i=idx; i<arr.length; i++){
			if(check[i]) continue;
				arr[k]=i;
				check[i]=true; 
				Combination(i, k+1, kind, MAX);
				check[i]=false; 
			
		}
		
	}
	//조합 문제이다.
	//https://www.acmicpc.net/problem/15650
	//https://www.acmicpc.net/source/share/d104101d3d0346be813c5e763aaecbb4
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in); 
		int N=sc.nextInt(); 
		int M=sc.nextInt(); 
		arr=new int[N]; 
		check=new boolean[N]; 
		
		Combination(0,0,M,N);
	
		
		
	}
}
