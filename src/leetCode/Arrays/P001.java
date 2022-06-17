package leetCode.Arrays;


//Max Consecutive Ones
//https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3238/
public class P001 {
	
	
	public static int findMaxConsecutiveOnes(int[] nums) {
		
		int seq=0; 
		int result=0; 
		
		for(int i=0; i<nums.length; i++){
			if(nums[i]==1){
				++seq; 
			
			}else{
			
				seq=0; 
			}
			
			
			result = Math.max(seq, result); 
		}
		

		
		return result; 
	}
	
	public static int func001(int[] nums){
		int count=0; 
		int result=0; 
		for(int i : nums){
			
			if(i==1){
				count++; 
				result=Math.max(count, result); 
			}else{
				count=0; 
			}
			
		}
		
		return result; 
		
	}
	
	
	public static void main(String[] args) {

		int[] arr ={1,1,0,1,1,1}; 
		System.out.println(findMaxConsecutiveOnes(arr));
		System.out.println(func001(arr));
	}

}
