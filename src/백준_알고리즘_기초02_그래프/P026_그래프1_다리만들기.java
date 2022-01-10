package 백준_알고리즘_기초02_그래프;

import java.util.*;

class Point{
	int x, y; 
	public Point(int x, int y){
		this.x=x; 
		this.y=y; 
	}
}

public class P026_그래프1_다리만들기 {

	static int[][] D={{-1,0},{1,0},{0,-1},{0,1}};
	
	//http://codeplus.codes/dc3ddf21fff74a649925847fdba0afe4
	//https://www.acmicpc.net/problem/2146
	//단지번호붙이기 + 토마토 
	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in); 
		int n=10; 
		
		int[][] graph=new int[n][n];
		graph[0][0]=1;
		graph[0][1]=1;
		graph[0][2]=1;
		graph[0][7]=1;
		graph[0][8]=1;
		graph[0][9]=1;
		
		graph[1][0]=1;
		graph[1][1]=1;
		graph[1][2]=1;
		graph[1][3]=1;
		graph[1][2]=1;
		graph[1][8]=1;
		graph[1][9]=1;
		
		graph[2][0]=1;
		graph[2][2]=1;
		graph[2][3]=1;
		
		graph[2][8]=1;
		graph[2][9]=1;
		
		graph[3][2]=1;
		graph[3][3]=1;
		graph[3][4]=1;
		graph[3][9]=1;		
		
		graph[4][3]=1;
		graph[4][9]=1;
		
		graph[5][9]=1;
	
		graph[7][4]=1;
		graph[7][5]=1;
		
		graph[8][4]=1;
		graph[8][5]=1;
		graph[8][6]=1;
		
		int[][] d=new int[n][n];
		int[][] g=new int[n][n];
		
//		for(int i=0; i<n; i++){
//			for(int j=0; j<n; j++){
//				graph[i][j]=sc.nextInt(); 
//			}
//		}
		int cnt=0; 
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				
				if(graph[i][j]==1 && g[i][j]==0){
					Queue<Point> q=new LinkedList<>();
					g[i][j]=++cnt;
					q.add(new Point(i, j)); 
					
					while(!q.isEmpty()){
						Point curr=q.poll(); 
						int x=curr.x; 
						int y=curr.y; 
						
						for(int k=0; k<4; k++){
							int nr=x+D[k][0]; 
							int nc=y+D[k][1]; 
							
							if(nr<0 || nr>n-1 || nc<0 || nc>n-1) continue; 
							if(graph[nr][nc]!=1) continue; 
						    if(g[nr][nc]!=0) continue; 
						    
						     q.add(new Point(nr, nc));
                             g[nr][nc] = cnt;

						}
					}
				}	
			}
		}
		
		for(int i=0; i<g.length; i++){
			for(int j=0; j<g[i].length; j++){
				System.out.print(g[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		//1번 그룹에 거리 1짜리 3번 그룹이 있다.
		//두 칸이 인접했는데 그룹의 번호가 다르다면
		//그것은 다리를 건설 할 수 있다는 것으로 볼 수 있기 때문에

		//왜 d라는 배열을 하나 더 만드는 것일까?
		Queue<Point> q=new LinkedList<>(); 
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				d[i][j]=-1;
				if(graph[i][j]==1){
					q.add(new Point(i, j)); 
					d[i][j]=0; 
				}
			}
		}

		
		


		
		
		while(!q.isEmpty()){
			Point curr = q.poll(); 
			int x=curr.x; 
			int y=curr.y; 
			
			for(int k=0; k<4; k++){
				int nr = x+D[k][0]; 
				int nc = y+D[k][1]; 
			
				if(nr<0 || nr>n-1 || nc<0 || nc>n-1) continue; 
				if(d[nr][nc]==-1){
					d[nr][nc] = d[x][y]+1; 
					g[nr][nc] = g[x][y]; 
					q.add(new Point(nr, nc)); 
				}
			}
		}
		
		int ans=-1; 
		
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				
				for(int k=0; k<4; k++){
					int nr=i+D[k][0];
					int nc=j+D[k][1]; 
					
					if(nr<0 || nr>n-1 || nc<0 || nc>n-1) continue; 
				     if (g[i][j] != g[nr][nc]) {
                         if (ans == -1 || ans > d[i][j] + d[nr][nc]) {
                        	 System.out.println(i+":"+j+"="+nr+":"+nc);
                             ans = d[i][j] + d[nr][nc];
                         }
                     }
					
				}
				
			}
		}

		
		System.out.println(ans);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
