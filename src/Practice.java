import java.util.*;


public class Practice {
	
	public static int MAX_N = 5; 
	public static int[][] graph =new int[MAX_N][MAX_N];

	
	public static void main(String[] args) throws Exception{
		
		
		graph[0][1] = graph[1][0] =1; 
		graph[0][2] = graph[2][0] =1; 
		graph[1][3] = graph[3][1] =1; 
		graph[1][4] = graph[4][1] =1; 
		graph[2][4] = graph[4][2] =1; 
		graph[3][4] = graph[4][3] =1; 
	
		System.out.println("그래프의 모양");
		for(int i=0; i<graph.length; i++){
			for(int j=0; j<graph[i].length; j++){
				System.out.print(graph[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("====================");
		
		
	}
}

