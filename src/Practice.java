import java.util.*;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Practice {
	
	static int V=7; 
	static int E=8; 
	static int[][] graph=new int[V][V]; 
	static boolean[] visited = new boolean[V]; 
	
	static void DFS(int x){
		visited[x]=true; 
		System.out.print((char)(x+65)+" ");
		
		for(int i=0; i<V; i++){
			if(!visited[i] && graph[x][i]==1){
				DFS(i); 
			}
		}
	}
	
	static void DFSStack(int x){
		
		boolean[] hello = new boolean[V]; 
		Stack<Integer> stack = new Stack<>();
		stack.push(x); 
		
		while(!stack.isEmpty()){
			
			int curr = stack.pop(); 
			if(hello[curr]) continue; 
			visited[curr]=true; 
			System.out.printf("%c ",curr+65);
			
			for(int i=0; i<V; i++){
				if(!hello[i] && graph[curr][i]==1){
					stack.push(i); 
				}
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
		DFS(0); 
		System.out.println();
		DFSStack(0); 
	}
}

