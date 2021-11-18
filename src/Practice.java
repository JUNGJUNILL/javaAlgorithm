import java.util.*;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Practice {
	
	static int V=7; 
	static int E=8; 
	static int[][] graph=new int[V][V]; 
	static boolean[] visited01 = new boolean[V];  
	static boolean[] visited02 = new boolean[V]; 
	static boolean[] visited03 = new boolean[V]; 

	//BFS의 흐름도 
	//첫번째 노드를 방문 체크, Q에 저장.. 
	//Q에서 노드를 꺼내어 해당 노드의 인접노드들을 방문했는지 안했는지 확인
	//방문안했으면 방문 체크하고 자료구조에 저장 
	
	static void BFS(int x){
		visited01[x]=true; 
		Queue<Integer> q= new LinkedList<Integer>(); 
		q.add(x); 
		
		while(!q.isEmpty()){
			
			int curr = q.poll(); 
			System.out.printf("%c ",curr+65);
			
			for(int i=0; i<V; i++){
				if(!visited01[i] && graph[curr][i]==1){
					visited01[i]=true; 
					q.add(i); 
				}
			}
		}
	}
	
	static void DFSStack(int x){
		Stack<Integer> stack =new Stack<Integer>(); 
		visited02[x]=true;
		stack.push(x); 
	
			
			while(!stack.isEmpty()){
		
				int curr = stack.pop(); 
				System.out.printf("%c ",curr+65);
				
				for(int i=0; i<V; i++){
					if(!visited02[i] && graph[curr][i]==1){
						visited02[i]=true; 
						stack.push(i); 
					}
				}
			}	
		}
	
	static void DFSRecursive(int x){
		visited03[x]=true; 
		System.out.printf("%c ",x+65); 
		for(int i=0; i<V; i++){
			if(!visited03[i] && graph[x][i]==1){
				DFSRecursive(i); 
			}
			
		}
		
	}

	
	public static void main(String[] args) throws Exception{

		graph[0][1] = graph[1][0] =1;
		graph[0][2] = graph[2][0] =1;
		graph[1][3] = graph[3][1] =1;
		graph[1][4] = graph[4][1] =1;
		graph[2][4] = graph[4][2] =1;
		graph[3][6] = graph[6][3] =1;
		graph[4][6] = graph[6][4] =1;
		graph[5][6] = graph[6][5] =1;
		
		for(int i=0; i<graph.length; i++){
			for(int j=0; j<graph[i].length; j++){
				System.out.print(graph[i][j]+" ");
			}
			System.out.println();
		}
		
		BFS(0); 
		System.out.println();
		DFSStack(0);
		System.out.println();
		DFSRecursive(0); 
	
	}
}

