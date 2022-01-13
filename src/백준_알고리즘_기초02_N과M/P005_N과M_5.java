package 백준_알고리즘_기초02_N과M;

import java.util.Arrays;
import java.util.Scanner;

public class P005_N과M_5 {
	
	static int[] arr; 
	static int[] arr2;
	static boolean[] check; 
	static void Permutation(int k, int n, int m){
		
		if(k==m){
			for(int i=0; i<m; i++){
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		
		for(int i=0; i<n; i++){
			if(!check[i]){
				arr[k]=arr2[i]; 
				check[i]=true; 
				Permutation(k+1, n, m);
				check[i]=false; 
			}
		}
		
	}

	//N과 M(1) 응용문제임 
	//https://www.acmicpc.net/problem/15654
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in); 
		int N=sc.nextInt(); 
		int M=sc.nextInt(); 
		arr=new int[N]; 
		arr2=new int[N]; 
		check=new boolean[N]; 
		
		for(int i=0; i<N; i++){
			arr2[i]=sc.nextInt(); 
		}
		
		Arrays.sort(arr2);
		
		Permutation(0, N, M);

		
		
	}
}
