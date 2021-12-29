package 백준_알고리즘_기초02;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P021_그래프1_BFS스페셜저지 {

	static int[][] graph; 
	static boolean[] visited;
	
	static String BFS(int node,int n){
		visited[node]=true; 
		Queue<Integer> q =new LinkedList<Integer>();
		q.add(node); 
		String temp="";
		
		while(!q.isEmpty()){
			int curr=q.poll(); 
			temp+=curr+1; 
			
			for(int i=0; i<n; i++){
				if(!visited[i] && graph[curr][i]==1){
					visited[i]=true;
					q.add(i); 
				}
			}
			
		}
		return temp; 
		
		
	}
	
	//O(V^2)
	//이 풀이는 메모리 초과 뜸
	//http://codeplus.codes/6c58c942cff74fc39d27f890916cce95
	//https://www.acmicpc.net/problem/16940
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in); 
		int n=sc.nextInt(); 
		String temp=""; 
		graph=new int[n][n]; 
		visited=new boolean[n]; 
		
		for(int i=0; i<n; i++){
			int a=sc.nextInt(); 
			int b=sc.nextInt(); 
			
			graph[a-1][b-1]=graph[b-1][a-1] = 1; 
			
			if(i==n-1){
				temp+=sc.next(); 
			}
			
		}
	
		if(BFS(0,n).equals(temp)){
			System.out.println(1);
		}else{
			System.out.println(-1);
		}
		
		 
	
		
		
		
	}
}
