package datastructure_Graph_BFS;

import java.util.Scanner;
import java.util.Stack;

public class P006_백준_바이러스 {

	static int V=7; 
	static int E=6; 
	static int[][] Board; 
	static boolean[] visited; 
	
	static int BFS(int x,int V){
		visited[x]=true; 
		Stack<Integer> stack =new Stack<>(); 
		int count=-1; 
		stack.push(x); 
		
		while(!stack.isEmpty()){
			int curr = stack.pop(); 
			count++; 
			
			for(int i=0; i<V; i++){
				if(!visited[i] && Board[curr][i]==1){
					visited[i]=true; 
					stack.push(i); 
				}
			}
		}
		
		return count; 
	}
	
	static void DFS(int x,int V){
		
	}

	//바이러스 
	//https://www.acmicpc.net/problem/2606
	public static void main(String[] args) {
		

//		Scanner sc =new Scanner(System.in); 
//		V= sc.nextInt(); 
//		E= sc.nextInt(); 
//		Board=new int[V][V]; 
//		visited=new boolean[V]; 
//		
//		for(int i=0; i<E; i++){
//			int row = sc.nextInt(); 
//			int col  = sc.nextInt(); 
//			
//			Board[row-1][col-1]=Board[col-1][row-1]=1; 	
//		}	
		
		Board =new int[7][7]; 
		visited=new boolean[7];
		
		Board[0][1]=Board[1][0]=1;
		Board[1][2]=Board[2][1]=1;
		Board[0][4]=Board[4][0]=1;
		
		Board[4][1]=Board[1][4]=1;
		Board[4][5]=Board[5][4]=1;
		Board[3][6]=Board[6][3]=1;
		
		for(int i=0; i<Board.length; i++){
			for(int j=0; j<Board[i].length; j++){
				System.out.print(Board[i][j]+ " ");
			}
			System.out.println();
		}
		
		
		System.out.println(BFS(0,V));

	}
}
