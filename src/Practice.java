import java.beans.Visibility;
import java.util.*;


public class Practice {

	//https://www.acmicpc.net/source/share/9e95120c2a744876813ae5198c84993b
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in); 
		
		int N=5; 
		int M=5; 		
		int[][] graph=new int[N][N]; 
		
		for(int i=0; i<M; i++){
			int row=sc.nextInt(); 
			int col=sc.nextInt(); 
			graph[row][col]=graph[col][row]=1; 

		}
		
		for(int i=0; i<graph.length; i++){
			for(int j=0; j<graph[i].length; j++){
				System.out.print(graph[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<graph.length; i++){
			
		}
		
		
	}
}






