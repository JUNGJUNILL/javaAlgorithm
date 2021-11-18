package datastructure_Graph_DFS;

import java.util.Stack;

public class P003_DFS_stack {
		
	//스택을 이용한 DFS
	static int V =7; 
	static int E =8;
	static int[][] graph = new int[V][V]; 
	static boolean[] visited = new boolean[V]; 
	
	
	static void DFS(int x){
		boolean[] hello = new boolean[V]; 
		Stack<Integer> stack = new Stack<>(); 
		stack.push(x); 
		
		while(!stack.isEmpty()){
			int curr = stack.pop(); 
			if(hello[curr]) continue; 

			System.out.printf("%c ",curr+65);
			
			hello[curr]=true; 
			
			//해당 정점의 인접 정점의 방문여부와
			//인접 정점이 있나 없나 검증한다.
			for(int i=0; i<V; i++){
				if(!visited[i] && graph[curr][i]==1){
					stack.push(i); 
				}
			}
			
			
		}
		
		
	}
	/*
	DFSStack(0) 
	STACK : 0  
	curr : 0, visited[0] false , visited[0]=true, print(A) 
	for 7
	0 !visited[0]=false continue 
	1 !visited[1]=true && graph[0][1]==1 true STACK : 1
	2 !visited[2]=true && graph[0][2]==2 true STACK : 1, 2
	3
	4
	5
	6  
	
	STACK 1 
	curr : 2, visited[2]=false, visited[2]=true, print(C) 
	for 7
	0 !visited[0]=false continue 
	1 !visited[1]=true && graph[2][1]==1 false
	2 !visited[2]=false
	3 !visited[3]=true && graph[2][3]==1 false
	4 !visited[4]=true && graph[2][4]==1 true STACK 1, 4
	5 !visited[4]=true && graph[2][5]==1 false
	6 !visited[4]=true && graph[2][6]==1 false 
	
	STACK 1
	curr : 4, visited[4]=false, visited[4]=true , print(E) 
	for 7
	0 !visited[0]=false continue 
	1 !visited[1]=true && graph[4][1]==1 true STACK 1, 1
	2 !visited[2]=false
	3 !visited[3]=true && graph[4][3]==1 false
	4 !visited[4]=false
	5 !visited[5]=true && graph[4][5]==1 false
	6 !visited[6]=true && graph[4][6]==1 true STACK 1, 1, 6 
	
	STACK 1, 1 
	curr : 6 , visited[6]=false, visited[6]=true print(G) 
	for 7
	0 !visited[0]=false continue 
	1 !visited[1]=true && graph[6][1]==1 false
	2 !visited[2]=false
	3 !visited[3]=true && graph[6][3]==1 true STACK 1, 1, 3
	4 !visited[4]=false 
	5 !visited[5]=true && graph[6][5]==1 true STACK 1, 1, 3, 5 
	6 !visited[6]=false
	
	STACK 1, 1, 3 
	curr : 5, visited[5]=false, visited[5]=true print(F) 
	for 7
	0 !visited[0]=false continue 
	1 !visited[1]=true && graph[5][1]==1 false
	2 !visited[2]=false
	3 !visited[3]=true && graph[5][3]==1 false 
	4 !visited[4]=false 
	5 !visited[5]=false
	6 !visited[6]=false
	
	STACK 1, 1 
	curr : 3, visited[3]=false, visited[3]=true print(D)
	for 7
	0 !visited[0]=false continue 
	1 !visited[1]=true && graph[3][1]==1 true STACK 1, 1, 1
	2 !visited[2]=false
	3 !visited[3]=false
	4 !visited[4]=false 
	5 !visited[5]=false
	6 !visited[6]=false
	
	STACK 1, 1
	curr : 1, visited[1]=false, visited[1]=true, print(B) 
	for 7
	0 !visited[0]=false continue 
	1 !visited[1]=true && graph[1][1]==1 false
	2 !visited[2]=false
	3 !visited[3]=false
	4 !visited[4]=false 
	5 !visited[5]=false
	6 !visited[6]=false
	
	STACK 1 
	curr :1, visited[1]=true continue; 
	
	STACK 
	curr :1, visited[1]=true continue;
	
	STACK IS EMPTY BFS 종료
	
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
