package codility;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class LESSON02_OddOccurrencesInArray03 {

	public static void main(String[] args) {

		
		//https://jobjava00.github.io/algorithm/codility/lesson2/OddOccurrencesInArray/
		
		int[] A =new int[7]; 
		
		A[0]=9;
		A[1]=3;
		A[2]=9;
		A[3]=3;
		A[4]=9;
		A[5]=7;
		A[6]=9;
		
		int temp =0; 
		for(int i=0; i<A.length; i++){
			temp = temp ^ A[i]; 
		}
		System.out.println(temp); 
	}

}
