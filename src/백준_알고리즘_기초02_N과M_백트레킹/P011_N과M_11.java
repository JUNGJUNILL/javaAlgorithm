package 백준_알고리즘_기초02_N과M_백트레킹;

import java.util.Arrays;
import java.util.Scanner;

import javax.print.DocFlavor.CHAR_ARRAY;

public class P011_N과M_11 {
	
	static int[] arr01; 
	static int[] arr02;
	static boolean[] check01; 
	static StringBuffer bf=new StringBuffer(); 
	static void Permutation(int k, int n, int m){
		if(k==m){
			for(int i=0; i<m; i++){
				bf.append(arr01[i]+" ");
			}
			bf.append("\n"); 
			return; 
		}
		
		int prev_num=-1;
		
		for(int i=0; i<n; i++){
			if(prev_num!=arr02[i]){
				arr01[k]=arr02[i];
				prev_num=arr02[i]; 
				Permutation(k+1, n, m);
			}
		}
	}

	//https://www.acmicpc.net/problem/15665
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in); 
		
		int N=sc.nextInt();  
		int M=sc.nextInt(); 
		
		arr01=new int[N]; 
		arr02=new int[N];
		check01=new boolean[N];
		
		for(int i=0; i<N; i++){
			arr02[i]=sc.nextInt();
		}
		
		Arrays.sort(arr02);
		Permutation(0, N, M);
		System.out.println(bf.toString());
	
	}
}
