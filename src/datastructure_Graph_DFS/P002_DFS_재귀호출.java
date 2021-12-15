package datastructure_Graph_DFS;

public class P002_DFS_재귀호출 {

	//재귀 호출을 이용한 DFS , 정점의 크기가 작은 순으로 들어간다.
	static int V =7; 
	static int E =8;
	static int[][] graph = new int[V][V]; 
	static boolean[] visited = new boolean[V]; 
	
	
	static void DFS(int x){
		visited[x] =true; 
		System.out.printf("%c ",x+65);
		
		for(int i=0; i<V; i++){
			if(!visited[i] && graph[x][i]==1){
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
	
	//https://www.youtube.com/watch?v=0Njv04WiLV0&list=PL6YHvWRMtz7CbOmh5Id4DERE5gyQC50XS&index=5
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
