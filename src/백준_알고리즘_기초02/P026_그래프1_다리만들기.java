package 백준_알고리즘_기초02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class P026_그래프1_다리만들기 {

	
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
	
	static class Dist{
		int row,col, dist; 
		public Dist(int r, int c, int d){
			this.row=r; 
			this.col=c; 
			this.dist=d; 
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
		array[0][0]=maxRow; 
		array[0][1]=maxCol; 
		
		return array; 
		
	}
	static int[][] graph2;
	static boolean[][] visited2; 
	static class Point2{
		int row, col; 
		public Point2(int r, int c){
			this.row = r; 
			this.col = c;
		}
	}
	
	static void BFS2(int o1, int o2, int temp){
		visited2[o1][o2]=true; 
		Queue<Point2> q=new LinkedList<>(); 
		q.add(new Point2(o1, o2)); 

		while(!q.isEmpty()){
			Point2 curr = q.poll(); 
			graph2[curr.row][curr.col]=temp; 
			
			for(int i=0; i<4; i++){
				int nr = curr.row + D[i][0]; 
				int nc = curr.col + D[i][1]; 
				
				if(nr<0 || nr>v-1 || nc<0 || nc>v-1) continue; 
				if(visited2[nr][nc]) continue; 
				if(graph2[nr][nc]==0) continue;
				
				visited2[nr][nc]=true; 
				q.add(new Point2(nr, nc)); 
				
			}
		}

		
	}
	
	//http://codeplus.codes/dc3ddf21fff74a649925847fdba0afe4
	//https://www.acmicpc.net/problem/2146
	public static void main(String[] args) {

		v=10; 
		graph=new int[v][v]; 
		visited=new boolean[v][v]; 
		
		graph2=new int[v][v]; 
		visited2=new boolean[v][v]; 
		
		graph[0][0]=1;
		graph[0][1]=1;
		graph[0][2]=1;
		graph[0][7]=1;
		graph[0][8]=1;
		graph[0][9]=1;
		
		graph[1][0]=1;
		graph[1][1]=1;
		graph[1][2]=1;
		graph[1][3]=1;
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
		
		
		
		graph2[0][0]=1;
		graph2[0][1]=1;
		graph2[0][2]=1;
		graph2[0][7]=1;
		graph2[0][8]=1;
		graph2[0][9]=1;
		
		graph2[1][0]=1;
		graph2[1][1]=1;
		graph2[1][2]=1;
		graph2[1][3]=1;
		graph2[1][2]=1;
		graph2[1][8]=1;
		graph2[1][9]=1;
		
		graph2[2][0]=1;
		graph2[2][2]=1;
		graph2[2][3]=1;
		
		graph2[2][8]=1;
		graph2[2][9]=1;
		
		graph2[3][2]=1;
		graph2[3][3]=1;
		graph2[3][4]=1;
		graph2[3][9]=1;		
		
		graph2[4][3]=1;
		graph2[4][9]=1;
		
		graph2[5][9]=1;
	
		graph2[7][4]=1;
		graph2[7][5]=1;
		
		graph2[8][4]=1;
		graph2[8][5]=1;
		graph2[8][6]=1;
		
		
		for(int i=0; i<graph.length; i++){
			for(int j=0; j<graph[i].length; j++){
				System.out.print(graph[i][j]+" ");
			}
			System.out.println();
		}
		
		int[][] arrayList = BFS(0,0); 
		System.out.println("arrayList[0][0]="+arrayList[0][0]);
		System.out.println("arrayList[0][1]="+arrayList[0][1]);
		
		int maxRow = arrayList[0][0];
		int maxCol  = arrayList[0][1];
		//maxRow = (4,3)
		//maxCol  =  (3,4)
		int temp=0; 
		for(int i=0; i<graph2.length; i++){
			for(int j=0; j<graph2[i].length; j++){
				if(!visited2[i][j] && graph2[i][j]==1){
		
				temp++; 
				BFS2(i,j,temp); 
				
				}
			}
			System.out.println();
		}
		

		
	
		for(int i=0; i<graph2.length; i++){
			for(int j=0; j<graph2[i].length; j++){
				if(graph2[i][j]==1){
					if(maxRow==i){
						System.out.println("("+i+","+j+")");
					}
					if(maxCol==j){
						System.out.println("("+i+","+j+")");
						
					}
				}
				System.out.print(graph2[i][j]+" ");
			}
			System.out.println();
		}
//		
//		for(int i : list){
//			System.out.println(i);
//		}

		
	}
}
