package datastructure_Graph_BFS;

import java.util.*;
/*
 7 8
 
0 1
0 2
1 3
1 4
2 4
3 6
4 6
5 6
 
 */

public class P003_BFS_basic {
	
	static int[][] graph; 
	static int V;
	static int E; 
	
	static void BFS(int node){
		
		boolean[] visited = new boolean[10]; 
		Queue<Integer> q=new LinkedList<Integer>(); 
		visited[node] =true; 
		q.add(node); 
		
		while(!q.isEmpty()){
			
			int curr = q.poll(); 
			
			System.out.printf("%c" , curr+65);
			for(int i=0; i<V; i++){
				if(!visited[i] && graph[curr][i]==1){
					visited[i] = true; 
					q.add(i); 
				}
			}
			
		}
		
	}
	
	public static void main(String[] args) throws Exception{
	
		Scanner sc = new Scanner(System.in);
		
		V= sc.nextInt(); //노드의 갯수
		E= sc.nextInt(); //간선의 갯수
	
		graph =new int[V][V]; 
		
		for(int i=0; i<E; i++){
			int row =sc.nextInt(); 
			int col  =sc.nextInt(); 
			
			graph[row][col] = graph[col][row] = 1; 
		}
		
		System.out.println("그래프의 모양");
		for(int i=0; i<graph.length; i++){
			for(int j=0; j<graph[i].length; j++){
				System.out.print(graph[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("=========================");
		
		BFS(0); 
		
		
	}
}

