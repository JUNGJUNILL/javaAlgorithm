package 백준_알고리즘_기초02_N과M_백트레킹;

import java.util.Arrays;
import java.util.Scanner;

public class P008_N과M_8_중복조합응용 {
	
	static int[] arr; 
	static int[] arr1; 
	static StringBuffer bf=new StringBuffer(); 
	static void MultipleCombination(int k, int s, int n, int m){
		if(k==m){
			for(int i=0; i<m; i++){
				bf.append(arr[i]+" ");
			}
			bf.append("\n"); 
			return ; 
		}
		
		for(int i=s; i<n; i++){
			arr[k]=arr1[i]; 
			MultipleCombination(k+1, i, n, m);
		}
		
		
	}
	

	//중복조합 응용문제임
	//https://www.acmicpc.net/problem/15657
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in); 
		int N=sc.nextInt(); 
		int M=sc.nextInt(); 
		
		arr=new int[N]; 
		arr1=new int[N]; 
		
		for(int i=0; i<N; i++){
			arr1[i]=sc.nextInt(); 
		}
		
		Arrays.sort(arr1);
		
		MultipleCombination(0, 0, N, M);
		System.out.println(bf.toString());
		
		
	}
}
