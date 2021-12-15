package 백준_알고리즘_기초02;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P004_그래프1_DFS와BFS {

	
	static int[][] graph; 
	static boolean[] visited; 
	
	static void BFS(int x, int node){
		visited[x]=true; 
		Queue<Integer> q =new LinkedList<Integer>(); 
		q.add(x); 
		
		while(!q.isEmpty()){
			int curr=q.poll(); 
			System.out.print(curr+1+" ");
			
			for(int i=0; i<node; i++){
				if(!visited[i] && graph[curr][i]==1){
					visited[i]=true; 
					q.add(i); 
				}
			}
		}
		
	}
	
	static boolean[] dfsVisited; 
	static void DFS(int x,int node){
		dfsVisited[x]=true; 
		System.out.print(x+1+" ");
		for(int i=0; i<node; i++){
			if(!dfsVisited[i] && graph[x][i]==1){
				DFS(i,node); 
			}
		}
		
	}
	
	
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in); 
		
		int N=sc.nextInt(); 
		int M=sc.nextInt(); 
		int V=sc.nextInt(); 
		
		graph=new int[N][N]; 
		visited=new boolean[N]; 
		dfsVisited=new boolean[N]; 
		
		for(int i=0; i<M; i++){
			int a= sc.nextInt(); 
			int b= sc.nextInt(); 
			graph[a-1][b-1]=graph[b-1][a-1]=1; 
			
		}

		for(int i=0; i<graph.length; i++){
			for(int j=0; j<graph[i].length; j++){
				System.out.print(graph[i][j]+" ");
			}
			System.out.println();
		}
		DFS(V-1,N);
		System.out.println();
		BFS(V-1,N); 
		
	}
}
