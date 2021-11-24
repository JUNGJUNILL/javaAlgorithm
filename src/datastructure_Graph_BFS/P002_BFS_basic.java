package datastructure_Graph_BFS;

import java.util.LinkedList;
import java.util.Queue;

public class P002_BFS_basic {
	
	
	public static int N=5 , //노드의 갯수 
						 E=6;  //간선의 갯수 
	public static int MAX_N = 5; 
	public static int[][] graph =new int[MAX_N][MAX_N];
	
	public static void BFS(int node){
		
		boolean[] visited = new boolean[N];
		Queue<Integer> q =new LinkedList<Integer>(); 
		visited[node] = true; 
		q.add(node); 
		
		while(!q.isEmpty()){
			
			int curr = q.poll(); 
			
			System.out.printf("%c",curr+65);
			
									//노드의 갯수만큼 반복한다.
			for(int next=0; next <N; next++){
				if(!visited[next] && graph[curr][next]!=0){
					visited[next]=true; 
					q.add(next); 
				}
			}
		}
		 
		
		
	}
	
	//https://www.youtube.com/watch?v=yQ7o1Y7X_Rg&list=PL6YHvWRMtz7CbOmh5Id4DERE5gyQC50XS&index=6
	public static void main(String[] args) {
			
		graph[0][1] = graph[1][0] =1; 
		graph[0][2] = graph[2][0] =1; 
		graph[1][3] = graph[3][1] =1; 
		graph[1][4] = graph[4][1] =1; 
		graph[2][4] = graph[4][2] =1; 
		graph[3][4] = graph[4][3] =1; 
		
	
		System.out.println("그래프의 모양");
		for(int i=0; i<graph.length; i++){
			for(int j=0; j<graph[i].length; j++){
				System.out.print(graph[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("====================");
		
		BFS(0); 
		
		
		
		
	}

}
