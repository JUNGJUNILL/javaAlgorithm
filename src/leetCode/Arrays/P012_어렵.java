package leetCode.Arrays;

//Move Zeroes
//https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3157/
//배열의 0 요소를 맨 끝으로 옮겨라.
public class P012_어렵 {
	
	
	
	public static void moveZeroes(int[] nums) {
		
		int len = nums.length; //5 
		//0,1,0,3,12
		int index=0; 
		for(int i=0; i<len; i++){
			if(nums[i]!=0){
				nums[index]=nums[i]; 
				index++; 
			}
			// i == 0 false
			
			// i == 1 
			// true 
			// nums[0] = nums[1] (1) , index=1 
			// 1, 1, 0, 3, 12 
			
			// i== 2 false
			
			// i ==3 
			// true 
			// nums[1] = nums[3] (3) , index=2 
			// 1, 3, 0, 3, 12 
			
			// i==4 
			// true 
			// nums[2] = nums[4] (12) , index=3 
			// 1, 3, 12, 3, 12 
		}
		
		
		while(index < len){
			nums[index]=0; 
			index++; 
		}
		
		for(int i : nums){
			System.out.print(i+" ");
		}
		
		
	}
	
	public static void func001(int[] nums){
		
		int snowBallSize=0; 
		
		
		//0,1,0,3,12
		for(int i=0; i<nums.length; i++){
			if(nums[i]==0){
				snowBallSize++;
				
			}else if(snowBallSize > 0){
				int t = nums[i]; 				
				nums[i]=0; 
				nums[i-snowBallSize]=t; 
				
			}	
			
			//i==0  snow=1
			
			//i==1 
			// t = nums[1] 1 
			// nums[1]=0
			// nums[0]=1  (i-snow=0)
			// 1, 0, 0, 3, 12 
			
			//i==2 snow 2 
			
			//i==3 
			// t = nums[3] 3
			// nums[3]=0 
			// nums[1]=3  (i-snow=1)
			// 1, 3, 0, 0, 12
			
			//i==4 
			// t = nums[4] 12
			// nums[4]=0 
			// nums[2]=12  (i-snow=2)
			// 1, 3, 12, 0 ,0 
			

			
			
		}
		
		
		
		
		
		for(int i : nums){
			System.out.print(i+" ");
		}
		
	}

	public static void main(String[] args) {
		
		int[] arr={0,1,0,3,12}; 
		int[] arr2={0,1,0,3,12}; 
		func001(arr); 
		System.out.println();
		moveZeroes(arr2); 
		

	}

}
