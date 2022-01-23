package datastructure_Graph_DFS;

import java.util.Stack;

public class P004_DFS_FloodFill {

	static int V=5; 
	static int[][] D={{-1,0},{1,0},{0,-1},{0,1}}; 
	static int[][] graph=new int[V][V]; 
	static class Point{
		int row ,col; 
		public Point(int r , int c){
			this.row = r; 
			this.col = c; 
		}
		
	}
	static void DFS_Flood_Fill(int r, int c, int color){
		boolean[][] visited=new boolean[V][V]; 
		Stack<Point> stack = new Stack<>(); 
		visited[r][c]=true;
		stack.push(new Point(r,c)); 
		
		while(!stack.isEmpty()){
			Point curr = stack.pop(); 
			graph[curr.row][curr.col]=color; 
			
			for(int i=0; i<4; i++){
				int nr = curr.row+D[i][0]; 
				int nc = curr.col+D[i][1]; 
				
				if(nr<0 || nr>V-1 || nc<0 || nc>V-1) continue; 
				if(visited[nr][nc]) continue; 
				if(graph[nr][nc]==1)continue; 
				visited[nr][nc]=true;
				stack.push(new Point(nr, nc)); 
				
				
			}
		}
	}
	
	
	public static void main(String[] args) {

		graph[0][1]=1; 
		graph[1][3]=1;
		graph[1][4]=1;
		graph[1][0]=1; 
	
		
		graph[2][3]=1;
		
		graph[3][0]=1;
		graph[3][1]=1;
		graph[3][2]=1;
		graph[3][3]=1;
		
		DFS_Flood_Fill(0, 2, 3);
		
		for(int i=0; i<graph.length; i++){
			for(int j=0; j<graph[i].length; j++){
				System.out.print(graph[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
