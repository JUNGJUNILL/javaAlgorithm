package 백준_알고리즘_기초02_그래프;
import java.util.*;


public class P017_그래프1_TwoDots_DFS {
    
        static char[][] a; 
        static int[][] dist;
        static boolean[][] check;
        static int n, m; 
        static int[][] D={{-1,0},{1,0},{0,-1},{0,1}};
    
        static boolean DFS(int x, int y, int cnt, char color){
            
            if(check[x][y]){
                 return cnt-dist[x][y]>=4; 
            }
            check[x][y]=true;
            dist[x][y]=cnt; 
            
            for(int i=0; i<4; i++){
                int nr = x+D[i][0];
                int nc = y+D[i][1];
                
                if(nr<0 || nr>n-1 || nc<0 || nc>m-1) continue;
                if(a[x][y]==color){
                    if(DFS(nr,nc,cnt+1,color))return true;
                }
                
            }
            
            return false; 
        }
    	
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            n=sc.nextInt();
            m=sc.nextInt(); 
            a=new char[n][m];
            check=new boolean[n][m]; 
            dist=new int[n][m];
            
         for (int i=0; i<n; i++) {
            a[i] = sc.next().toCharArray();
        }
            
            for(int i=0; i<a.length; i++){
                for(int j=0; j<a[i].length; j++){
                	
                	if(!check[i][j]){
                		 if(DFS(i,j,1,a[i][j])){
                            System.out.println("Yes");
        					return;
                        }
                	}
                   
                }
            }
            		System.out.println("No");

            
        }
}