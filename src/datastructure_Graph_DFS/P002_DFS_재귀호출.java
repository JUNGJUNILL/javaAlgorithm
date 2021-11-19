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
				System.out.println((char)(i+65));
				DFS(i); 
			}
		}
	}
	
	/*
	 DFS(0) visited[0]=true, print(A) 
	 
	 for 7 
	 0 !visited[0]=false continue
	 1 !visited[1]=true && graph[0][1]==1 true 
	 2
	 3 
	 4
	 5
	 6
	 
	 DFS(1) visited[1]=true, print(B) 
	 for 7 
	 0 !visited[0]=false continue
	 1 !visited[1]=false continue
	 2 !visited[2]=true && graph[1][2]==1 false 
	 3 !visited[3]=true && graph[1][3]==1 true 
	 4
	 5
	 6
	 
	 DFS(3) visited[3]=true, print(D) 
	 for 7 
	 0 !visited[0]=false continue
	 1 !visited[1]=false continue
	 2 !visited[2]=true && graph[3][2]==1 false 
	 3 !visited[2]=true && graph[3][3]==1 false 
	 4 !visited[2]=true && graph[3][4]==1 false
	 5 !visited[2]=true && graph[3][5]==1 false
	 6 !visited[2]=true && graph[3][6]==1 true
	 
	 DFS(6) visited[6]=true, print(G) 
	 for 7 
	 0 !visited[0]=false continue
	 1 !visited[1]=false continue
	 2 !visited[2]=true && graph[6][2]==1 false 
	 3 !visited[3]=false 
	 4 !visited[2]=true && graph[6][4]==1 true DFS(4), print(E), DFS(2) , print(C) 
	 5 !visited[5]=true && graph[6][5]==1 true DFS(5), print(F) 
	 6 !visited[6]=false
	 
	 DFS(4) visited[4]=true, print(E) 
	 for 7 
	 0 !visited[0]=false continue
	 1 !visited[1]=false continue
	 2 !visited[2]=true && graph[4][2]==1 true 
	 3 !visited[3]=false 
	 4 !visited[4]=false continue
	 5 !visited[5]=true && graph[4][5]==1 false 
	 6 !visited[6]=false continue	 
	 
	 DFS(2) visited[4]=true, print(C) 
	 for 7 
	 0 !visited[0]=false continue
	 1 !visited[1]=false continue
	 2 !visited[2]=false continue
	 3 !visited[3]=false continue
	 4 !visited[4]=false continue
	 5 !visited[5]=true && graph[2][5]==1 false
	 6 !visited[6]=false

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
