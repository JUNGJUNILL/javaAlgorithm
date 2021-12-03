import java.beans.Visibility;
import java.util.*;

import com.sun.prism.paint.Gradient;


public class Practice {
	
	static int solution(int n, int[][] computers){
		
		int answer=0; 
		boolean[] visited=new boolean[computers.length]; 
		
		for(int i=0; i<n; i++){
			if(!visited[i]){
				answer++;
				DFS(i,visited,computers); 
			}
		}
		return answer; 
	}
	
	static void DFS(int n, boolean[] visited, int[][] computers){
		visited[n]=true; 
		
		for(int i=0; i<computers.length; i++){
			if(!visited[i] && computers[n][i]==1){
				DFS(i,visited,computers);
			}
		}
		
		
	}

	public static void main(String[] args) {
		
		int[][] computers01={
								 {1,1,0},
							     {1,1,0},
							     {0,0,1}}; //return 2

		 
		
		
		int[][] computer02={
								{1,1,0},
								{1,1,1},
								{0,1,1}}; //return 1

		System.out.println(solution(3,computers01));
		System.out.println(solution(3,computer02));
		
		
	}
}






