package Algorithm_nano;

import java.util.Arrays;
import java.util.Stack;

public class P031_N번째큰수 {
	
	
	public static int func001(int[] nums, int count){
		
		Arrays.sort(nums);
		Stack<Integer> stack=new Stack<>(); 
		
		for(int i : nums){
			
			if(!stack.contains(i)){
				stack.push(i); 
			}
			
		}
		
		if(stack.size() < count){
			
			int max = stack.pop();
			return max; 
			
		}else{
			int cnt=0; 
			int result=0; 
			while(cnt != count){
				result = stack.pop(); 
				cnt++;
			}
			return result; 
		}
		
	}
	
	public static void main(String[] args) {

		int[] arr={1,2,3}; 
		int rank = 3;  //번째로 큰 수 
		System.out.println(func001(arr,rank));
		
	}

}
