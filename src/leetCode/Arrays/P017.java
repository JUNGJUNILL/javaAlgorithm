package leetCode.Arrays;

import java.util.*;


//Find All Numbers Disappeared in an Array
//https://leetcode.com/explore/learn/card/fun-with-arrays/523/conclusion/3270/
public class P017 {
	
	//시간초과뜨네
	  public static List<Integer>  findDisappearedNumbers(int[] nums) {
		  
		  
		  Arrays.sort(nums);
		  List<Integer> list=new ArrayList<>();
		  
		  for(int i : nums){
			  if(!list.contains(i)){
				  list.add(i); 
			  }
		  }
		  
		  int len = nums.length;
		  List<Integer> list2 = new ArrayList<>();
		  
		  for(int i=1; i<=len; i++){
			  int check=0; 
			  for(int k : list){
				  
				  if(i==k)check++; 
				  
			  }
			  
			  if(check==0) list2.add(i); 
			  
		  }

		  return list2; 
	  
	  }
	  
	  
	  public static List<Integer> func001(int[] nums){
		  
		  return null;
	  }
	  
	  
	public static void main(String[] args)  {

		
		int[] arr={4,3,2,7,8,2,3,1}; 
		// 1, 2, 2, 3, 3, 4, 7, 8
		// 1, 2, 3, 4, 7, 8 
		// 1, 2, 3, 4, 5, 6, 7, 8
		
	for(int i : findDisappearedNumbers(arr)){
		System.out.println(i);
	}
			//System.out.println(i);
		
	
	
	}

}
