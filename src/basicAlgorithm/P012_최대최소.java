package basicAlgorithm;

import java.util.Scanner;

public class P012_최대최소 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int max =-1000000;  
		int min =1000000; 
		
		int input = in.nextInt(); 
		int[] array = new int[input]; 
		for(int i=0; i <input; i++){
			array[i] =in.nextInt(); 
		}
		
		for(int j=0; j<array.length; j++){
			max = max < array[j] ? array[j]:max; 
			min = min > array[j] ? array[j]:min; 
		}
		
		System.out.print(min); 
		System.out.print(" ");
		System.out.print(max); 
		
		
		
	}

}
