package 백준_알고리즘_기초02_그래프;

import java.util.LinkedList;
import java.util.Queue;

public class P011_그래프1_미로탐색_BFS {

	
	//BFS로만이 최단거리를 풀 수 있다. 
	static int a; 
	static int b; 
	static int[][] graph; 
	static boolean[][] visited; 
	static int[][] D={{-1,0},
						{1,0},
						{0,-1},
						{0,1}};
	
	static class Point{
		int row, col, dist; 
		public Point(int r, int c, int d){
			this.row=r; 
			this.col=c; 
			this.dist=d; 
		}
	}
	static int BFS(int o1, int o2, int f1, int f2){
		visited[o1][o2]=true; 
		Queue<Point> q =new LinkedList<>();
		q.add(new Point(o1, o2,1)); 
				
		while(!q.isEmpty()){
			
			
			Point curr =q.poll(); 
			System.out.println("curr.row="+curr.row+" : "+"curr.col="+curr.col+" : "+"curr.dist="+curr.dist);
			if(curr.row==f1 && curr.col==f2){
				return curr.dist; 
			}
			
	
			
			for(int i=0; i<4; i++){
				int nr=curr.row + D[i][0]; 
				int nc=curr.col  + D[i][1]; 
				
				if(nr<0 || nr>a-1 || nc<0 || nc>b-1) continue; 
				if(graph[nr][nc]==0) continue; 
				if(visited[nr][nc]) continue; 
				
				
				visited[nr][nc]=true; 
				q.add(new Point(nr, nc,curr.dist+1)); 
			}
			
		
		}
		
		return -1; 
		
	}
	
	
	//https://www.acmicpc.net/problem/2178
	public static void main(String[] args) {

		a=4; 
		b=6; 

		graph=new int[a][b]; 
		visited=new boolean[a][b]; 
		
		graph[0][0]=1;
		graph[0][1]=1;
		graph[0][3]=1;
		graph[0][4]=1;
		
		graph[1][0]=1;
		graph[1][1]=1;
		graph[1][3]=1;
		graph[1][4]=1;
		
		graph[2][0]=1;
		graph[2][1]=1;
		graph[2][2]=1;
		graph[2][3]=1;
		graph[2][4]=1;
		graph[2][5]=1;
		
		graph[3][0]=1;
		graph[3][1]=1;
		graph[3][2]=1;
		graph[3][3]=1;
		graph[3][5]=1;
		
		for(int i=0; i<graph.length; i++){
			for(int j=0; j<graph[i].length; j++){
				System.out.print(graph[i][j]+" ");
			}
			System.out.println();
		}
		
		 
		System.out.println();
		
		System.out.println(BFS(0,0,a-1,b-1));
		
		
	}

}
