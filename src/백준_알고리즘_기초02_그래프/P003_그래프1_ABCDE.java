package 백준_알고리즘_기초02_그래프;

import java.util.ArrayList;

public class P003_그래프1_ABCDE {


	static boolean[] visited=new boolean[6]; 
	static ArrayList<Integer>[] list; 
	public static void DFS(int x, int len){
		if(len==4){
			System.out.println(1);
			return; 
		}
		visited[x]=true;
		for(int i=0; i<list[x].size(); i++){
			int temp= list[x].get(i); 
			if(!visited[temp]){
				visited[temp]=true;
				DFS(temp,len+1); 
				visited[temp]=false; 
				
			}
		}
		
		/*
		DFS(0,0) 
		visited[0]=true;
		list[0].size()==4 
		FOR 
		0 temp = list[0].get(0)==1 
		  !visited[1] false 
		  visited[1]=true; 
			  DFS(1,1)
			  list[1].size()==1
			  FOR
			  0 temp = list[1].get(0)==0 continue
		  visited[1]=false;
		   
		1 temp = list[0].get(1)==2
		  !visited[temp] true
		  visited[temp]=true 
			  DFS(2,1)
			  list[2].size()==1
			  FOR 
			  0 temp = list[2].get(0)==0 continue 
		  visited[2]=false
		
		
		2 temp = list[0].get(2)==3
		  !visited[3] true
		  visted[3]=true 
			  DFS(3,1) 
			  list[3].size()==1
			  FOR 
			  0 temp = list[3].get(0)== 0 continue 
		  visited[3]=false
		 
		3
		  
		  
		 */
		
		
		
	}
	public static void main(String[] args) {

		
		list =new ArrayList[6]; 
		for(int i=0; i<6; i++){
			list[i]=new ArrayList<>(); 
		}
		
		/*
		 
		 list[0] = {1,2,3,4}
		 list[1] = {0}
		 list[2] = {0}
		 list[3] = {0}
		 list[4] = {0}
		 list[5] = {0} 
		 
		 
		 */
		list[0].add(1); 
		list[1].add(0); 
		
		list[0].add(2); 
		list[2].add(0); 
		
		list[0].add(3); 
		list[3].add(0);
		
		list[0].add(4); 
		list[4].add(0);
		
		
		list[0].add(5); 
		list[5].add(5); 

		 		
		DFS(0,0);
		DFS(1,0);
		DFS(2,0); 
		DFS(3,0); 
		DFS(4,0);
		DFS(5,0);
		
	}

}
