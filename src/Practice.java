
import java.util.*;

class Pair{
	
	int x, y; 
	public Pair(int x, int y){
		this.x=x; 
		this.y=y; 
	}
	
}
public class Practice {
	
	
	static int[][] D={{-1,0},{1,0},{0,-1},{0,1}}; 

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in); 
		
		int m=sc.nextInt();
		int n=sc.nextInt();
		int[][] a=new int[n][m]; 
		int[][] dist = new int[n][m]; 
		
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				a[i][j]=sc.nextInt(); 
			}
		}
	
		
		Queue<Pair> q=new LinkedList<>(); 
		
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				dist[i][j]=-1; 
				
				if(a[i][j]==1){
					q.add(new Pair(i, j)); 
					dist[i][j]=0; 
				}
			}
		}
		
		while(!q.isEmpty()){
			
			Pair curr = q.poll(); 
			int x = curr.x;
			int y = curr.y; 
			
			for(int i=0; i<4; i++){
				int nr = x+D[i][0]; 
				int nc = y+D[i][1]; 
				
				if(nr<0 || nr>n-1 || nc<0 || nc>m-1) continue; 
				if(a[nr][nc]!=0) continue; 
				if(dist[nr][nc]!=-1) continue; 
				
				q.add(new Pair(nr, nc)); 
				dist[nr][nc] = dist[x][y]+1; 
			
				
			}
		}
		

		
		int ans=0; 
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
			
				if(ans < dist[i][j]){
					ans = dist[i][j]; 
				}	
			}
		}
		
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){			
				if(a[i][j]==0 && dist[i][j]==-1){
					ans=-1; 
				}
			}
		}
		System.out.println(ans);
		
	
		
				
		
	}
}




