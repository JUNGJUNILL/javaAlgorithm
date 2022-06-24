package leetCode.Arrays;

import java.util.HashSet;
import java.util.Set;

//Remove Duplicates from Sorted Array
//https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3258/
//중복요소 제거하고.. 
//오름차순 정렬하고.. 

public class P011_어렵 {
	
	public static int removeDuplicates(int[] nums) {

		int len = nums.length-1; //9
		int count=1; 
		
		for(int i=0; i<len; i++){

			
			if(nums[i]!=nums[i+1]){
				nums[count++] = nums[i+1]; 
			}
			
		}
		

		return count;
	}
	
	
	public static int  func001(int[] nums){
		
		return 0;
	}
	
	
	public static void main(String[] args) {

		int[] arr={0,0,1,1,1,2,2,3,3,4}; 
		System.out.println(removeDuplicates(arr));
	
		
	}

}
