package bronzeAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class P005_����������2 {

	public static void main(String[] args) {
		
		//https://www.acmicpc.net/problem/2460
		//���� �� �밡���� ó�� Ǭ ����
		
		Scanner sc = new Scanner(System.in);
		int[][] station =new int[2][10]; 
		
		int boarding = 0; 
		int leave    = 0; 
		
		for(int i=0; i<station.length*10; i++){
		
			if(i % 2==0){ //�������
				station[1][leave] = sc.nextInt();
				leave++; 
				
			}else{ //ź���
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
