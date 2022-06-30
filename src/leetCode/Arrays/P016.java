package leetCode.Arrays;

import java.util.*;

//Third Maximum Number
//https://leetcode.com/explore/learn/card/fun-with-arrays/523/conclusion/3231/
//배열의 요소중 3번째로 큰 수를 구해라
public class P016 {
	
	//내가 푼거.... 
    public static int thirdMax(int[] nums) {

    		
    	Arrays.sort(nums);
 
    	Stack<Integer> stack =new Stack<>();  
    	
    	for(int i : nums){
    	 
    		if(!stack.contains(i)){
    			stack.push(i);  
    		}
    	}

    
    	if(stack.size() < 3){
    		int hello=stack.pop();
    		return hello;
    		
    	}else{
    		int cnt=0; 
    		int result=0; 
    		while(cnt !=3){
    			result = stack.pop();
    			cnt++;
    		}
    		
    		return result;
    	}
 
    }
    
    //가장 빠른 방법
    public static int func001(int[] nums) {

    	Integer max1=null;
    	Integer max2=null;
    	Integer max3=null;
    	
    	
    	
    	
    	//2,2,3,1
    	for(Integer n : nums){
    		
    		// 2 
    		// max1
    		
    		if(n.equals(max1) || n.equals(max2) || n.equals(max3)) continue;
    		
    		if(max1==null || n>max1){
    			max3 = max2; 
    			max2 = max1;
    			max1 = n; 
    			
    		}else if(max2==null || n>max2){
    			max3 = max2;
    			max2 = n; 
    			
    			
    		}else if(max3==null || n>max3){
    			max3 = n;
    			
    		}
    		
    	}
	
    	return max3 == null ? max1 : max3; 
    }    
    
    
	public static void main(String[] args) {

		
		int[] arr={2,2,3,1};
		//2,4,6,8,9 
		//return 6
		
		System.out.println(thirdMax(arr));
		System.out.println(func001(arr));
		
		
	}

}
