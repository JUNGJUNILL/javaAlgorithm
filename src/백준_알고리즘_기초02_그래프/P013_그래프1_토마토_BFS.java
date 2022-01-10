package 백준_알고리즘_기초02_그래프;

import java.util.LinkedList;
import java.util.Queue;

public class P013_그래프1_토마토_BFS {

	static class Point{
		int x, y, day; 
		public Point(int x, int y, int d){
			this.x=x;
			this.y=y; 
			this.day=d; 
		}
	}
	
	static int n; 
	static int m; 
	static int[][] graph;
	
	static int[][] D={{-1,0},//상
			   {1,0},  //하
			   {0,-1}, //좌
			   {0,1}}; //우
	
	//안익은 토마토가 하나라도 있으면 false 
	static boolean checkTomato(){
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				if(graph[i][j] == 0){
					return false;
				}
			}
		}
			
			return true;
		
	}
	
	static void BFS(){
		Queue<Point> q=new LinkedList<>();
		int day=0; 
		
		//토마토가 있는 좌표 찾아서 q에 넣기 
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				if(graph[i][j]==1){
					q.add(new Point(i, j, 0)); 
				}
			}
		}
		
		while(!q.isEmpty()){
			Point curr=q.poll(); 
			day = curr.day; //이거시 키 포인트이다.
			
			for(int i=0; i<4; i++){
				int nr = curr.x+D[i][0]; 
				int nc = curr.y+D[i][1]; 
				
				if(nr<0 || nr>n-1 || nc<0 || nc >m-1) continue; 
				if(graph[nr][nc]!=0) continue; 
				graph[nr][nc]=1;
				q.add(new Point(nr, nc, day+1)); 
			}
			
		}
		
		//안익은 토마토가 있으면 -1 
		if(checkTomato()){
			System.out.println(day);
		}else{
			System.out.println(-1);
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		m=6;
		n=4; 
		graph=new int[n][m]; 
		graph[3][5]=1; 
		BFS();
		
		for(int i=0; i<graph.length; i++){
			for(int j=0; j<graph[i].length; j++){
				System.out.print(graph[i][j]+ " ");
			}
			System.out.println();

		}

	}
}
