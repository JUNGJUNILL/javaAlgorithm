import java.beans.Visibility;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

import Algorithm_basic_Top10.DFS;

public class Hello {
	
	static char[][] board; 
	static int N=3; 
	static int max=0; 
	
	static int arrCheck(){
		
		//���ΰ˻� 
		for(int i=0; i<N; i++){
			int count=1; 
			for(int j=0; j<N-1; j++){
				if(board[i][j]==board[i][j+1]){
					count++;  
				}else{
					count=1; 
				}
				max=Math.max(max, count); 
			}
		}
		
		//���ΰ˻�
		for(int i=0; i<N; i++){
			int count=1; 
			for(int j=0; j<N-1; j++){
				if(board[j][i]==board[j+1][i]){
					count++; 
				}else{
					count=1; 
				}
				max = Math.max(max, count); 
			}
		}
		
		return max; 
	}

	public static void main(String[] args) {

		board=new char[N][N]; 
		board[0][0]='C'; 
		board[0][1]='C';
		board[0][2]='P'; 
		
		board[1][0]='C'; 
		board[1][1]='C';
		board[1][2]='P'; 
		
		board[2][0]='P'; 
		board[2][1]='P';
		board[2][2]='C'; 
		
		for(int i=0; i<board.length; i++){
			for(int j=0; j<board[i].length; j++){
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("===================");
		
		//���η� ����
		for(int i=0; i<N; i++){
			for(int j=0; j<N-1; j++){
				char temp=board[i][j]; 
				board[i][j]=board[i][j+1]; 
				board[i][j+1]=temp; 
				
				for(int m=0; m<board.length; m++){
					for(int n=0; n<board[m].length; n++){
						System.out.print(board[m][n]+" ");
					}
					System.out.println();
				}
				System.out.println("--------------------------------");
				
				arrCheck(); 
				//������� ���� 
				temp=board[i][j];
				board[i][j]=board[i][j+1]; 
				board[i][j+1]=temp; 
			}
		}
		
		//���η� ����
		for(int i=0; i<N; i++){
			for(int j=0; j<N-1; j++){
				char temp=board[j][i]; 
				board[j][i]=board[j+1][i]; 
				board[j+1][i]=temp; 
				
				for(int m=0; m<board.length; m++){
					for(int n=0; n<board[m].length; n++){
						System.out.print(board[m][n]+" ");
					}
					System.out.println();
				}
				System.out.println("--------------------------------");
				
				arrCheck(); 
				//������Ų��. 
				temp = board[j][i]; 
				board[j][i]=board[j+1][i]; 
				board[j+1][i]=temp; 
				
				
			}
		}
		
		
	}
}
