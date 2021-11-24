package datastructure_완전탐색_백트레킹;

import java.util.Scanner;

public class P002_백준_N과M_1 {

	//백트레킹 기본 코드 
	static int N=4; //1부터 4까지의 수가 있는데 
	static int M=2; //중복 없이 2개를 고른 수열
	static int[] arr=new int[10]; 
	static boolean[] isUsed=new boolean[10]; //특정 수가 쓰였는지를 true, false로 나타내는 배열
	
	static void func(int k){

		for(int n : arr){
			System.out.print(n+" ");
		}
		System.out.println();
		
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
