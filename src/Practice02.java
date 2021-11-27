import java.util.*;

public class Practice02 {
	
	static int ROW; 
	static int COL; 
	static int[][] graph; 
	static boolean[][] visited; 
	static int[][] D={
			{-1,0},
			{1,0},
			{0,-1},
			{0,1}
	};
	static int[][] point;
	
	static int BFS(int o1, int o2, int dr, int dc){
		visited[o1][o2]=true; 
		Queue<int[][]> q =new LinkedList<int[][]>(); 
		point=new int[1][3]; 
		point[0][0]=o1; 
		point[0][1]=o2; 
		point[0][2]=1;
		q.add(point); 
		
		while(!q.isEmpty()){
			int[][] curr = q.poll(); 
			if(curr[0][0]-1 == dr-1 && curr[0][1]-1 == dc-1){
				return curr[0][2]; 
			}
			
			for(int i=0; i<4; i++){
				int nr = curr[0][0]+D[i][0]; 
				int nc = curr[0][1]+D[i][1]; 
				
				if(nr<0|| nr>ROW-1 || nc<0 || nc>COL-1) continue; 
				if(visited[nr][nc]) continue; 
				if(graph[nr][nc]==0) continue; 
				visited[nr][nc]=true; 
				point=new int[1][3]; 
				point[0][0]=nr;
				point[0][1]=nc;
				point[0][2]=curr[0][2]+1; 
				q.add(point); 
				
			}
		}
		
		
		
		
		return -1; 
	}
	
	
	
	public static void main(String[] args) {

	Scanner sc =new Scanner(System.in); 
		
		ROW=sc.nextInt(); 
		COL=sc.nextInt(); 
		graph=new int[ROW][COL]; 
		visited=new boolean[ROW][COL]; 

		for(int i=0; i<ROW; i++){
			String input = sc.next(); 
			for(int j=0; j<COL; j++){
				graph[i][j] = input.charAt(j)-'0';
			}
		}
		
		System.out.println(BFS(0,0,ROW-1,COL-1));
		
		
	}
}















