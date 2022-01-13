package 백준_알고리즘_기초02_N과M;

import java.util.Scanner;

public class P002_N과M_2_조합 {
	
	//Combination(0,0,2,arr01); 
	static int[] arr; 
	static boolean[] hello; 
	static int temp01=0; 

	static void Combination(int k, int s, int n, int m){
		if(k==m){
			for(int i=0; i<m; i++){
				System.out.print(arr[i]+1+" ");
			}
			System.out.println();
		}
		
		
		for(int i=s; i<n; i++){
			if(!hello[i]){
				arr[k]=i; 
				hello[i]=true;
				Combination(k+1,i+1,n,m); 
				hello[i]=false; 
			}
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
		hello=new boolean[N]; 
		Combination(0,0,N,M); 
	}
}
