package datastructure_Graph_DFS;

import java.util.Stack;

public class P003_DFS_stack {
		
	//스택을 이용한 DFS
	static int V =7; 
	static int E =8;
	static int[][] graph = new int[V][V]; 
	static boolean[] visited = new boolean[V]; 
	
	static void DFS(int x){
		
		boolean[] visited=new boolean[V]; 
		Stack<Integer> stack=new Stack<>(); 
		stack.push(x); 
		
		while(!stack.isEmpty()){
			
			int curr = stack.pop(); 
			if(visited[curr]) continue; 
			
			visited[curr]=true; 
			System.out.printf("%c ",curr+65);
			
			for(int i=0; i<V; i++){
				if(!visited[i] && graph[curr][i]==1){
					stack.push(i); 
				}
			}
		}	
	}
	
	/*
	 DFS(0) visited[0]=true, print(A) 
	 
	 for 7
	 0 !visited[0]=false 
	 1 !visited[1]=true && graph[0][1]==1 true STACK : 1
	 2 !visited[1]=true && graph[0][2]==1 true STACK : 2
	 3
	 4
	 5
	 6
	 
	 
	 
	 
	 
	 */
		
		
		
	public static void main(String[] args) {
		
		graph[0][1] = graph[1][0] =1;
		graph[0][2] = graph[2][0] =1;
		graph[1][3] = graph[3][1] =1;
		graph[1][4] = graph[4][1] =1;
		graph[2][4] = graph[4][2] =1;
		graph[3][6] = graph[6][3] =1;
		graph[4][6] = graph[6][4] =1;
		graph[5][6] = graph[6][5] =1;
		
		for(int i=0; i<graph.length; i++){
			for(int j=0; j<graph[i].length; j++){
				System.out.print(graph[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		DFS(0); 

		
	}
}
