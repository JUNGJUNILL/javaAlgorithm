package leetCode.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//Find All Numbers Disappeared in an Array
//https://leetcode.com/explore/learn/card/fun-with-arrays/523/conclusion/3270/
public class P017 {
	
	  public static List<Integer> findDisappearedNumbers(int[] nums) {
		  
		  
		  Arrays.sort(nums);
		  Queue<Integer> q=new LinkedList<>(); 
		  
		  for(int i : nums){
			  if(!q.contains(i)){
				 q.add(i); 
			  }
		  }
		  
		  for(int i=0; i<nums.length-q.size(); i++){
			  q.add(0); 
		  }
		  
		  
		  int len = nums.length; 
		  List<Integer> result = new ArrayList<>(); 
		  for(int i=1; i<=len; i++){
			  int val = q.poll(); 
			  if(val != i){
				  result.add(i); 
			  }
		  }
		  
		  
		  
		  return result; 
	  }

	public static void main(String[] args)  {

		
		int[] arr={4,3,2,7,8,2,3,1}; 
		// 1, 2, 2, 3, 3, 4, 7, 8
		// 1, 2, 3, 4, 7, 8 
		// 1, 2, 3, 4, 5, 6, 7, 8
		
		for(int i : findDisappearedNumbers(arr)){
			System.out.println(i);
		}
	
	
	}

}
