
import java.util.*;


public class Practice02 {	

	static int num; 
	static int[][] graph; 
	static boolean[][] visited; 
	static int[][] D ={{-1,0},{1,0},{0,-1},{0,1}}; 
	static class Point{
		int row, col; 
		public Point(int r, int c){
			this.row=r; 
			this.col =c; 
		}
	}
	
	static int BFS(int o1, int o2){
		visited[o1][o2]=true; 
		Queue<Point> q =new LinkedList<>(); 
		q.add(new Point(o1, o2)); 
		int count=0; 
		
		while(!q.isEmpty()){
			Point curr = q.poll(); 
			count++; 
			
			for(int i=0; i<4; i++){
				int nr = curr.row + D[i][0]; 
				int nc = curr.col + D[i][1]; 
				
				if(nr<0 || nr>num-1 || nc<0 || nc>num-1) continue; 
				if(visited[nr][nc]) continue; 
				if(graph[nr][nc]==0) continue; 
				
				visited[nr][nc]=true; 
				q.add(new Point(nr,nc));
			}
		}
			return count; 
	
	}
	
	public static void main(String[] args) throws Exception {

		Scanner sc =new Scanner(System.in); 
		num=sc.nextInt();
		graph=new int[num][num]; 
		visited=new boolean[num][num]; 
		for(int i=0; i<num; i++){
			String input = sc.next(); 
			for(int j=0; j<num; j++){
				graph[i][j]=input.charAt(j)-'0'; 
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
		System.out.println(list.size());
		for(int i : list){
			System.out.println(i);
		}

	}
}