package codeUpbasic100;

import java.util.Scanner;

public class P095_1098_설탕과자뽑기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); 
		
		int w=sc.nextInt(); 
		int h=sc.nextInt(); 
		int stickCount=sc.nextInt(); 
		
		int[][] graph=new int[w][h]; 
		
		for(int k=0; k<stickCount; k++){
			int stickLength=sc.nextInt(); 
			int D=sc.nextInt(); 
			int x=sc.nextInt()-1; 
			int y=sc.nextInt()-1; 
			
			for(int i=0; i<graph.length; i++){
				for(int j=0; j<graph[i].length; j++){
					
					if(D==0){//가로
						
						for(int m=0; m<stickLength; m++){
							graph[x][y+m]=1; 
						}
						
					}else{//세로 
						for(int m=0; m<stickLength; m++){
							graph[x+m][y]=1; 
						}
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
