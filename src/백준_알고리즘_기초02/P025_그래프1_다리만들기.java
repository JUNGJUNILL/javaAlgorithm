package 백준_알고리즘_기초02;

import java.util.LinkedList;
import java.util.Queue;

public class P025_그래프1_다리만들기 {

	
	static int v; 
	static int[][] graph;
	static boolean[][] visited; 
	static int[][] D ={{-1,0},{1,0},{0,-1},{0,1}};
	
	static class Point{
		int row, col; 
		public Point(int r, int c){
			this.row = r; 
			this.col = c;
		}
	}
	
	static int[][] BFS(int o1, int o2){
		visited[o1][o2]=true; 
		Queue<Point> q=new LinkedList<>(); 
		q.add(new Point(o1, o2)); 
		
		int maxRow=0; 
		int maxCol =0;
		int[][] array = new int[1][2]; 
		
		while(!q.isEmpty()){
			Point curr = q.poll(); 
			maxRow = Math.max(maxRow, curr.row); 
			maxCol = Math.max(maxCol, curr.col);
			
			
			for(int i=0; i<4; i++){
				int nr = curr.row + D[i][0]; 
				int nc = curr.col + D[i][1]; 
				
				if(nr<0 || nr>v-1 || nc<0 || nc>v-1) continue; 
				if(visited[nr][nc]) continue; 
				if(graph[nr][nc]==0) continue;
				
				visited[nr][nc]=true; 
				q.add(new Point(nr, nc)); 
				
			}
			
			
		}
		System.out.println(maxRow+" : "+maxCol);
		array[0][0]=maxRow; 
		array[0][1]=maxCol; 
		
		return array; 
		
	}
	
	
	//https://www.acmicpc.net/problem/2146
	public static void main(String[] args) {

		v=10; 
		graph=new int[v][v]; 
		visited=new boolean[v][v]; 
		
		graph[0][0]=1;
		graph[0][1]=1;
		graph[0][2]=1;
		graph[0][7]=1;
		graph[0][8]=1;
		graph[0][9]=1;
		
		graph[1][0]=1;
		graph[1][1]=1;
		graph[1][2]=1;
		graph[1][2]=1;
		graph[1][8]=1;
		graph[1][9]=1;
		
		graph[2][0]=1;
		graph[2][2]=1;
		graph[2][3]=1;
		
		graph[2][8]=1;
		graph[2][9]=1;
		
		graph[3][2]=1;
		graph[3][3]=1;
		graph[3][4]=1;
		graph[3][9]=1;		
		
		graph[4][3]=1;
		graph[4][9]=1;
		
		graph[5][9]=1;
	
		graph[7][4]=1;
		graph[7][5]=1;
		
		graph[8][4]=1;
		graph[8][5]=1;
		graph[8][6]=1;
		
		
		for(int i=0; i<graph.length; i++){
			for(int j=0; j<graph[i].length; j++){
				System.out.print(graph[i][j]+" ");
			}
			System.out.println();
		}
		
		int[][] arrayList = BFS(0,0); 
		

		
	}
}
