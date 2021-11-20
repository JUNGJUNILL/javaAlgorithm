package datastructure_Graph_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P007_백준_미로탐색 {
	

	static int ROW; 
	static int COL;
	static int[][] D ={{-1,0},{1,0},{0,-1},{0,1}}; 
	static int[][] Board;
	static boolean[][] visited; 
	
	static class Point{
		int row, col ,dist; 
		public Point(int r, int c,int d){
			this.row = r; 
			this.col = c; 
			this.dist = d; 
		}
	}
	
	static int BFS(int o1, int o2, int dr, int dc){
		visited[o1][o2]=true; 
		Queue<Point> q =new LinkedList<>(); 
		q.add(new Point(o1, o2,1)); 
		
		while(!q.isEmpty()){
			Point curr = q.poll(); 
			if(curr.row-1==dr-1 && curr.col-1== dc-1){
				return curr.dist;
			}
			
			for(int i=0; i<4; i++){
				int nr = curr.row + D[i][0]; 
				int nc = curr.col + D[i][1]; 
				
				if(nr<0 || nr>ROW-1 || nc<0 || nc>COL-1) continue; 
				if(visited[nr][nc]) continue; 
				if(Board[nr][nc]==0)continue; 
				
				q.add(new Point(nr, nc, curr.dist+1)); 
				visited[nr][nc]=true;
			}
		}
		return -1;
	}

	//https://www.acmicpc.net/problem/2178
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		ROW= sc.nextInt(); 
		COL =sc.nextInt(); 
		Board=new int[ROW][COL]; 
		visited=new boolean[ROW][COL]; 
		
		for(int i=0; i<ROW; i++){
			String input = sc.next(); 
			for(int j=0; j<COL; j++){
				Board[i][j] = input.charAt(j)-'0';
			}
		}
		System.out.println();
		for(int i=0; i<ROW; i++){
			for(int j=0; j<COL; j++){
				System.out.print(Board[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println(BFS(0,0,ROW-1,COL-1));

	}

}
