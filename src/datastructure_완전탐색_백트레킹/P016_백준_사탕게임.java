package datastructure_����Ž��_��Ʈ��ŷ;

import java.util.Scanner;

public class P016_����_�������� {


/*
https://zzang9ha.tistory.com/203
*/

	static char[][] board; 
	static int N; 
	static int max = 0; 

	
	static int arrCheck(){
		
		//���η� üũ 
		for(int i=0; i<N; i++){
			int count=1; 
			for(int j=0; j<N-1; j++){
				if(board[i][j]==board[i][j+1]){
					count++; 
				}else{
					count=1; 
				}
				max = Math.max(max, count); 

			}
		}
		
		
		//���η� üũ 
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
	
	//https://www.acmicpc.net/problem/3085
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in); 
		N = sc.nextInt(); 
		board=new char[N][N]; 
	
		
		for(int i=0; i<N; i++){
			String str = sc.next(); 
			for(int j=0; j<board[i].length; j++){
				board[i][j]=str.charAt(j); 
			}
		}
		System.out.println();
		
		for(int i=0; i<board.length; i++){
			for(int j=0; j<board[i].length; j++){
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(arrCheck());
		
		
		//���η� ������ �� ���� ��ȯ ��, �ִ� ���� ���� ã�� ����ġ
		for(int i=0; i<N; i++){
			for(int j=0; j<N-1; j++){
				char temp=board[i][j]; 
				board[i][j] = board[i][j+1]; 
				board[i][j+1]=temp;
				
				arrCheck(); 
				
				temp=board[i][j];
				board[i][j]=board[i][j+1]; 
				board[i][j+1]=temp; 
			}
		}
		
		//���η� ������ �� ���� ��ȯ ��, �ִ� ���� ���� ã�� ����ġ
		for(int i=0; i<N; i++){
			for(int j=0; j<N-1; j++){
				char temp=board[j][i];
				board[j][i]=board[j+1][i]; 
				board[j+1][i]=temp;
				
				arrCheck(); 
				temp=board[j][i]; 
				board[j][i]=board[j+1][i]; 
				board[j+1][i]=temp;
				
			}
		}
		
		System.out.println(max);
		
		
	}
}
