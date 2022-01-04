package 백준_알고리즘_기초02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P023_그래프1_BFS스페셜저지_오답 {



		static int v, e; 
		static ArrayList<Integer>[] a;

		static boolean[] visited; 
		
		static String BFS(int start){
			visited[start]=true; 
			Queue<Integer> q=new LinkedList<Integer>(); 
			q.add(start); 
			String temp=""; 
			
			while(!q.isEmpty()){
				int curr=q.poll(); 
				//System.out.println(curr+1);
				temp+=curr+1; 
				for(int t : a[curr]){
					if(visited[t]) continue; 
					  visited[t]=true; 
					  q.add(t);
				}	
			}
			
			return temp; 
		}
		
		//시간초과뜸
		//https://www.acmicpc.net/source/share/6c58c942cff74fc39d27f890916cce95
		//https://www.acmicpc.net/problem/16940
		public static void main(String[] args) {

			Scanner sc =new Scanner(System.in); 
			
			//정점의 갯수
			v=sc.nextInt();
			a= new ArrayList[v]; 
			visited = new boolean[v];
			
			for(int i=0; i<v; i++){
				a[i]=new ArrayList<>(); 
			}
			
			for(int i=0; i<v-1; i++){
				int u=sc.nextInt()-1; 
				int v=sc.nextInt()-1; 
				
				a[u].add(v);
				a[v].add(u); 
				
			}
			String temp=""; 
			for(int i=0; i<v; i++){
				temp+=sc.next(); 
			}
			
			if(temp.equals(BFS(0))){
				System.out.println(1);
			}else{
				System.out.println(0);
			}
			
			
			//1 2
			//1 3
			//2 4 
//			a[0].add(1);
//			a[0].add(2);
//			
//			a[1].add(0);
//			a[1].add(3);
//			a[1].add(4);
//
//			a[2].add(0);
//			a[2].add(4);
//			
//			a[3].add(1);
//			a[3].add(6);
//			
//			a[4].add(1);
//			a[4].add(2);
//			a[4].add(6);
//			
//			a[5].add(6);
//			
//			a[6].add(3);
//			a[6].add(4);
//			a[6].add(5);
			
			BFS(0); 
			
		
	}

}
