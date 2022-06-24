package Algorithm_nano;

import java.util.HashSet;
import java.util.Iterator;

public class P028_배열의중복값제거 {

	public static void main(String[] args) {

		int[] arr ={0,0,1,1,1,2,2,3,3,4}; 

		
		int len = arr.length-1;
		
		int count=1; 
		
		for(int i=0; i<len; i++){
			
			if(arr[i] != arr[i+1]){
				arr[count++] = arr[i+1]; 
			}
		}
		   
		
		for(int i=0; i<count; i++){
			System.out.print(arr[i]+" ");
		}
		
		
		
		
	
		

		
		
		
		
	}
	
	
	
	

}
