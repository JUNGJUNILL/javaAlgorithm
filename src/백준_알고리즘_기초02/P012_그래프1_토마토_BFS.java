package 백준_알고리즘_기초02;

import java.util.*;



class Pair{
	
	int x, y; 
	public Pair(int x, int y){
		this.x=x; 
		this.y=y; 
	}
}
public class P012_그래프1_토마토_BFS {
	

	static int[][] D ={{-1,0},
						{1,0},
						{0,-1},
						{0,1}};
	
	//https://www.acmicpc.net/problem/7576
	public static void main(String[] args) {

//		Scanner sc=new Scanner(System.in); 
//		int m=sc.nextInt(); 
//		int n=sc.nextInt(); 
		int m=6;
		int n=4; 
		
		int[][] a=new int[n][m]; 
		a[3][5]=1;
		
		//배열을 하나 더 만들어서 
		//계산할 생각도 아예 하지 못하였다. 
		int[][] dist=new int[n][m]; 
		
		Queue<Pair> q=new LinkedList<Pair>(); 	
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				//a[i][j] = sc.nextInt(); 
				dist[i][j]=-1; 
				
				//이걸 생각못했어 
				//익은 토마토의 위치를 찾아서 q에 넣는다는
				//생각 자체를 하지 못했다.
				if(a[i][j]==1){
					q.add(new Pair(i, j)); 
					dist[i][j] = 0; 
				}
			}
		}

		while(!q.isEmpty()){
			
			Pair curr=q.poll(); 
			int x = curr.x; 
			int y = curr.y; 
			//System.out.println("("+x+","+y+")");
			
			for(int i=0; i<4; i++){
				int nr = x+D[i][0]; 
				int nc= y+D[i][1]; 
				
				
				if(nr<0 || nr>n-1 || nc<0 || nc>m-1) continue; 
				
				if(a[nr][nc]!=0) continue; 
				if(dist[nr][nc]!=-1) continue; 
				
				q.add(new Pair(nr, nc)); 
				dist[nr][nc] = dist[x][y]+1; 
				
				
				
			}

		}
		System.out.println();

		for(int i=0; i<n; i++){
		for(int j=0; j<m; j++){
		
			System.out.print(dist[i][j]+" ");
		}
		System.out.println();
	}
		
        int ans = 0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if (ans < dist[i][j]) {
                    ans = dist[i][j];
                }
            }
        }
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if (a[i][j] == 0 && dist[i][j] == -1) {
                    ans = -1;
                }
            }
        }
        System.out.println(ans);
		
		
		
	}
}
