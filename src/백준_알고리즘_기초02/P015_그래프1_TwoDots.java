package 백준_알고리즘_기초02;

//그냥 외움
public class P015_그래프1_TwoDots {
	
	static int n,m; 
	static int[][] D={{-1,0},{1,0},{0,-1},{0,1}}; 
	static char[][] game; 
	static boolean[][] visited; 
	static int[][] cnt; 
	//https://blue-boy.tistory.com/238
	static boolean DFS(int x, 
						    int y, 
						    int length, 
						    boolean[][] visited){
		
		//이것이 핵심 
		//최소한 4개가 같아야 사이클이 발생한다라는 의미이므로.. 
		if(visited[x][y]){
			return length-cnt[x][y]>=4; 
		}
		
		cnt[x][y]=length; 
		visited[x][y]=true; 
		
		for(int i=0; i<4; i++){
			int nr=x+D[i][0]; 
			int nc=y+D[i][1]; 
			
			if(nr<0 || nr>n-1 || nc<0 || nc>m-1) continue; 
			if(game[x][y]==game[nr][nc]){
				if(DFS(nr,nc,length+1,visited)){
					return true; 
				}
			}		
		}
		
		return false; 
	}

	//https://www.acmicpc.net/problem/16929
	public static void main(String[] args) {
		
		n=3;
		m=4; 
		game = new char[n][m]; 		
		game[0][0]='A';
		game[0][1]='A';
		game[0][2]='A';
		game[0][3]='A';
		
		game[1][0]='A';
		game[1][1]='B';
		game[1][2]='C';
		game[1][3]='A';
		
		game[2][0]='A';
		game[2][1]='A';
		game[2][2]='A';
		game[2][3]='A';
		
		visited = new boolean[n][m]; 
		cnt = new int[n][m];
		
		for(int i=0; i<game.length; i++){
			for(int j=0; j<game[i].length; j++){
				
				if(!visited[i][j]){
					visited=new boolean[n][m]; 

					if(DFS(i,j,1,visited)){
						System.out.println("Yes");
						return; 
					}
				}
			}
		}
		System.out.println("No");
		

	}
}
