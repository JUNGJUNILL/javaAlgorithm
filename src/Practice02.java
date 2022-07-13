
import java.util.*;


public class Practice02 {	

	public static int N=8; //노드의 갯수 
	public static int[][] graph =new int[N][N];
	public static void BFS(int node){
		
	boolean[] visited=new boolean[N]; 
	
	Queue<Integer> q =new LinkedList<>(); 
	visited[node]=true;
	q.add(node); 
	
	while(!q.isEmpty()){
		
		int curr=q.poll(); 
		System.out.print(curr+1+" ");
		
		for(int i=0; i<N; i++){
			if(!visited[i] && graph[curr][i]!=0){
				visited[i]=true;
				q.add(i); 
			}
		}
		
	}
	
}
	
	public static void main(String[] args) throws Exception {

		
	graph[0][1] = graph[1][0] =1;
	graph[0][2] = graph[2][0] =1;

	graph[1][3] = graph[3][1] =1;
	graph[1][4] = graph[4][1] =1;
	
	graph[2][4] = graph[4][2] =1;
	graph[3][4] = graph[4][3] =1;
	
	graph[4][5] = graph[5][4] =1;
	
	graph[6][2] = graph[2][6] =1;
	graph[6][7] = graph[7][6] =1;

	graph[7][2] = graph[2][7] =1;	
	graph[7][6] = graph[6][7] =1;
	
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