package datastructure_완전탐색_백트레킹;

import java.util.Scanner;

public class P002_백준_N과M_1 {
	/*
			https://code.plus/course/42
	 */

	//백트레킹 기본 코드 
	static int N=4; //1부터 4까지의 수가 있는데 
	static int M=2; //중복 없이 2개를 고른 수열
	static int[] arr=new int[10]; 
	static boolean[] isUsed=new boolean[10]; //특정 수가 쓰였는지를 true, false로 나타내는 배열
	
	static void func(int k){

//		for(int n : arr){
//			System.out.print(n+" ");
//		}
//		System.out.println();
		
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
	
	/*
	 브루트 포스, 백트레킹, DFS
	  
	 백트레킹 말 그대로 되추적,
	 어떤 노드의 '유망성'을 판단한 뒤, 해당 노드가 유망하지 않다면
	 부모 모드로 돌아가 다른 자식 노드를 찾는 방법이다. 
	 즉, 모든 경우의 수를 찾아보지만,
	 그 중에서도 가능성만 있는 경우의 수만 찾아보는 방법이다.
	 
	 DFS는 백트레킹의 방법 중 하나이다. 
	 
	 */
	public static void main(String[] args) {

		
		func(0); 
		
	}
}
