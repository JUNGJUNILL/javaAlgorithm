package codeUpbasic100;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P096_1099_성실한개미 {
	
	static int[][] graph; 

	
	static class Point{
		int row, col; 
		public Point(int r, int c){
			this.row=r;
			this.col=c; 
		}
	}
	
	static void BFS(int o1, int o2,int[][] graph){
	
		Queue<Point> q=new LinkedList<>(); 
		q.add(new Point(o1, o2)); 
		
		while(!q.isEmpty()){//zz
			Point curr=q.poll(); 
			
			if(graph[curr.row][curr.col]==2){
				graph[curr.row][curr.col]=9; 
				break;
			}
			
			graph[curr.row][curr.col]=9; 
			int nr=curr.row;
			int nc=curr.col+1; 
		
		
				
			if(graph[nr][nc]==0){		
				
				q.add(new Point(nr, nc)); 
				
			}else{
				q.add(new Point(nr+1, nc-1));
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in); 
		
		graph=new int[10][10]; 
		
		for(int i=0; i<graph.length; i++){
			for(int j=0; j<graph[i].length; j++){
				graph[i][j]=sc.nextInt(); 
			}
		}
		
//		graph[0][0]=1;
//		graph[0][1]=1;
//		graph[0][2]=1;
//		graph[0][3]=1;
//		graph[0][4]=1;
//		graph[0][5]=1;
//		graph[0][6]=1;
//		graph[0][7]=1;
//		graph[0][8]=1;
//		graph[0][9]=1;
//		
//		graph[1][0]=1;
//		graph[1][3]=1;
//		graph[1][9]=1;
//		
//		graph[2][0]=1;
//		graph[2][3]=1;
//		graph[2][4]=1;
//		graph[2][5]=1;
//		graph[2][9]=1;
//		
//		graph[3][0]=1;
//		graph[3][7]=1;
//		graph[3][9]=1;
//		
//		graph[4][0]=1;
//		graph[4][7]=1;
//		graph[4][9]=1;
//		
//		graph[5][0]=1;
//		graph[5][5]=1;
//		graph[5][7]=1;
//		graph[5][9]=1;
//		
//		graph[6][0]=1;
//		graph[6][5]=1;
//		graph[6][6]=2;
//		graph[6][7]=1;
//		graph[6][9]=1;
//		
//		graph[7][0]=1;
//		graph[7][5]=1;
//		graph[7][9]=1;
//		
//		graph[8][0]=1;
//		graph[8][9]=1;
//		
//		graph[9][0]=1;
//		graph[9][1]=1;
//		graph[9][2]=1;
//		graph[9][3]=1;
//		graph[9][4]=1;
//		graph[9][5]=1;
//		graph[9][6]=1;
//		graph[9][7]=1;
//		graph[9][8]=1;
//		graph[9][9]=1;
//		
		
		
		BFS(1,1,graph);
		for(int i=0; i<graph.length; i++){
			for(int j=0; j<graph[i].length; j++){
				System.out.print(graph[i][j]+" ");
			}
			System.out.println();
		}
	}

}
