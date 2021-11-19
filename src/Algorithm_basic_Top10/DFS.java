package Algorithm_basic_Top10;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class DFS {

	static int[][] graph; 
	static boolean[] visited01;
	static boolean[] visited02;


	
	
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
		visited01[x]=true; 
			System.out.printf("%d ",x+1);
			
			//점정 번호가 작은 것을 먼저 방문...
			 for(int i=0; i<V; i++){ //0 1 2 3 
				 if(!visited01[i] && graph[x][i]==1){
					 DFS(i,V);	 
				 }  
			 }
	}
	
	static void BFS(int x,int V){
	
		Queue<Integer> q=new LinkedList<Integer>(); 
		visited02[x]=true; 
		q.add(x); 

		while(!q.isEmpty()){
			int curr =q.poll(); 
			System.out.printf("%d ",curr+1);

			for(int i=0; i<V; i++){
				if(!visited02[i] && graph[curr][i]==1){
					q.add(i); 
					visited02[i]=true; 

				}
			}
		}
		
		
		
	}
	
	/*
	 0 1 3 2
	 [0][0],
	 
	 [0][1]==1 true visited[1]=true, stack : 1 
	 [0][2]==1 true visited[2]=true, stack : 1,2
	 [0][3]==1 true visited[3]=true, stack : 1,3,2 이렇게 들어가야 DFS가 성립한다... 어떻게 할 것인가? 
	 
	 */
	
	//https://www.acmicpc.net/problem/2667
	public static void main(String[] args) {
	
		Scanner sc =new Scanner(System.in); 
		int N =sc.nextInt(); 
		int M =sc.nextInt(); 
		int S =sc.nextInt(); 
		
		graph = new int[N][N];
		visited01 =new boolean[N]; 
		visited02 = new boolean[N];
		
		for(int i=0; i<M; i++){
			
			int a = sc.nextInt(); 
			int b = sc.nextInt(); 
			graph[a-1][b-1] = graph[b-1][a-1] = 1; 

		}
		
//		for(int i=0; i<graph.length; i++){
//			for(int j=0; j<graph[i].length; j++){
//				System.out.print(graph[i][j]);
//			}
//			System.out.println();
//		}
		
		DFS(S-1,N); 
		System.out.println();
		BFS(S-1,N);
		
		
		
	}
}
