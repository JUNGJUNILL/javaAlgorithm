package codeUpbasic100;

import java.util.Scanner;

public class P094_1097_바둑알십자뒤집기_어렵다 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in); 
		int[][] graph=new int[19][19]; 
		
	
		
		for(int i=0; i<graph.length; i++){
			for(int j=0; j<graph[i].length; j++){
				graph[i][j]=sc.nextInt(); 
			}
		}
		int num =sc.nextInt(); 
	
		for(int k=0; k<num; k++){
			
			int x=sc.nextInt()-1;
			int y=sc.nextInt()-1; 
				
			for(int i=0; i<graph.length; i++){
				for(int j=0; j<graph[i].length; j++){
					
					if(graph[x][i]==0){
						graph[x][i]=1;
					}else{
						graph[x][i]=0;
					}
					
					if(graph[j][y]==0){
						graph[j][y]=1;
					}else{
						graph[j][y]=0;
					}
					
	
				}
			}
		
		
		}
		
		
		for(int i=0; i<graph.length; i++){
			for(int j=0; j<graph[i].length; j++){
				System.out.print(graph[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
	}
}
