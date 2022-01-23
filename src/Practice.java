
import java.util.*;


public class Practice {

	static int n; 
	static int[][] graph; 
	static boolean[][] visited; 
	static int[][] D={
			{-1,0},
			{1,0},
			{0,-1},
			{0,1}
			};
	
	static class Point{
		int row, col; 
		public Point(int row, int col){
			this.row=row; 
			this.col=col; 
		}
	}
	
	static int BFS(int o1, int o2){
		visited[o1][o2]=true; 
		Queue<Point> q=new LinkedList<>(); 
		q.add(new Point(o1, o2)); 
		int temp=0; 
		while(!q.isEmpty()){
			Point curr=q.poll(); 
			temp++; 
			for(int i=0; i<4; i++){
				
				int nr = curr.row + D[i][0]; 
				int nc = curr.col + D[i][1]; 
				
				if(nr<0 || nr>n-1 || nc<0 || nc>n-1) continue; 
				if(visited[nr][nc])  continue; 
				if(graph[nr][nc]==0)  continue; 
				
				visited[nr][nc]=true; 
				q.add(new Point(nr, nc)); 
					
				
				
			}
		}
		return temp; 
	}
	
	public static void main(String[] args) {
	
		Scanner sc =new Scanner(System.in); 
		n= sc.nextInt(); 
		graph=new int[n][n]; 
		visited=new boolean[n][n]; 
		
		for(int i=0; i<graph.length; i++){
			String next=sc.next(); 
			for(int j=0; j<graph[i].length; j++){
				graph[i][j]=next.charAt(0)-'0'; 
			}
		}
		
		
		ArrayList<Integer> list =new ArrayList<>(); 
		
		for(int i=0; i<graph.length; i++){
			
			for(int j=0; j<graph[i].length; j++){
				if(!visited[i][j] && graph[i][j]==1){
					list.add(BFS(i,j)); 
				}
			}
		}
		
		Collections.sort(list);
		for(int i : list){
			System.out.println(i);
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}