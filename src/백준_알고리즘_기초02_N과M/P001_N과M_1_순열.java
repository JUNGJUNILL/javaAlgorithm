package 백준_알고리즘_기초02_N과M;

import java.util.Scanner;

public class P001_N과M_1_순열 {

	
	static int[] arr; 
	static boolean[] check; 
	static void Permutation(int k, int n, int m){
		if(k==m){
			for(int i=0; i<m; i++){
				System.out.print(arr[i]+1+" ");
			}
			System.out.println();
		}
		
		for(int i=0; i<n; i++){
			if(!check[i]){
				arr[k]=i; 
				check[i]=true;
				Permutation(k+1, n, m);
				check[i]=false; 
			}
		}
		
	}
	
	//순열 문제이다.
	//https://www.acmicpc.net/problem/15649
	//http://codeplus.codes/ca1af2d3cdd04f3b9fc5ad9810d9770c
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in); 
		int N=sc.nextInt(); 
		int M=sc.nextInt();
		
		arr=new int[N]; 
		check=new boolean[N]; 
		
		
		Permutation(0,N,M); 
		
		
		
		
		
		
	}
}
