package datastructure_완전탐색_백트레킹;

import java.util.Scanner;

public class P020_백준_카잉달력 {
	
	static int func(int M, int N, int x, int y){
		int zeroX=0; 
		int zeroY=0; 
		int temp=0; 
		int temp02=0; 
		int temp03=0; 
		
		//마지막 해를 구한 후에...
		while(true){
			
			if(zeroX<M){
				zeroX=zeroX+1;
			}else{
				zeroX=1; 
			}
			
			if(zeroY<N){
				zeroY=zeroY+1;
			}else{
				zeroY=1; 
			}
			temp++;
			
			if(zeroX==x && zeroY==y){
				break; 
			}
			
			if(zeroX==M && zeroY==N){
				temp=-1;
				break; 
			}	
		}
	
		
		return temp;
		
		
	}

	

	//https://www.acmicpc.net/problem/6064
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in); 
		int num=sc.nextInt(); 
		int[][] graph=new int[num][4]; 
		
		for(int i=0; i<graph.length; i++){
			for(int j=0; j<graph[i].length; j++){
				graph[i][j]=sc.nextInt(); 
			}
		}
		
		for(int i=0; i<num; i++){
			System.out.println(func(graph[i][0],graph[i][1],graph[i][2],graph[i][3]));
		}
	}

}
