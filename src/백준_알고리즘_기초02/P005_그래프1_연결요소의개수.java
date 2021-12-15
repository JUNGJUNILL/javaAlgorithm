package ����_�˰���_����02;

import java.util.Scanner;

public class P005_�׷���1_�������ǰ��� {
	
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
	
		//�����Ұ� �ϳ��� �̾��� ������ 
		//visited�� ���� ó������ false�� ���̴�. 
		
		//�����Ұ� �������� ������ 
		//visited�� ��� �� ������ �ѹ� �� false�� ���̴�. 
		for(int i=0; i<N; i++){
			if(!visited[i]){
				DFS(i,N);
				count++;
			}
		}
		System.out.println(count);
		
		
		
	}
}
