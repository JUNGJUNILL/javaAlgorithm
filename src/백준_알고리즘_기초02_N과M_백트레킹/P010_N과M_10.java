package 백준_알고리즘_기초02_N과M_백트레킹;

import java.util.Arrays;
import java.util.Scanner;

public class P010_N과M_10 {
	
	static int[] arr; 
	static int[] arr1; 
	static boolean[] check; 
	static void Combination(int k,int s, int n, int m){
		if(k==m){
			for(int i=0; i<m; i++){
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		
		int prev_num=-1;
		
		for(int i=s; i<n; i++){
			if(!check[i] && prev_num!=arr1[i]){
				arr[k]=arr1[i]; 
				prev_num=arr1[i]; 
				check[i]=true; 
				Combination(k+1, i+1, n, m);
				check[i]=false; 
			}
		}
	}

	//https://www.acmicpc.net/problem/15664
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in); 
		int N= sc.nextInt(); 
		int M= sc.nextInt(); 
	
		arr=new int[N]; 
		arr1=new int[N]; 
		check=new boolean[N]; 
		arr1[0]=9;
		arr1[1]=7;
		arr1[2]=9;
		arr1[3]=1;
		
		Arrays.sort(arr1);
		
		Combination(0, 0, N, M);
	
	}
}
