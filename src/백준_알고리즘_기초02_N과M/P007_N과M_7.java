package 백준_알고리즘_기초02_N과M;

import java.util.Arrays;
import java.util.Scanner;

public class P007_N과M_7 {

	static int[] arr;
	static int[] arr1; 
	static StringBuffer bf=new StringBuffer(); 
	static void MultiplePermutation(int k, int n, int m){
		if(k==m){
			for(int i=0; i<m; i++){
				bf.append(arr[i]+" "); 
			}
			bf.append("\n"); 
			return; 
		}
		
		for(int i=0; i<n; i++){
			arr[k]=arr1[i];
			MultiplePermutation(k+1, n, m);
		}
		
		
	}
	
	//중복순열 응용문제임
	//그냥 System.out.println() 쓰면 시간초과 뜨는 듯
	//https://www.acmicpc.net/source/share/a0690ff2285046ff9c3ef0b0c8f38f3d
	//https://www.acmicpc.net/problem/15656
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in); 
		int N =sc.nextInt(); 
		int M=sc.nextInt(); 
		arr=new int[N]; 
		arr1=new int[N]; 
		
		for(int i=0; i<arr1.length; i++){
			arr1[i]=sc.nextInt(); 
		}
		
		Arrays.sort(arr1);
		
		
		MultiplePermutation(0, N, M);
		System.out.println(bf.toString());
		
	}
}
