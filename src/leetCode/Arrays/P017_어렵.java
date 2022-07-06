package leetCode.Arrays;

import java.util.*;


//Find All Numbers Disappeared in an Array
//https://leetcode.com/explore/learn/card/fun-with-arrays/523/conclusion/3270/
public class P017_어렵 {
	
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
	  
	  //이것도 시간초과가뜬다.
	  public static List<Integer> func001(int[] nums){
		  
		  int len=nums.length;
		  List<Integer> list = new ArrayList<>(); 
		  
			  for(int i=1; i<=len; i++){
				  int count=0;
				  
				  for(int j=0; j<len; j++){
					  
					  if(i == nums[j]){
						  count++;
						 break;
					  } 
				  } 
				  
				  if(count==0){
					  list.add(i); 
				  }
			  
			
		  }
			  
	
			  return list;
	  }
	  
	  //이걸 짠 사람은 천재인가?
	  public static List<Integer> func002(int[] nums){
		  
		  //4,3,2,7,8,2,3,1
		  int idx; 
		  for(int i=0; i<nums.length; i++){
			  
			  idx = Math.abs(nums[i])-1; 
			  //i==0 idx = 3(4-1) 
			  //i==1 idx = 2(3-1) 
			  //i==2 idx = 1(2-1)
			  //i==3 idx = 6(7-1)
			  //i==4 idx = 7(8-1)
			  //i==5 idx = 1(2-1)
			  //i==6 idx = 2(3-1)
			  //i==7 idx = 0(1-1)
			  
			  if(nums[idx] > 0 ){
				  //nums[3] = 7 > 0 true
				  //nums[2] = 2 > 0 true
				  //nums[1] = 3 > 0 true
				  //nums[6] = 3 > 0 true
				  //nums[7] = 1 > 0 true
				  //nums[1] = 3 > 0 true
				  //nums[2] = 2 > 0 true
				  //nums[0] = 4 > 0 true
				  
				  nums[idx] =nums[idx] *(-1); 
				  //4,3,2,(-7),8,2,3,1
				  //4,3,(-2),-7,8,2,3,1
				  //4,(-3),-2,-7,8,2,3,1
				  //4,-3,-2,-7,8,2,(-3),1
				  //4,-3,-2,-7,8,2,-3,(-1)
				  //4,(-3),-2,-7,8,2,-3,-1
				  //4,-3,(-2),-7,8,2,-3,-1
				  //(-4),-3,-2,-7,8,2,-3,-1
			  }
		  }
		  
		  List<Integer> list = new ArrayList<>();
		  
		  for(int i=0; i<nums.length; i++){
			  if(nums[i]>0){
				  list.add(i+1); 
			  }
		  }

		  return list; 
	
	  }
	  
  public static List<Integer> func003(int[] nums){
		  
		  //4,3,2,7,8,2,3,1
		  int idx; 
		  for(int i=0; i<nums.length; i++){
			  
			  idx = Math.abs(nums[i])-1; 	
			  
			  if(nums[idx] > 0 ){
				  nums[idx] =nums[idx] *(-1); 	
			  }
		  }
		  
		  List<Integer> list = new ArrayList<>();
		  
		  for(int i=0; i<nums.length; i++){
			  if(nums[i]>0){
				  list.add(i+1); 
			  }
		  }

		  return list; 
	
	  }
	  
	public static void main(String[] args)  {

		
		int[] arr={4,3,2,7,8,2,3,1};
//		int[] arr={1,1};
		//int[] arr={1, 2, 2, 3, 3, 4, 7, 8}; 
		// 1, 2, 2, 3, 3, 4, 7, 8
		// 1, 2, 3, 4, 7, 8 
		// 1, 2, 3, 4, 5, 6, 7, 8
		// 4, 3, 2, 7, 8, 1
		//func001(arr); 
		 
		for(int i : func002(arr)){
			System.out.println(i);
		}
		//System.out.println(i);
		
	
	
	}

}
