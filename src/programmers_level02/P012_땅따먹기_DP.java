package programmers_level02;

import java.util.ArrayList;

public class P012_땅따먹기_DP {

//   static int solution(int[][] land) {
//        int answer = 0;
//
//        System.out.println("Hello Java");
//
//        return answer;
//    }

	
	static int[][] graph={
					{1,2,3,5},
					{5,6,7,8},
					{4,3,2,1}
					};
	
	
	//피보나치 수열
	//1 1 2 3 5 8 13 21 34 55 
	static int[] newArr=new int[100]; 
	static int DP(int x){
		
		if(x <=2) return 1; 
		if(newArr[x]!=0) return newArr[x]; 
		return newArr[x]=DP(x-1)+DP(x-2); 
		
	}
	
	//내가 애초에 풀 수 없었던 문제이다.
	//너무 고집 부리지 말자.
	//https://programmers.co.kr/learn/courses/30/lessons/12913
	
	//https://fbtmdwhd33.tistory.com/241
	public static void main(String[] args) {
		
		int answer=Integer.MIN_VALUE; 
		int n = graph.length; 	//3
		int[][] dp=new int[n][graph[0].length];		
		
		for(int i=0; i<graph[0].length; i++){
			dp[0][i] = graph[0][i]; 
		}
		
	

		/*
		 
		  	static int[][] graph={
					{1,2,3,5},
					
					{5,6,7,8},
					{4,3,2,1}
					};
		  */
			for(int i=1; i<n; i++){
				
				for(int j=0; j<graph[i].length; j++){
					
					int max=Integer.MIN_VALUE; 
					
					for(int k=0; k<4; k++){
						if(j==k)continue; 
						max = Math.max(max, dp[i-1][k]); 
					}
					dp[i][j]=graph[i][j]+max; 
					
					
				}
				
			}

	        for(int i=0;i<4;i++){
	            answer = Math.max(answer,dp[n-1][i]);
	        }
	        
	        
	}
}
