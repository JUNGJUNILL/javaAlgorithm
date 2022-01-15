package 백준_알고리즘_기초02_N과M_백트레킹;

import java.util.Arrays;
import java.util.Scanner;

public class P009_N과M_9 {

	static int[] arr; 
	static int[] arr1; 
	static boolean[] check; 
	static void Permutation(int k, int n, int m){
		
		if(k==m){
			for(int i=0; i<m; i++){
				
				System.out.print(arr[i]+" ");	
				
			}
			System.out.println();
		}
		
		int prev_num=-1;
		
		for(int i=0; i<n; i++){
			if(!check[i] && prev_num!=arr1[i]){
				arr[k]=arr1[i];
				prev_num=arr1[i];
				check[i]=true; 
				Permutation(k+1, n, m);
				check[i]=false; 
			}
		}
	}
	
	//https://seokeeee.tistory.com/151
	//https://www.acmicpc.net/problem/15663
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in); 
		int N=sc.nextInt(); 
		int M=sc.nextInt(); 
		arr=new int[N];
		arr1=new int[N];
		check=new boolean[N]; 
		
		for(int i=0; i<N; i++){
			arr1[i]=sc.nextInt(); 
		}
		Arrays.sort(arr1);
		
		Permutation(0, N, M);
		
		
	}

}
