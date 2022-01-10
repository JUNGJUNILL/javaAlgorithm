package ����_�˰���_����02_�׷���;

import java.util.*;

public class P009_�׷���1_������ȣ���̱� {

	static int n; 
	static int[][] graph; 
	static boolean[][] visited; 
	static int[][] D ={{-1,0}, //�� 
						   {1,0},  //��
						   {0,-1}, //��
						   {0,1}}; //�� 
	
	static class Point{
		int row, col; 
		public Point(int r, int c){
			this.row=r;
			this.col =c; 
		}
	}
	
	static int DFS(int o1, int o2){
		visited[o1][o2]=true; 
		Stack<Point> stack =new Stack<>(); 
		stack.push(new Point(o1, o2)); 
		int temp=0; 
		while(!stack.isEmpty()){
			temp++; 
			Point curr=stack.pop(); 
			
			for(int i=0; i<4; i++){
				int nr=curr.row + D[i][0];
				int nc=curr.col  + D[i][1]; 
				
				//D[0][0] -1  
				//D[0][1] 0 ----��
				
				//D[1][0] 1
				//D[1][1] 0 ----��
				
				//D[2][0] 0
				//D[2][1] -1----��
				
				//D[3][0] 0
				//D[3][1] 1----��
				
				if(nr<0|| nr>n-1||nc<0||nc>n-1) continue; //�迭�� ������ ��� ��� 
				if(graph[nr][nc]==0) continue;  //1�� �ƴ� ��� 
				if(visited[nr][nc]) continue;  //�湮�� ����� ���	
				visited[nr][nc]=true; 
				stack.push(new Point(nr, nc));
				
			}
		}
		return temp; 
		
	}
	
	//https://www.acmicpc.net/problem/2667
	public static void main(String[] args) {

		n=7; 
		graph=new int[n][n]; 
		visited=new boolean[n][n];
		ArrayList<Integer> list= new ArrayList<>(); 
		graph[0][1]=1;
		graph[0][2]=1;
		graph[0][4]=1; 
			
		graph[1][1]=1;
		graph[1][2]=1;
		graph[1][4]=1;
		graph[1][6]=1;
		
		graph[2][0]=1;
		graph[2][1]=1;
		graph[2][2]=1;
		graph[2][4]=1;
		graph[2][6]=1;
		
		graph[3][4]=1;
		graph[3][5]=1;
		graph[3][6]=1;
		
		graph[4][1]=1;

		graph[5][1]=1;
		graph[5][2]=1;
		graph[5][3]=1;
		graph[5][4]=1;
		graph[5][5]=1;
		
		graph[6][1]=1;
		graph[6][2]=1;
		graph[6][3]=1;
		
		for(int i=0; i<graph.length; i++){
			for(int j=0; j<graph[i].length; j++){
				System.out.print(graph[i][j]+" ");
			}
			System.out.println();
		}
		StringBuffer bf=new StringBuffer(); 
		for(int i=0; i<graph.length; i++){
			for(int j=0; j<graph[i].length; j++){
				if(!visited[i][j]&&graph[i][j]==1){
					list.add(DFS(i,j)); 
				}
			}
			
		}
		System.out.println(list.size());
		Collections.sort(list);
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		
		
				
	}

}
