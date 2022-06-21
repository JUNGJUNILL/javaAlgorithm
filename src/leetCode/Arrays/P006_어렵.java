package leetCode.Arrays;

//Remove Element
//https://leetcode.com/explore/learn/card/fun-with-arrays/526/deleting-items-from-an-array/3247/
public class P006_¾î·Æ {
	
	 public static int removeElement(int[] nums, int val) {
		 
		 int result = 0; 		 
		 for(int i=0; i<nums.length; i++){			 
			 if(nums[i]!=val){
				 nums[result++] = nums[i]; 
			 }		 
		 }
		 return result; 
	 }
	 


	public static void main(String[] args) {

		
		int[] arr={0,1,2,2,3,0,4,2}; 
		
		System.out.println(removeElement(arr, 2));
		
	}

}
