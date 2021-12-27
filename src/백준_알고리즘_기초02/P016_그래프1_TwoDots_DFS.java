package 백준_알고리즘_기초02;

public class P016_그래프1_TwoDots_DFS {
	
	static int n,m; 
	static char[][] game; 
	static boolean[][] memo; 
	static int[][] D={{-1,0},{1,0},{0,-1},{0,1}}; 
	static int firstX, firstY; 
	
	static boolean DFS(int x, int y, int count){
		memo[x][y]=true; 

		for(int i=0; i<4; i++){
			
			int nr = x+D[i][0]; 
			int nc = y+D[i][1]; 
			
			if(nr<0 || nr>n-1 || nc<0 || nc>m-1) continue; 
			
			//핵심코드
			if(game[x][y]==game[nr][nc]){
				if(!memo[nr][nc]){
					
					memo[nr][nc]=true;
					if(DFS(nr,nc,count+1)) return true; 
				
			
				}else{
					//마지막 순회에서...
					//첫번째로 선택한 점과 마지막에 선택한 점이 같아야 한다.
					//선택된 점들의 개수가 4개 이상이어야 한다.
					if(count>=4 && firstX==nr && firstY==nc) return true;
				}
			}
			
			
		}
		
		
		return false; 
	}
	
	
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
		
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				memo=new boolean[n][m]; 
				firstX = i; 
				firstY = j;
				System.out.println("몇번 순회하는거냐"+firstX+" : "+firstY);
				if(DFS(i, j, 1)){
					System.out.println("Yes");
					return; 
				}
			}
		}
		System.out.println("No");
		
		
	}
}
