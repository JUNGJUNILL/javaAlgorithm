package datastructure_완전탐색_백트레킹;

import java.util.Scanner;

public class P002_완전탐색 {

	//백트레킹 기본 코드 
	static int N=4; 
	static int M=2; 
	static int[] arr=new int[10]; 
	static boolean[] isUsed=new boolean[10]; 
	
	static void func(int k){
		if(k==M){
			for(int i=0; i<M; i++){
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		
		for(int i=1; i<=N; i++){
			if(!isUsed[i]){
				arr[k] = i; 
				isUsed[i]=true; 
				func(k+1); 
				isUsed[i]=false;
			}
		}
	}
	
	public static void main(String[] args) {

		func(0); 
		
	}
}
