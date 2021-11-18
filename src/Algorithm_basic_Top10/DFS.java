package Algorithm_basic_Top10;

import java.util.Scanner;
import java.util.Stack;

public class DFS {

	static int[][] graph; 
	static boolean[] visited;
	static boolean[] hello; 


	
	
//	static void DFSRecursive(int x,int V){
//		visited[x]=true; 
//		System.out.print(x); 
//		for(int i=0; i<V; i++){
//			if(!visited[i] && graph[x][i]==1){
//				DFSRecursive(i,V); 
//			}	
//		}
//	}
	
	static void DFS(int x,int V){
		Stack<Integer> stack = new Stack<>(); 
		stack.push(x);  
		
		while(!stack.isEmpty()){
			int curr = stack.pop(); 
			if(visited[curr]) continue; 
			System.out.print(curr+" ");
			visited[curr]=true; 
			for(int i=0; i<V; i++){
				if(!visited[i] && graph[curr][i]==1){
					stack.push(i); 
				}
			}
			
			
		}
		
	}
	
	//https://www.acmicpc.net/problem/2667
	public static void main(String[] args) {
	
		Scanner sc =new Scanner(System.in); 
		int N =sc.nextInt(); 
		int M =sc.nextInt(); 
		int S =sc.nextInt(); 
		
		graph = new int[N][N];
		visited =new boolean[N]; 
		hello =new boolean[N]; 
		
		for(int i=0; i<M; i++){
			
			int a = sc.nextInt(); 
			int b = sc.nextInt(); 
			graph[a-1][b-1] = graph[b-1][a-1] = 1; 

		}
		
		for(int i=0; i<graph.length; i++){
			for(int j=0; j<graph[i].length; j++){
				System.out.print(graph[i][j]);
			}
			System.out.println();
		}
		
		DFS(1,N); 
		
		
		
	}
}
