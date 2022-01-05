package 백준_알고리즘_기초02;

import java.util.*;

public class P025_그래프1_DFS스페셜저지 {

	static int idx=1;
	static int v; 
	static boolean correct=true;
	
	static ArrayList<Integer> arr; 
	static ArrayList<Integer>[] list; 
	static boolean[] visited; 
	
	static void DFS(int x){
		if(!correct){
			return; 
		}
		
		HashSet<Integer> set =new HashSet<>(); 
		for(int y : list[x]){
			if(!visited[y]){
				visited[y]=true;
				set.add(y); 
			}
		}
		

		for(int i=0; i<set.size(); i++){
			if(set.remove(arr.get(idx))){
				DFS(arr.get(idx++)); 
			}else{
				correct=false; 
				return; 
			}
		}
		
		
		
	}
	
	
	//https://gre-eny.tistory.com/256
	//https://www.acmicpc.net/source/35268362
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
	
		arr=new ArrayList<>(); 
		for(int i=0; i<v; i++){
			int index  = sc.nextInt()-1;
			arr.add(index); 
		}
		
		if(arr.get(0)!=0){
			System.out.println(0);
			System.exit(0);
		}else{
			visited[0]=true; 
			DFS(0); 
			
			if(correct){
				System.out.println(1);
			}else{
				System.out.println(0);	
			}
			
	}

		
	}
}