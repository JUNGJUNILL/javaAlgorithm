package 백준_알고리즘_기초02;

import java.util.ArrayList;

public class 그래프1_ABCDE {

	//https://www.acmicpc.net/problem/13023
	//https://www.acmicpc.net/source/share/9e95120c2a744876813ae5198c84993b
	//https://moonsbeen.tistory.com/161
	//문제를 제대로 이해하지 못한 상태에서 문제를 풀었다. 
	//그리고 설레발을 너무 심하게 쳤다. 
	//0-[1]
	//1-[0,2]
	//2-[1,3]
	//3-[2,4]
	//4-[3]
	
	
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
	static int n; 
	static ArrayList<Integer>[] list; 
	static boolean[] visited=new boolean[5]; 
	public static void DFS(int x, int len){

		if(len==4){
		
			System.out.println(1);
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
		
		int n=5; 
		int m=5; 
		list = new ArrayList[n]; 
		for(int i=0; i<n; i++){
			list[i]=new ArrayList<>(); 
		}

		//솔직히 이 로직이 진짜 이해 안된다.
		list[0].add(1); 
		list[1].add(0); 
		
		list[1].add(2); 
		list[2].add(1);
		
		list[2].add(3); 
		list[3].add(2);
		
		list[3].add(4); 
		list[4].add(3); 
		
		for(int i=0; i<n; i++){
			
			DFS(i,0);
		}

		
		
	}
}
