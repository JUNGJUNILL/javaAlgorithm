package datastructure_Graph_BFS;

import java.util.*;


public class P004_BFS_백준그림 {
	
	static int[][] Board= new int[6][5];
	static boolean[][] visited =new boolean[6][5];
	
	static int[][] D ={
			{-1,0},  //위로 한칸(상)
			{1,0},   //아래로 한칸(하)
			{0,-1},  //왼쪽 한칸 (좌)
			{0,1},   //오른쪽 한칸(우)  를 하는 로직이다.
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
	
	static void BFS(int o1 , int o2){
		
		
		Queue<Point> q = new LinkedList<>(); 
		q.add(new Point(o1, o2)); 
		int count=0; 
		
		while(!q.isEmpty()){
			
			Point curr = q.poll(); 
			visited[curr.row][curr.col]=true; 
			count++; 
			
			
			//해당 노드를 상하좌우 이동시킨다.
			for(int i=0; i<4; i++){
				int nr = curr.row + D[i][0]; 
				int nc =curr.col  + D[i][1];
				
				if(nr<0 || nr>5 || nc<0 ||nc>4)continue; //배열의 범위를 벗어난 경우 
				if(visited[nr][nc])continue;                   //방문한 노드인 경우 
				if(Board[nr][nc]==0)continue;              //그래프의 노드가 0인 경우
				
				visited[nr][nc]=true; 
				q.add(new Point(nr, nc)); 
			}
		}
		
		drawCount++; 
		maxDrawCount = Math.max( maxDrawCount,count); 
	
	}
	/*
	STACK : 
	curr : Point(0,1), count++(1)
	visited[0][1]=true 
	
	for 4
	0
	0+D[0][0](-1) = nr= -1  상
	1+D[0][1](0) = nc =0
	case 1 continue 

	1
	0+D[1][0]=1 = nr = 1 하
	1+D[1][1]=1 = nc = 2
	case 3 continue

	2
	0+D[2][0]=0 = nr = 0 좌
	1+D[2][1]=-1 = nc = 0
	case 3 continue
	
	3
	0+D[3][0]=0 = nr = 0 우
	1+D[3][1]=1 = nc = 2
	case out
	visited[0,2]=true
	STACK : Point(1,1), Point(0,2) 
	
	
	STACK :
	curr : Point(0,2), count(2)
	for 4
	0
	0+D[0][0](-1) = nr = -1 상
	2+D[0][1](1)  = nr = 2
	case1 continue 
	
	1
	0+D[1][0]=1 = nr = 1 하
	2+D[1][1]=0 = nc = 2 
	case 3 continue 
	
	2
	0+D[2][0]=0 = nr = 0 좌
	2+D[2][1]=-1 = nc = 1
	case 2 continue 
	
	3
	0+D[3][0]=0 = nr = 0 우 
	2+D[3][1]=1 = nc = 3
	case 3 continue
	
	STACK is empty end of BFS
	
	*/
	

	
	
	
	public static void main(String[] args) throws Exception{
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
;

		
	}
}

