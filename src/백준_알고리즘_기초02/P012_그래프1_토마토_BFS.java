package ����_�˰���_����02;

import java.util.*;



class Pair{
	
	int x, y; 
	public Pair(int x, int y){
		this.x=x; 
		this.y=y; 
	}
}
public class P012_�׷���1_�丶��_BFS {
	

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
		
		//�迭�� �ϳ� �� ���� 
		//����� ������ �ƿ� ���� ���Ͽ���. 
		int[][] dist=new int[n][m]; 
		
		Queue<Pair> q=new LinkedList<Pair>(); 	
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				//a[i][j] = sc.nextInt(); 
				dist[i][j]=-1; 
				
				//�̰� �������߾� 
				//���� �丶���� ��ġ�� ã�Ƽ� q�� �ִ´ٴ�
				//���� ��ü�� ���� ���ߴ�.
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
