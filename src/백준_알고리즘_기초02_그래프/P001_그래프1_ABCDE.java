package ����_�˰���_����02_�׷���;

import java.beans.Visibility;
import java.util.ArrayList;
import java.util.Scanner;

class Edge{
	int from, to; 
	Edge(int from , int to){
		this.from = from; 
		this.to = to; 
	}
	
}

public class P001_�׷���1_ABCDE {

	//https://www.acmicpc.net/problem/13023
	//https://www.acmicpc.net/source/share/9e95120c2a744876813ae5198c84993b
	//https://moonsbeen.tistory.com/161
	//������ ����� �������� ���� ���¿��� ������ Ǯ����. 
	//�׸��� �������� �ʹ� ���ϰ� �ƴ�. 

	
	//ArrayList[0]-[1]   -size:1
	//ArrayList[1]-[0,2] -size:2
	//ArrayList[2]-[1,3] -size:2
	//ArrayList[3]-[2,4] -size:2
	//ArrayList[4]-[3]   -size:1
	/*
    0 1
	1 2
	2 3
	3 4
	 */
	
	public static ArrayList<Integer>[] list; 
	public static boolean[] visited; 

	public static void DFS(int x, int len){
		if(len==4){
			System.out.println(1);
			System.exit(0);
		}
		visited[x]=true; 
		
		for(int i=0; i<list[x].size(); i++){
			int temp = list[x].get(i); 
			if(!visited[temp]){
				visited[temp]=true; 
				DFS(temp,len+1); 
				visited[temp]=false; 
			}
		}
		
	}

	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in); 
		int n=sc.nextInt(); 
		int m=sc.nextInt(); 
		
		list =new ArrayList[n]; 
		for(int i=0; i<n; i++){
			list[i]=new ArrayList<Integer>(); 
		}
		
		for(int i=0; i<m; i++){
			int a=sc.nextInt(); 
			int b=sc.nextInt(); 
			
			list[a].add(b); 
			list[b].add(a); 
		}
		
		for(int i=0; i<n; i++){
			visited = new boolean[n]; 
			DFS(i,0); 
		}
		System.out.println(0);
		
		
		
	}
	

}
