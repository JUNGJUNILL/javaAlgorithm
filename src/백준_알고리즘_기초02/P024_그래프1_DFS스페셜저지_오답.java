package ����_�˰���_����02;

import java.util.*;

public class P024_�׷���1_DFS���������_���� {
	
	static int v; 
	static ArrayList<Integer>[] list; 
	static boolean[] visited; 
	static String hello="";
	static void DFS(int x){
		visited[x]=true; 
		hello+=x+1; 
		//System.out.print(x+1+" ");
		
		for(int y : list[x]){
			if(!visited[y]){
				DFS(y);
			}
		}
		
	}
	
	//�ð��ʰ�
	//https://gre-eny.tistory.com/256
	//https://www.acmicpc.net/problem/16964
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in); 
		v = sc.nextInt(); 
		list=new ArrayList[v]; 
		visited=new boolean[v]; 
		
		for(int i=0; i<v; i++){
			list[i]=new ArrayList<>(); 
		}
		
		for(int i=0; i<v-1; i++){
			int u = sc.nextInt()-1; 
			int v = sc.nextInt()-1; 
			
			list[u].add(v);
			list[v].add(u); 
			
		}
		String temp=""; 
		for(int i=0; i<v; i++){
			temp+=sc.next(); 
		}
		
		DFS(0); 
	
		if(temp.equals(hello)){
			System.out.println(1);
		}else{
			System.out.println(0);
		}
		
		
		
		
		

		
	}
}