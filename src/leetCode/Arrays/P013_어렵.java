package leetCode.Arrays;

//Sort Array By Parity
//https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3260/
public class P013_¾î·Æ {
	
	public static int[] sortArrayByParity(int[] nums) {
		
		if(nums.length==1) return nums; 
		int index= -1; 
		int[] newArr =new int[nums.length]; 
		
		// 3,1,2,4
		for(int i=0; i<nums.length; i++){
			
			if(nums[i] % 2 == 0){
				index++; 
				newArr[index] = nums[i]; 
			}
			
		}
		
		
	for(int i=0; i<nums.length; i++){
			
			if(nums[i] % 2 != 0){
				index++; 
				newArr[index] = nums[i]; 
			}
			
		}
		
		return newArr; 
	}
	
	
	public static int[] func001(int[] nums) {
		
		
		// 3,1,2,4
		for(int i=0, j=0; j<nums.length; j++){
			
			if(nums[j] % 2==0){
				int tmp = nums[i]; 
				
				nums[i++] = nums[j]; 
				
				nums[j] = tmp; 
					
				
			}
			
			//j == 2 
			// tmp = nums[0] (3)
			// nums[0] = nums[2] (2)
			// 2, 1, 2, 4 
			
			// nums[2] = tmp (3) 
			// 2, 1, 3, 4 
						
			//j == 3
			// tmp = nums[1] (1)
			// nums[1] = nums[3] (4) 
			// 2, 4, 3, 4
			
			// nums[3] = tmp (1)
			// 2, 4, 3, 1 
			
			
		}
		
		return nums; 
		
	}

	public static void main(String[] args) {
		
		int[] arr={ 3,1,2,4}; 
		
		
		for(int i : func001(arr)){
			System.out.println(i);
		}
	

	}

}
