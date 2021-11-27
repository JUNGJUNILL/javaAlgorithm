import java.util.*;


public class Practice {
	
	static int V =7; 
	static int E =8; 
	
	static int[][] graph=new int[V][V]; 
	
	
	static void BFS(int x){
		boolean[] visited =new boolean[V];
		Queue<Integer> q = new LinkedList<Integer>(); 
		visited[x]=true;
		q.add(x); 
		
		while(!q.isEmpty()){
			
			int curr = q.poll(); 
			System.out.printf("%c ",curr+65);
			
			for(int i=0; i<V; i++){
				if(!visited[i] && graph[curr][i]==1){
					visited[i]=true; 
					q.add(i); 
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
	
	static boolean[] dfsVisited=new boolean[V];
	static void DFS(int x){
		dfsVisited[x]=true; 
		System.out.printf("%c ",x+65);
		for(int i=0; i<V; i++){
			if(!dfsVisited[i] && graph[x][i]==1){
				DFS(i); 
			}
		}
	}
	/*
	 DFS(0) visited[0]=true, print(A) 
	 0 continue; 
	 1 !visited[1]==true and graph[0][1]==1 true 
	 	DFS(1) visited[1]=true, print(B) 
	 	0 continue;
	 	1 continue; 
	 	2 !visited[2]==true and graph[1][2]==1 false 
	 	3 !visited[3]==true and graph[1][3]==1 true
	 	   DFS(3) visited[3]=true, print(D) 
	 	   0 continue
	 	   1 continue
	 	   2 !visited[2]==true and graph[3][2]==1 false 
	 	   3 continue
	 	   4 !visited[4]==true and graph[3][4]==1 false
	 	   5 !visited[5]==true and graph[3][5]==1 false
	 	   6 !visited[6]==true and graph[3][6]==1 true 
	 	   	  DFS(6) visited[6],  print(G) 
	 	   	  0 continue
	 	   	  1 continue
	 	   	  2 !visited[2]==true and graph[6][2]==1 false 
	 	   	  3 continue	   	  
	 	   	  4 !visited[4]==true and graph[6][4]==1 true 
	 	   	  	DFS(4) E, visited[4]=true, print(E) 
	 	   	  	0 continue
	 	   	  	1 continue
	 	   	  	2 !visited[2]==true and graph[4][2]==true 
	 	   	  	   DFS(2) visited[2]=true, print(C) 
	 	   	  	   0 continue
	 	   	  	   1 continue
	 	   	  	   2 continue
	 	   	  	   3 continue
	 	   	  	   4 continue
	 	   	  	   5 !visied[5]==true and graph[2][5]==1 false 
	 	   	  	   6 continue
	 	   	  	3 continue
	 	   	  	4 continue
	 	   	  	5 !visied[5]==true and graph[4][5]==1 false 
	 	   	  	6 continue
	 	   	  	
	 	   	  5 !visied[5]==true and graph[6][5]==1 true
	 	   	    DFS(5) visited[5]=true, print(F)
	 	   	  6 continue
	 	4 continue;
	 	5 continue;
	 	6 continue;
	 	
	 2 continue;
	 3 continue; 
	 4 continue;
	 5 continue;
	 6 continue;
	  
	  
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
		
		BFS(0); 
		System.out.println();
		DFS(0); 
		
	}
}




