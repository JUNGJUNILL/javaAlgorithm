package basicAlgorithm;

import java.util.Scanner;

public class P005_ÃÖ´ñ°ª {

	public static void main(String[] args) {
		//https://www.acmicpc.net/problem/2562
		
		Scanner sc = new Scanner(System.in); 

		int[] array = new int[9]; 
		
		
		for(int i=0; i<array.length; i++){
			
			array[i] = sc.nextInt(); 
		}
		
		int temp = array[0];
		int index = 1;
		for(int i=0; i<array.length; i++){
			
			if(temp < array[i]){
				temp = array[i];
				index = i+1;
			}
			
		}
		System.out.println(temp);
		System.out.println(index);



	}

}
