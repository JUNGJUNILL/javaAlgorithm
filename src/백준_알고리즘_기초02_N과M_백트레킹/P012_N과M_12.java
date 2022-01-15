package 백준_알고리즘_기초02_N과M_백트레킹;

import java.util.Arrays;
import java.util.Scanner;

public class P012_N과M_12 {
	
	static int[] arr01; 
	static int[] arr02; 
	static boolean[] check; 
	
	static void Combination(int k, int s, int n, int m){
		if(k==m){
			for(int i=0; i<m; i++){
				System.out.print(arr01[i]+ " ");
			}
			System.out.println();
			return; 
		}
		
		int prev_num=-1;
		for(int i=s; i<n; i++){
			if(prev_num!=arr02[i]){
				arr01[k]=arr02[i]; 
				prev_num=arr02[i];
				Combination(k+1, i, n, m);
			}
		}
		
	}

	//https://www.acmicpc.net/problem/15666
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in); 
		int N=sc.nextInt(); 
		int M=sc.nextInt(); 
		
		arr01=new int[N]; 
		arr02=new int[N]; 
		
		
		
		for(int i=0; i<N; i++){
			arr02[i]=sc.nextInt();
		}
		Arrays.sort(arr02);
		
		
		Combination(0, 0, N, M);

	}

}
