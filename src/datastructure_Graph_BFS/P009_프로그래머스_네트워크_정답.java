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
		int[][] computers = { 
				{ 1, 1, 0 }, 
				{ 0, 0, 0 }, 
				{ 0, 1, 1 } 
			   };
		for(int i=0; i<computers.length; i++){
			for(int j=0; j<computers[i].length; j++){
				System.out.print(computers[i][j]+ " ");
			}
			System.out.println();
		}
		
		System.out.println(solution(3,computers));
	
	}
}


