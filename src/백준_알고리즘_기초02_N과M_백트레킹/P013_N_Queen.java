package 백준_알고리즘_기초02_N과M_백트레킹;

import java.util.Scanner;

public class P013_N_Queen {
	
	static int N; 
	static int[] cols;
	static int count=0;
			
	static void nQueens(int level){
		
		if(N==level){
			count++; 
			return; 
		}		
		
		for(int i=0; i<N; i++){
			cols[level]=i; 
			
			if(isPromising(level)){
				nQueens(level+1);
			}
			
			
		}
	}
	
	static boolean isPromising(int level){
		
		for(int i=0; i<level; i++){
			if(cols[level]==cols[i]){
				return false; 
			}else if(level-i==Math.abs(cols[level]-cols[i])){
				return false; 
			}
		}
		
		return true;
	}

	//https://www.acmicpc.net/problem/9663
	public static void main(String[] args) {

		N=4; 
		cols=new int[N]; 
		nQueens(0);
		System.out.println(count);
	
	}

}
