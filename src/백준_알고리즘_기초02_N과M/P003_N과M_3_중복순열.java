package 백준_알고리즘_기초02_N과M;

import java.util.Scanner;

public class P003_N과M_3_중복순열 {
	
	static int[] arr; 
	static boolean[] check; 
	static void MutiplePermutation(int k, int n, int m){
		if(k==m){

			for(int i=0; i<m; i++){
				System.out.print(arr[i]+1+" ");
			}
			System.out.println();
			return;
		}
		
		for(int i=0; i<n; i++){
			//중복을 체크하는 부분을 없애면 된다.
			arr[k]=i; 		
			MutiplePermutation(k+1, n, m);
			
		}
	}

	
	//중복순열
	//https://www.acmicpc.net/problem/15651
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in); 
		int N=sc.nextInt(); 
		int M=sc.nextInt();
	
		arr=new int[N]; 
		MutiplePermutation(0, N, M);
	

	}

}
