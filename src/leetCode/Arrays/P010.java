package leetCode.Arrays;

//Replace Elements with Greatest Element on Right Side
//https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3259/
public class P010 {
	
	public static int[] replaceElements(int[] arr) { 
		
		int lastIndex = arr.length-1; 		
		if(arr.length==1) arr[0] = -1; 
		int count=1; 
		int max = Integer.MIN_VALUE; 

		for(int i=0; i<arr.length; i++){
			
			
			//i==0 -> 1,2,3,4,5
			//i==1 -> 2,3,4,5
			//i==2 -> 3,4,5
			//i==3 -> 4,5
			//i==4 -> 5
			//i==lastIndex = arr[i] = -1; 
			if(lastIndex==i){
				arr[i]=-1; 
				break; 
			}
			
			for(int j=count; j<arr.length; j++){
				max=Math.max(max, arr[j]); 
				arr[i]=max;
		
				
			}
			max = Integer.MIN_VALUE;
			count++;

		}
		
		return arr;	
	}

	
	public static int[] func001(int[] arr){
			int K=1; 
			int last=arr.length-1; 
			for(int i=0; i<arr.length; i++){
				
				int max=0; 	
				if(i==last) arr[last]=-1; 
				for(int j=i+1;  j<=last; j++){			
					max = Math.max(max, arr[j]); 
					arr[i] = max; 
				}
			}
			  
			
			return arr;
		
	}
	
	public static void main(String[] args) {

		int[] arr={17,18,5,4,6,1}; 
		
		for(int i : replaceElements(arr)){
			System.out.print(i+" ");
		}
	}

}
