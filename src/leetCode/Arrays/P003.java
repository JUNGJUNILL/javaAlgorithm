package leetCode.Arrays;

import java.util.Arrays;

//Squares of a Sorted Array
//https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3240/
public class P003 {
	
	 public static  int[] sortedSquares(int[] nums) {
		 
		 int[] newArr=new int[nums.length]; 
		 
		 for(int i=0; i<nums.length; i++){
		
			newArr[i] = (int)Math.pow(nums[i], 2); 
		 }
		 
		 Arrays.sort(newArr);
		 
		 return newArr; 
		 
		 
	 }

	public static void main(String[] args) {

		int[] arr={-4,-1,0,3,10}; 
		
		sortedSquares(arr); 
		
		for(int i : sortedSquares(arr)){
			System.out.println(i);
		}
		
	}

}
