package codeUpbasic100;

import java.util.Scanner;

public class P093_1096_πŸµœ∆«ø°»Úµπ≥ı±‚ {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in); 
		int num=sc.nextInt(); 
		int[][] arr=new int[19][19];
		
		for(int i=0; i<num; i++){
			int a=sc.nextInt(); 
			int b=sc.nextInt(); 
			arr[a-1][b-1]=1;
		}
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}
