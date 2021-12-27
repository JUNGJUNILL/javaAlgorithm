package ����_�˰���_����02;

public class P016_�׷���1_TwoDots_DFS {
	
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
			
			//�ٽ��ڵ�
			if(game[x][y]==game[nr][nc]){
				if(!memo[nr][nc]){
					
					memo[nr][nc]=true;
					if(DFS(nr,nc,count+1)) return true; 
				
			
				}else{
					//������ ��ȸ����...
					//ù��°�� ������ ���� �������� ������ ���� ���ƾ� �Ѵ�.
					//���õ� ������ ������ 4�� �̻��̾�� �Ѵ�.
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
				System.out.println("��� ��ȸ�ϴ°ų�"+firstX+" : "+firstY);
				if(DFS(i, j, 1)){
					System.out.println("Yes");
					return; 
				}
			}
		}
		System.out.println("No");
		
		
	}
}
