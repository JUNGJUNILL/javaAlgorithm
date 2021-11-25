package datastructure_Graph_BFS;

import java.util.*;


public class P009_프로그래머스_네트워크_정답 {
	
	static class Solution{
		
		
		public static void dfs(int node, boolean[] visited, int[][] computers){
			visited[node]=true; 
			
			for(int i=0; i<computers.length; i++){
				if(!visited[i] && computers[node][i]==1){
					dfs(i,visited,computers); 
				}
			}
		}
	
		public int solution(int n, int[][] computers){
			
			int answer=0; 
			boolean[] visited=new boolean[n]; 
			for(int i=0; i<n; i++){
				if(!visited[i]){
					dfs(i,visited,computers); 
				}
			}
			
			
			
			
			return answer; 
				
		}	
	}
	


	//https://programmers.co.kr/learn/courses/30/lessons/43162
	public static void main(String[] args) throws Exception{
		int[][] computers = { 
				{ 1, 1, 0 }, 
				{ 1, 1, 0 }, 
				{ 0, 0, 1 } 
			   };
	}
}


