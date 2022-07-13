package datastructure_Graph_BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P002_BFS_basic_인접리스트 {
	
	static int v; 
	static ArrayList<Integer>[] a;

	static boolean[] visited; 
	
	static void BFS(int start){
		visited[start]=true; 
		Queue<Integer> q=new LinkedList<Integer>(); 
		q.add(start); 
		
		while(!q.isEmpty()){
			int curr=q.poll(); 
			System.out.printf("%c ",curr+65);
			for(int t : a[curr]){
				if(!visited[t]){
					visited[t]=true; 
					q.add(t);
				}
			}	
		}
		
	}
	
	//O(V+E)
	//인접 행렬보다 시간복잡도가 적다.
	//https://suriisurii.tistory.com/6
	public static void main(String[] args) {


		//정점의 갯수
		v=7; 

		a= new ArrayList[v]; 
		
		visited = new boolean[v];
		
		
		for(int i=0; i<v; i++){
			a[i]=new ArrayList<>(); 
		}
		
		
		
		//1 2
		//1 3
		//2 4 
		a[0].add(1);
		a[0].add(2);
		
		a[1].add(0);
		a[1].add(3);
		a[1].add(4);

		a[2].add(0);
		a[2].add(4);
		
		a[3].add(1);
		a[3].add(6);
		
		a[4].add(1);
		a[4].add(2);
		a[4].add(6);
		
		a[5].add(6);
		
		a[6].add(3);
		a[6].add(4);
		a[6].add(5);
		
		BFS(0); 
		
	
	}
}
