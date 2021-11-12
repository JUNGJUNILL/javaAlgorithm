package datastructure_Graph_BFS;

import java.util.LinkedList;
import java.util.Queue;

public class P003_BFS {

	
	static final int MAX_N = 10; 
	static int[][] D= {
						{-1,0}, //���� 1ĭ �̵�
						{1,0},  //�Ʒ��� 1ĭ �̵�
						{0,-1}, //�������� ��ĭ �̵�
						{0,1},  //���������� ��ĭ �̵�
	};
	static int[][]Borad = new int[MAX_N][MAX_N]; 
	static int N=5; 
	
	static class Point{
		int row, col, dist; 
		Point(int r, int c, int d){
			row = r; 
			col  =c; 
			dist =d; 
		}	
	}
	
	static int BFS(int sRow, int sCol, int dRow, int dCol){
		
		boolean[][] visited = new boolean[MAX_N][MAX_N];
		Queue<Point> q = new LinkedList<>();
		visited[sRow][sCol] = true; 
		q.add(new Point(sRow,sCol,0)); 
		
		while(!q.isEmpty()){
			
			Point curr = q.poll(); 
			
			if(curr.row == dRow && curr.col == dCol){
				return curr.dist; 
			}
			
			for(int i=0; i<4; i++){
				int nr = curr.row+D[i][0]; 
				int nc = curr.col+D[i][1]; 
				
				if(nr<0 || nr >N-1 || nc<0 || nc > N-1)continue; //�迭�� ������ ��� ���
				if(visited[nr][nc]) continue; 					   //�湮�� �����
				if(Borad[nr][nc]==1)continue;					   //���ΰ��
				
				
				visited[nr][nc] = true; 
				q.add(new Point(nr, nc, curr.dist+1)); 
			
			}
			
		}
		
		
		return -1; 
	}
	
	//BFS�� Ȱ���Ͽ� �ִܰ�θ� ���غ���.
	//https://www.youtube.com/watch?v=yQ7o1Y7X_Rg&list=PL6YHvWRMtz7CbOmh5Id4DERE5gyQC50XS&index=7&ab_channel=ezsw
	public static void main(String[] args) {
		
		Borad[0][0] =0; 
		Borad[0][1] =9; 
		Borad[0][2] =0; 
		Borad[0][3] =0; 
		Borad[0][4] =0; 
		
		Borad[1][0] =0; 
		Borad[1][1] =1; 
		Borad[1][2] =1; 
		Borad[1][3] =1; 
		Borad[1][4] =1; 
		
		Borad[2][0] =0; 
		Borad[2][1] =0; 
		Borad[2][2] =0; 
		Borad[2][3] =0; 
		Borad[2][4] =0; 
		
		Borad[3][0] =1; 
		Borad[3][1] =1; 
		Borad[3][2] =1; 
		Borad[3][3] =1; 
		Borad[3][4] =0; 
		
		Borad[4][0] =0; 
		Borad[4][1] =0; 
		Borad[4][2] =9; 
		Borad[4][3] =0; 
		Borad[4][4] =0; 
		
		for(int i=0; i<Borad.length; i++){
			for(int j=0; j<Borad[i].length; j++){
				System.out.print(Borad[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("==============");
		System.out.println(BFS(0,1,4,2));
		
		

	}

}
