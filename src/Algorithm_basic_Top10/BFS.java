package Algorithm_basic_Top10;

import java.beans.Visibility;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import javax.swing.border.Border;

public class BFS {

	public static int[][] Board;
	public static boolean[][] visited;
	public static int row; 
	public static int col;
	

	static int[][] D    ={
							{-1,0}, //(0,0) 위로 한칸이동 
							{1,0},  //(1,0) 아래로 한칸이동
							{0,-1}, //(2,1) 왼쪽으로 한칸이동
							{0,1}   //(3,1) 오른쪽으로 한칸이동
							};
	static int drawCount = 0; 
	static int maxDrawCount  = 0; 
	
	
	static class Point{
		int row, col;
		public Point(int r, int c){
			this.row = r; 
			this.col = c; 
		}
	}
	static void BFS(int o1, int o2){
		
		Queue<Point> q;  q=new LinkedList<>(); 
		q.add(new Point(o1, o2)); 
		int count = 0; 
		
		while(!q.isEmpty()){
			Point curr = q.poll(); 
			count++; 
			for(int i=0; i<4; i++){
				int nr = curr.row+D[i][0]; 
				int nc = curr.col+D[i][1]; 
				
				if(nr<0 || nr>row-1 || nc<0 || nc>col-1)continue; 
				if(visited[nr][nc])continue; 
				if(Board[nr][nc]==0)continue; 
				
				visited[nr][nc]=true; 
				q.add(new Point(nr, nc)); 	
			}
		}
		

		
		drawCount++; 
		if(count > 1){
			count--;
		}                        
		maxDrawCount = Math.max(maxDrawCount, count);
		
	}
	
	//https://www.acmicpc.net/problem/1926
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in); 
		
		row = sc.nextInt(); 
		col  = sc.nextInt(); 
		
		Board = new int[row][col];
		visited = new boolean[row][col]; 
		
		
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				Board[i][j] = sc.nextInt(); 
			}
		}
		
		
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				if(Board[i][j]==1 && !visited[i][j]){
					BFS(i,j); 
				}
			}
		}
		System.out.println(drawCount);
		System.out.println(maxDrawCount);
		
		
	}

}
