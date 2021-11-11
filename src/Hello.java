import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Vector;

public class Hello {

	public static void main(String[] args) {
		
		int[][] graph =new int[5][5]; 
		
		graph[0][1] = graph[1][0] =1; 
		graph[0][2] = graph[2][0] =1; 
		graph[1][3] = graph[3][1] =1; 
		graph[1][4] = graph[4][1] =1; 
		graph[2][4] = graph[4][2] =1; 
		graph[3][4] = graph[4][3] =1; 

		
		
		for(int i=0; i<graph.length; i++){
			for(int j=0; j<graph[i].length; j++){
				System.out.print(graph[i][j]+" ");
			}
			System.out.println();
		}
		
	
	
	}
}
