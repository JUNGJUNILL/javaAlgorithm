import java.util.LinkedList;
import java.util.Queue;

public class Practice03 {
	
	static int[][] Board= new int[6][5];
	static boolean[][] visited =new boolean[6][5];
	
	static int[][] D ={
			{-1,0},  //À§·Î ÇÑÄ­(»ó)
			{1,0},   //¾Æ·¡·Î ÇÑÄ­(ÇÏ)
			{0,-1},  //¿ÞÂÊ ÇÑÄ­ (ÁÂ)
			{0,1},   //¿À¸¥ÂÊ ÇÑÄ­(¿ì)  ¸¦ ÇÏ´Â ·ÎÁ÷ÀÌ´Ù.
	};
	
	static class Point{
		
		int row, col; 
		public Point(int r, int c){
			this.row=r; 
			this.col=c;
		}
	}
	
	static void BFS(int o1, int o2){
		Queue<Point> q=new LinkedList<>(); 
		q.add(new Point(o1, o2)); 
		int count=0; 
		
		while(!q.isEmpty()){
			Point curr=q.poll(); 
			visited[curr.row][curr.col] = true; 
			count++; 
			
			for(int i=0; i<4; i++){
				int nr = curr.row + D[i][0];
				int nc = curr.col + D[i][1]; 
				
				if(nr<0 || nr >5 || nc <0 || nc >4) continue; 
				if(visited[nr][nc]) continue; 
				if(Board[nr][nc]==0) continue; 
				
				visited[nr][nc]=true; 
				q.add(new Point(nr, nc)); 
				
			}
			
		}
		
	}
	

	public static void main(String[] args) {
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

	}

}
