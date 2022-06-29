package leetCode.Arrays;

//Remove Element
//https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3575/
//배열의 특정 요소 제거
public class P014_어렵 {
	
	
	 public static int removeElement(int[] nums, int val) {

		   int count=0; 
		   	for(int i=0; i<nums.length; i++){
		   		
		   		if(nums[i] !=val){
		   			nums[count++]=nums[i]; 
		   		}
		   		//0,1,2,2,3,0,4,2
		   		//count 0, i=0 {0,         
		   		//count 1, i=1 {0,1
		   		//count 2, i=4 {0,1,3
		   		//count 3, i=5 {0,1,3,0
		   		//count 4, i=6 {0,1,3,0,4
		   		
		   		//결론
		   		//{0,1,3,0,4,0,2}
		   	}
		   	
		   	for(int k : nums){
		   		System.out.print(k+ " ");
		   	}
	
		   return count; 
	   }

	public static void main(String[] args) {

		int[] arr={0,1,2,2,3,0,4,2}; 
		removeElement(arr,2); 
		
		int[] arr1={0,1,2,2,3,0,4,2};
		
		

	}

}
