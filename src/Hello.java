import java.beans.Visibility;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

import Algorithm_basic_Top10.DFS;

public class Hello {
	
	static int V=7; 
	static int E=8; 
	static boolean[][] visited01=new boolean[V][V];
	static int[][] graph = new int[V][V]; 
	static int[][] D ={{-1,0},{1,0},{0,-1},{0,1}}; 
	
	static class Point{
		int row, col;
		public Point(int row, int col){
			this.row = row; 
			this.col = col; 
			 
		}
		
	}
	
	static void DFS_Fill(int r, int c, int color){
		Stack<Point> stack =new Stack<>(); 
		stack.push(new Point(r, c)); 
		
		while(!stack.isEmpty()){
			
			Point curr = stack.pop(); 
			if(visited01[curr.row][curr.col]) continue; 
			visited01[curr.row][curr.col]=true; 
			graph[curr.row][curr.col]=color; 
			
			for(int i=0; i<4; i++){
				int nr = curr.row + D[i][0]; 
				int nc =curr.col + D[i][1]; 
				
				if(nr<0 || nr>V-1 || nc<0 || nc>V-1)continue; 
				if(visited01[nr][nc]) continue; 
				if(graph[nr][nc]==1) continue; 
				
				stack.push(new Point(nr, nc)); 
				
				
			}
			
		}
		
		
		
	}
	

	public static void main(String[] args) {
		
		graph[0][0]=0;
		graph[0][1]=1;
		graph[0][2]=1;
		graph[0][3]=0;
		graph[0][4]=0;
		graph[0][5]=0;
		graph[0][6]=0;	
		
		graph[1][0]=1;
		graph[1][1]=0;
		graph[1][2]=0;
		graph[1][3]=1;
		graph[1][4]=1;
		graph[1][5]=0;
		graph[1][6]=0;

		graph[2][0]=1;
		graph[2][1]=0;
		graph[2][2]=0;
		graph[2][3]=0;
		graph[2][4]=1;
		graph[2][5]=0;
		graph[2][6]=0;

		graph[3][0]=0;
		graph[3][1]=1;
		graph[3][2]=0;
		graph[3][3]=0;
		graph[3][4]=0;
		graph[3][5]=0;
		graph[3][6]=1;
		
		graph[4][0]=0;
		graph[4][1]=1;
		graph[4][2]=1;
		graph[4][3]=0;
		graph[4][4]=0;
		graph[4][5]=0;
		graph[4][6]=0;
		
		graph[5][0]=0;
		graph[5][1]=0;
		graph[5][2]=0;
		graph[5][3]=0;
		graph[5][4]=0;
		graph[5][5]=0;
		graph[5][6]=1;
		
		graph[6][0]=0;
		graph[6][1]=0;
		graph[6][2]=0;
		graph[6][3]=1;
		graph[6][4]=0;
		graph[6][5]=1;
		graph[6][6]=0;
		
		DFS_Fill(0, 0, 3);
		
		for(int i=0; i<graph.length; i++){
			for(int j=0; j<graph[i].length; j++){
				System.out.print(graph[i][j]+" ");
			}
			System.out.println();
		}

	}
}
