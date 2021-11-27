package datastructure_Graph_BFS;

import java.util.*;


public class P009_프로그래머스_네트워크_정답 {
	
	static int solution(int n, int[][] computers){
		int answer=0; 
		boolean[] visited=new boolean[computers.length];
		

		for(int i=0; i<computers.length; i++){
			if(!visited[i]){
				answer++;
				DFS(i,visited,computers); 
			}
		}
		
		return answer; 
		
	}
	
	static int solution02(int n, int[][] computers){
		int answer=0; 
		
		
		
		
		return answer; 
	}

	
	static void DFS(int node, boolean[] visited , int[][] computers){
		visited[node]=true; 
		
		for(int i=0; i<computers.length; i++){
			if(!visited[i] && computers[node][i]==1){
				DFS(i,visited,computers); 
			}
		}
	}


	//https://programmers.co.kr/learn/courses/30/lessons/43162
	public static void main(String[] args) throws Exception{
		
		int[][] computers01={
				{1,1,0},
				{1,1,0},
				{0,0,1},
		};
		//return 2; 
		/*
		 
		 n=3; 
		 visited=[F,F,F]
		 for 3
		 0 !visited[0] true ,answer++
		 	dfs(0, visited, com) 
		 		[T,F,F]
		 		for 3
		 		0 continue
		 		1 !visited[1]==true and com[0][1]==1 true 
		 			dfs(1,visited,com)
		 				[T,T,F]
		 				dfs(1, visited, com)
		 				for 3 
		 				0 continue
		 				1 continue;
		 				2 !visited[2]==true and com[1][2]==1 false  
		 		2 !visited[2]==true and com[0][2]==1 false 
		 1 continue
		 2 dfs(2,visited,com) ,answer++
		 		[T,T,T]
		 		for 3 
		 		0 continue
		 		1 continue
		 		2 continue
		 
		 answer==2; 
		 
		  
		*/
		
		int[][] computers02={
				{1,1,0},
				{1,1,1},
				{0,1,1},
		};
		//return 1; 
		/*
		 n=3 
		 visited=[F,F,F]
		 for 3 
		 0 !visited[0] true ,answer++; 
		 	dfs(0,visited,com)
		 	[T,F,F]
			for 3
			0 continue
			1 !visited[1]==true and com[0][1]==1 true 
			   [T,T,F]
			   dfs(1,visited,com)
			   for 3
			   0 continue
			   1 continue
			   2 !visited[2]==true and com[1][2]==1 true
			   	  [T,T,T]
			      dfs(2,visited,com)
			      for 3 
			      0 continue
			      1 continue
			      2 continue
			2 continue
		
		 1 continue
		 2 continue
		 
		 answer==1 
		 
		 */
	
		System.out.println(solution(computers01.length, computers01));
		System.out.println(solution(computers02.length, computers02));
	
	}
}


