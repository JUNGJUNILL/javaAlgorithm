package silverAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class P003_N번째큰수 {

	public static void main(String[] args) {
		//https://www.acmicpc.net/problem/2693
		Scanner sc = new Scanner(System.in);

		int input=sc.nextInt(); 
		int N =3; 
		int[][] array = new int[input][10]; 
		for(int i=0; i<input; i++){
			for(int j=0; j<10; j++){
				
				array[i][j]=sc.nextInt();
			}
			Arrays.sort(array[i]);
		}
				
		
		for(int i=0; i<array.length; i++){

			System.out.println(array[i][10-N]);		
		}
		
	}

}
