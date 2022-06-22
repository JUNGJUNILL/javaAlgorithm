package leetCode.Arrays;

import java.util.*;

//Check If N and Its Double Exist
//https://leetcode.com/explore/learn/card/fun-with-arrays/527/searching-for-items-in-an-array/3250/
public class P008_¾î·Æ {
	
	public static boolean checkIfExist(int[] arr) {
		
		
		boolean result = false; 	

		
		for(int i=0; i<arr.length; i++){
			
			for(int j=0; j<arr.length; j++){
				
				if(i != j){
					if(arr[i] == 2*arr[j]){
					   
						result=true;
				
					}
				}
				
				//i == 0 -> 1 2 3 
				//i == 1 -> 0 2 3 
				//i == 2 -> 0 1 3
				//i == 3 -> 0 1 2 
				
				
			}
		}
		
		
		return result; 
	}

	
	public static boolean func001(int[] arr) {
		
		Set<Integer> set=new HashSet<>(); 
		//10,2,5,3
		for(int i : arr){
			if(set.contains(2*i) || (i % 2==0 && set.contains(i/2))){
				//10 false set.add(10)
				// 2  false set.add(2)
				// 5  true 
				return true;
			}
			set.add(i); 
		}
		return false; 
		
	}
	
	

	public static void main(String[] args) {
		
		int[] arr={10,10,2,2,5,3}; 
		System.out.println(checkIfExist(arr));
 

	}

}
