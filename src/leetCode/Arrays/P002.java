package leetCode.Arrays;

//Find Numbers with Even Number of Digits
//https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3237/
public class P002 {
	
	public static int findNumbers(int[] nums) { 
		
		int seq=0; 
		
		for(int i : nums){
			int count=0;  
			
			while(i>0){
				i= i/10; 
				count++; 
			}
			
			if(count % 2 ==0){
				seq++; 
			}
			
		}

		return seq; 
	}

	public static void main(String[] args) {
		
		int[]arr={555,901,482,1771}; 
		
		System.out.println(findNumbers(arr));
		
		
		
	}
	
}
