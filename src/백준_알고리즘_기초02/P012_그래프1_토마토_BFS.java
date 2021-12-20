package 백준_알고리즘_기초02;

import java.util.LinkedList;
import java.util.Queue;

public class P012_그래프1_토마토_BFS {
	
	static int M;
	static int N; 
	static int[][] graph; 
	static boolean[][] visited;
	static int[][] D={{-1,0},
						{1,0},
						{0,-1},
						{0,1}};
	
	
	static class Point{
		
		int row, col, day;
		public Point(int row, int col,int d){
			this.row=row; 
			this.col=col;
			this.day=d; 
		}
	}
	
	static void BFS(){
		
	
		
	}
	
	public static void main(String[] args) {

		M=6; 
		N=4; 
		graph=new int[N][M]; 
		visited=new boolean[N][M];
		graph[0][0]=1;
		graph[0][1]=-1;
		graph[1][1]=-1;
		graph[2][4]=-1;
		graph[3][4]=-1;
		graph[3][5]=1; 
		
		for(int i=0; i<graph.length; i++){
			for(int j=0; j<graph[i].length; j++){
				System.out.print(graph[i][j]+" ");
			}
			System.out.println();
		}
		
		
System.out.println(BFS(0,0,N-1,M-1));		
		
		
	}
}
