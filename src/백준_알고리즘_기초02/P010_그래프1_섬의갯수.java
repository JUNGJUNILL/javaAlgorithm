package ����_�˰���_����02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P010_�׷���1_���ǰ��� {

	static int[][] D = {
							{-1,0},
							//��     
							{1,0},  
							//��    
							{0,-1},
							//��
							{0,1},
							//��
							
							{-1,-1},
							//����
							{-1,1},
							//���
							{1,-1},
							//����
							{1,1},
							//�Ͽ�							
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
				
				if(nr<0|| nr>h-1 || nc<0 || nc>w-1) continue; //�׷����� ������ ��� ���
				if(graph[nr][nc]==0)continue;  //���� �ƴ� ��� 
				if(visited[nr][nc]) continue;    //�湮�� ���� ��� 
				
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
