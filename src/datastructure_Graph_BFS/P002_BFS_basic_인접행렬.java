package datastructure_Graph_BFS;

import java.util.LinkedList;
import java.util.Queue;

public class P002_BFS_basic_인접행렬 {
	
	
	public static int N=7; 
	public static int MAX_N = 7; 
	public static int[][] graph =new int[MAX_N][MAX_N];
	
	public static void BFS(int node){
		
		boolean[] visited = new boolean[N];
		Queue<Integer> q =new LinkedList<Integer>(); 
		visited[node] = true; 
		q.add(node); 
		
		while(!q.isEmpty()){
			
			int curr = q.poll(); 
			
			System.out.printf("%c ",curr+65);
			
									//노드의 갯수만큼 반복한다.
			for(int next=0; next <N; next++){
				if(!visited[next] && graph[curr][next]!=0){
					visited[next]=true; 
					q.add(next); 
				}
			}
		}
	}
	/*
	 BFS(0) 
	 	[T,]
	 	Q : 0 
	 	
	 	curr : 0 print(A) 
	 	0 continue
	 	1 !visited[1]==true and graph[0][1]==1 true Q : 1, [T,T,]
	 	2 !visited[2]==true and graph[0][2]==1 true Q : 1,2 [T,T,T,]
	 	3 !visited[3]==true and graph[0][3]==1 false continue;  
	 	4 continue; 
	 	5 continue;
	 	6 continue; 
	 
	 	
	 	[T,T,T,]
	 	Q : 2 
	 	
	 	curr : 1 print(B) 
	 	0 continue;
	 	1 continue;
	 	2 continue; 
	 	3 !visited[3]==true and graph[1][3]==1 true Q : 2,3 [T,T,T,T,]
	 	4 !visited[4]==true and graph[1][4]==1 true Q : 2,3,4 [T,T,T,T,T,]
	 	5 continue; 
	 	6 continue; 
	 	
	 	[T,T,T,T,T,]
	 	Q : 3,4 
	 	curr : 2 print(C) 
	 	0 continue;
	 	1 continue;
	 	2 continue;
	 	3 continue;
	 	4 continue;
	 	5 !visited[5]==true and graph[2][5]==1 false 
	 	6 !visited[6]==true and graph[2][6]==1 false
	 	
	 	[T,T,T,T,T,]
	 	Q : 4
	 	curr : 3 print(D)
	 	0 continue;
	 	1 continue;
	 	2 continue;
	 	3 continue;
	 	4 continue;
	 	5 continue;
	 	6 !visited[6]==true and graph[3][6]==1 true Q : 4,6 [T,T,T,T,T,F,T]
	 	
	 	[T,T,T,T,T,F,T]
	 	Q : 6 
	 	curr : 4 print(E) 
	 	0 continue;
	 	1 continue;
	 	2 continue;
	 	3 continue;
	 	4 continue;
	 	5 continue;
	 	6 continue; 
	 	
	 	[T,T,T,T,T,F,T]
	 	Q : 
	 	curr : 6 print(G) 
	 	0 continue;
	 	1 continue;
	 	2 continue;
	 	3 continue;
	 	4 continue;
	 	5 !visited[5]==true and graph[6][5]==1 true Q : 5 [T,T,T,T,T,T,T]
	 	6 continue;
	 	
	 	[T,T,T,T,T,T,T]
	 	Q : 
	 	curr : 5 print(F) 
	 	0 continue;
	 	1 continue;
	 	2 continue;
	 	3 continue;
	 	4 continue;
	 	5 continue;
	 	6 continue; 
	 	
	 	Q is empty end of while
	 	
	 	
	 */
	
	//https://www.youtube.com/watch?v=yQ7o1Y7X_Rg&list=PL6YHvWRMtz7CbOmh5Id4DERE5gyQC50XS&index=6
	public static void main(String[] args) {
			
		graph[0][1] = graph[1][0] =1;
		graph[0][2] = graph[2][0] =1;
		graph[1][3] = graph[3][1] =1;
		graph[1][4] = graph[4][1] =1;
		graph[2][4] = graph[4][2] =1;
		graph[3][6] = graph[6][3] =1;
		graph[4][6] = graph[6][4] =1;
		graph[5][6] = graph[6][5] =1; 
		
	
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
