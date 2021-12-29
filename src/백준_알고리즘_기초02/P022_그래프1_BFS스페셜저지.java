package ����_�˰���_����02;

import java.util.*;

public class P022_�׷���1_BFS��������� {
	
	static boolean[] visited;
	
	static void BFS(int start){
		
	}

	
	//����
	//https://www.acmicpc.net/source/share/6c58c942cff74fc39d27f890916cce95
	//https://www.acmicpc.net/problem/16940
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int n=sc.nextInt(); 
		ArrayList<Integer>[] a = new ArrayList[n]; 
		
		int[] parent = new int[n]; 
		int[] order =new int[n]; 
		visited = new boolean[n]; 
		
		for(int i=0; i<n; i++){
			a[i]=new ArrayList<>(); 
		}
		
	
		for(int i=0; i<n-1; i++){
			int u=sc.nextInt()-1; 
			int v=sc.nextInt()-1; 
			
			a[u].add(v); 
			a[v].add(u); 
		}
		
		for(int i=0; i<n; i++){
			order[i]=sc.nextInt()-1; 
		}
		//[0,1,2,3]
		
		Queue<Integer> q = new LinkedList<Integer>(); 
		q.add(0); 
		visited[0]=true; 
		int m=1; 
		
		for(int i=0; i<n; i++){
			if(q.isEmpty()){
				System.out.println(0);
				System.exit(0);
			}
			
			int x = q.poll(); 
			if(x !=order[i]){
				System.out.println(0);
				System.exit(0);
			}
			
			int cnt=0;
			for(int y : a[x]){
				if(!visited[y]){
					parent[y]=x;
					cnt+=1; 
				}
			}
			
			for(int j=0; i<cnt; j++){
				if(m+j >=n || parent[order[m+j]] !=x){
					System.out.println(0);
					System.exit(0);
				}
				q.add(order[m+j]); 
				visited[order[m+j]]=true; 
				
			}
			m+=cnt; 

		}
		System.out.println(1);
		
	}
}
