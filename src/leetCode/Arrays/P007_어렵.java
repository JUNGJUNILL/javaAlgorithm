package leetCode.Arrays;

//Remove Duplicates from Sorted Array
//https://leetcode.com/explore/learn/card/fun-with-arrays/526/deleting-items-from-an-array/3248/
public class P007_��� {
	
	//�迭�� �ߺ� ���Ÿ� �̷��Ե� �� �� �ֳ�; 
    public static int removeDuplicates(int[] nums) {
    	int index=1; 
    	int len = nums.length-1; //9 
    	//0,0,1,1,1,2,2,3,3,4
    	for(int i=0; i<len; i++){
    		
    		if(nums[i] != nums[i+1]){
    			nums[index++] = nums[i+1]; 
    		}
    		
    	}
    	
    	
    	for(int i=0; i<index; i++){
        	System.out.print(nums[i]+ " ");

    	}
    	System.out.println();
    
    
    	return index; 
    }

	public static void main(String[] args) {
		int[] arr ={0,0,1,1,1,2,2,3,3,4}; 
		System.out.println(removeDuplicates(arr));

	}

}
