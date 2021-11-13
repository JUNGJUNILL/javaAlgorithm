package Algorithm_basic_Top10;

import java.beans.Visibility;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.border.Border;

public class BFS {

	static int[][] Board= new int[6][5];
	static boolean[][] visited =new boolean[6][5]; 
	

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
				
				if(nr<0 || nr>5 || nc<0 || nc>4)continue; 
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
		System.out.println("count="+count);
		maxDrawCount = Math.max(maxDrawCount, count);
		
	}
	
	//https://www.acmicpc.net/problem/1926
	public static void main(String[] args) {
	
		Board[0][0] = 1;
		Board[0][1] = 1;
		Board[0][2] = 0;
		Board[0][3] = 1;
		Board[0][4] = 1;

		Board[1][0] = 0;
		Board[1][1] = 1;
		Board[1][2] = 1;
		Board[1][3] = 0;
		Board[1][4] = 0;

		Board[2][0] = 0;
		Board[2][1] = 0;
		Board[2][2] = 0;
		Board[2][3] = 0;
		Board[2][4] = 0;

		Board[3][0] = 1;
		Board[3][1] = 0;
		Board[3][2] = 1;
		Board[3][3] = 1;
		Board[3][4] = 1;

		Board[4][0] = 0;
		Board[4][1] = 0;
		Board[4][2] = 1;
		Board[4][3] = 1;
		Board[4][4] = 1;

		Board[5][0] = 0;
		Board[5][1] = 0;
		Board[5][2] = 1;
		Board[5][3] = 1;
		Board[5][4] = 1;
		
		for(int i=0; i<Board.length; i++){
			for(int j=0; j<Board[i].length; j++){
				System.out.print(Board[i][j]+" ");
			}
			System.out.println();

		}
		System.out.println();
		
		for(int i=0; i<Board.length; i++){
			for(int j=0; j<Board[i].length; j++){
				if(Board[i][j]==1 && !visited[i][j]){
					System.out.println("BFS"+"("+i+","+j+")");
					BFS(i,j); 
				}
			}
		}

		System.out.println(drawCount);
		System.out.println(maxDrawCount);
		
		
	}

}
