import java.util.*;


import Algorithm_basic_Top10.DFS;

public class Hello {

	public static int N=7; //노드의 갯수 
	public static int[][] graph =new int[N][N];

	public static void BFS(int x){
		boolean[] visited=new boolean[N]; 
		visited[x]=true; 
		Queue<Integer> q= new LinkedList<>(); 
		q.add(x); 
		
		while(!q.isEmpty()){
			int curr= q.poll(); 
			System.out.printf("%c ",curr+65);
			
			for(int i=0; i<N; i++){
				if(!visited[i] && graph[curr][i]==1){
					visited[i]=true; 
					q.add(i); 
				}
			}
			
		}
	}
	
	public static boolean[] hello=new boolean[N]; 
	public static void DFS(int x){
		hello[x]=true;
		System.out.printf("%c ",x+65);
		for(int i=0; i<N; i++){
			if(!hello[i] && graph[x][i]==1){
				DFS(i); 
			}
		}
		
		
		
	}
	
	
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
	System.out.println();
	DFS(0); 
	
	}
}
