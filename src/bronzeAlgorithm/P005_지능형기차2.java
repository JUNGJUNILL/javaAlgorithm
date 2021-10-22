package bronzeAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class P005_지능형기차2 {

	public static void main(String[] args) {
		
		//https://www.acmicpc.net/problem/2460
		//내가 내 대가리로 처음 푼 문제
		
		Scanner sc = new Scanner(System.in);
		int[][] station =new int[2][10]; 
		
		int boarding = 0; 
		int leave    = 0; 
		
		for(int i=0; i<station.length*10; i++){
		
			if(i % 2==0){ //내린사람
				station[1][leave] = sc.nextInt();
				leave++; 
				
			}else{ //탄사람
				station[0][boarding] = sc.nextInt();
				boarding++;			
			}
		}
		
		int tmp=0;
		
		int[] hello = new int[10]; 
		 
		for(int j=0; j<station[1].length; j++){
			
			tmp=(tmp-station[1][j])+station[0][j];
			hello[j]=tmp; 
		}
	
		Arrays.sort(hello);
		System.out.print(hello[hello.length-1]);
		
		
	

		
		

	}

}
