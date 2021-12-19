package 백준_알고리즘_기초02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P010_그래프1_섬의갯수 {

	static int[][] D = {
							{-1,0},
							//상     
							{1,0},  
							//하    
							{0,-1},
							//좌
							{0,1},
							//우
							
							{-1,-1},
							//상좌
							{-1,1},
							//상우
							{1,-1},
							//하좌
							{1,1},
							//하우							
						};
	static int[][] graph;
	static boolean[][] visited; 
	
	static class Point{
		int r, c; 		
		public Point(int r, int c){
			this.r=r; 
			this.c=c; 
		}
		
	}
	static int BFS(int o1, int o2, int w,int h){
		visited[o1][o2]=true; 
		Queue<Point> q=new LinkedList<Point>(); 
		q.add(new Point(o1, o2)); 
		int temp=0;
		while(!q.isEmpty()){
			Point curr=q.poll(); 
			temp++;
			for(int i=0; i<8; i++){
				int nr = curr.r + D[i][0]; 
				int nc = curr.c+ D[i][1]; 
				
				if(nr<0|| nr>h-1 || nc<0 || nc>w-1) continue; //그래프의 범위를 벗어난 경우
				if(graph[nr][nc]==0)continue;  //섬이 아닌 경우 
				if(visited[nr][nc]) continue;    //방문한 곳인 경우 
				
				visited[nr][nc]=true; 
				q.add(new Point(nr,nc)); 
			}
			
		}
		
		return temp; 
		
	}


	//https://www.acmicpc.net/problem/4963
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in); 

		while(true){
			int w=sc.nextInt();
			int h=sc.nextInt(); 
			if(h==0 && w==0){
				break;
			}
			graph=new int[h][w]; 
			visited=new boolean[h][w]; 
			
			for(int i=0; i<h; i++){
				for(int j=0; j<w; j++){
					graph[i][j]=sc.nextInt(); 
				}
			}
			ArrayList<Integer> list=new ArrayList<>(); 
			for(int i=0; i<graph.length; i++){
				for(int j=0; j<graph[i].length; j++){
			
					if(!visited[i][j] && graph[i][j]==1){
						 
						list.add(BFS(i,j,w,h)); 
					}
					
				}
			}
			System.out.println(list.size());
		}
	}

}
