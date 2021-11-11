import java.awt.print.Book;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import javax.print.DocFlavor.CHAR_ARRAY;


public class Practice {
	
	static final int MAX_N = 5; 
	static int N=5,E=6; 
	static int[][] graph = new int[MAX_N][MAX_N]; 

	
	static void bfs(int node){
		boolean[] visited = new boolean[MAX_N]; 
		
		Queue<Integer> q = new LinkedList<>(); 
		visited[node] = true;
		q.add(node); 
		
		while(!q.isEmpty()){
			int curr = q.remove();
			
			System.out.println(curr+" ");
			
			for(int next=0; next<N; next++){
				
				if(!visited[next] && graph[curr][next] !=0){
					visited[next] = true; 
					q.add(next);
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
		graph[3][4] = graph[4][3] =1; 
		
		bfs(0); 
		
	}
}

