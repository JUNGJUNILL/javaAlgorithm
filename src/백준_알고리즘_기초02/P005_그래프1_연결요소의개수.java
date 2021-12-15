package 백준_알고리즘_기초02;

import java.util.Scanner;

public class P005_그래프1_연결요소의개수 {
	
	static int[][] graph; 
	static int count=0; 
	static boolean[] visited; 
	
	static void DFS(int x,int node){
		visited[x]=true; 
		
		for(int i=0; i<node; i++){
			if(!visited[i] && graph[x][i]==1){
				DFS(i,node); 
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in); 
		int N= sc.nextInt(); 
		int M= sc.nextInt(); 	
		
		graph=new int[N][N]; 
		visited=new boolean[N]; 
		
		for(int i=0; i<M; i++){
			int a=sc.nextInt(); 
			int b=sc.nextInt(); 
			graph[a-1][b-1]=graph[b-1][a-1]=1; 
			
		}
	
		//연결요소가 하나로 이어져 있으면 
		//visited가 가장 처음에만 false일 것이다. 
		
		//연결요소가 나뉘어져 있으면 
		//visited가 어느 한 순간에 한번 더 false일 것이다. 
		for(int i=0; i<N; i++){
			if(!visited[i]){
				DFS(i,N);
				count++;
			}
		}
		System.out.println(count);
		
		
		
	}
}
