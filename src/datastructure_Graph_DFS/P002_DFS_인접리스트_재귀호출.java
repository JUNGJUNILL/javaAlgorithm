package datastructure_Graph_DFS;

import java.util.ArrayList;

public class P002_DFS_인접리스트_재귀호출 {

	static int v;
	static ArrayList<Integer>[] list;  
	static boolean[] visited; 
	
	static void DFS(int x){
		visited[x]=true; 
		System.out.printf("%c ",x+65);
		for(int i : list[x]){
			if(!visited[i]){
				DFS(i); 
			}
		}
		
		
	}
	//A B D G E C F 
	public static void main(String[] args) {

		v=7; 
		list=new ArrayList[v]; 
		visited=new boolean[v]; 
		
		for(int i=0; i<v; i++){
			list[i]=new ArrayList<>(); 
		}
		
		list[0].add(1);
		list[0].add(2);
		
		list[1].add(0);
		list[1].add(3);
		list[1].add(4);

		list[2].add(0);
		list[2].add(4);
		
		list[3].add(1);
		list[3].add(6);
		
		list[4].add(1);
		list[4].add(2);
		list[4].add(6);
		
		list[5].add(6);
		
		list[6].add(3);
		list[6].add(4);
		list[6].add(5);
		DFS(0); 
	}
}
