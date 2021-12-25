package 백준_알고리즘_기초02;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P014_그래프1_나이트의이동_BFS {

	
	public static int[][] graph;
	public static boolean[][] visited; 
	static int[][] D={  {2,1},
							{2,-1},
							{-2,1},
							{-2,-1},
							
							{1,2},
							{-1,2},
							{1,-2},
							{-1,-2},
	};
	
	static class Point{
		int row, col, dist; 
		public Point(int r, int c, int d){
			this.row = r; 
			this.col = c; 
			this.dist= d; 
		}
		
	}
	static int BFS(int o1, int o2, int length, int f1, int f2){
		visited[o1][o2]=true; 
		Queue<Point> q=new LinkedList<>();
		q.add(new Point(o1,o2,0));
		int temp=0; 
		
		while(!q.isEmpty()){
			Point curr= q.poll(); 
			if(curr.row==f1 && curr.col==f2){
				temp=curr.dist;
				break; 
			}
		
			for(int i=0; i<8; i++){
				
				int nr = curr.row+D[i][0];
				int nc = curr.col+D[i][1];
				if(nr<0 || nr>length-1 || nc<0 || nc>length-1) continue; 
				if(visited[nr][nc]) continue; 

				visited[nr][nc]=true; 
				q.add(new Point(nr, nc, curr.dist+1)); 
			}
			
		}
		
		return temp; 
		
	}
	
	//https://www.acmicpc.net/problem/7562
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in); 
		int num = sc.nextInt(); 
		StringBuffer bf =new StringBuffer(); 
		for(int i=0; i<num; i++){
			int length=sc.nextInt(); 
			int row = sc.nextInt(); 
			int col = sc.nextInt(); 
			int f1 = sc.nextInt(); 
			int f2 =sc.nextInt(); 
			graph=new int[length][length]; 
			visited=new boolean[length][length]; 
			if(i==num-1){
				bf.append(BFS(row,col,length,f1,f2)); 
			}else{
				bf.append(BFS(row,col,length,f1,f2)+"\n"); 	
			}

		}
		System.out.println(bf.toString());
		

//		int row=8;
//		int col=8;
//		graph=new int[row][col]; 
//		visited=new boolean[row][col]; 
//		BFS(0,0,8,0,7); 
		/*
		 (0,0)
		 (2,1)
		 (1,3)
		 (0,5)
		 (2,6)
		 (0,7)
		 
		 */

	
		
//		for(int i=0; i<graph.length; i++){
//			for(int j=0; j<graph[i].length; j++){
//	
//				System.out.print(graph[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		
		
		
	}
}
