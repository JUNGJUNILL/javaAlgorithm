package leetCode.Arrays;

import java.util.Arrays;import java.util.Currency;

//Height Checker
//https://leetcode.com/explore/learn/card/fun-with-arrays/523/conclusion/3228/
public class P015 {

	   //내가 푼거..
	   public static int heightChecker(int[] heights) {
	        
		   
		   int[] arr=new int[heights.length];
		   for(int i=0; i<arr.length; i++){
			   arr[i] = heights[i]; 
		   }
		   
		   int cnt=0; 
		   Arrays.sort(heights);
		   for(int j=0; j<arr.length; j++){
			   if(arr[j]!=heights[j]){
				   cnt++; 
			   }
		   }
		   
		   for(int i : arr){
			   System.out.print(i+ " ");
		   }
		   System.out.println();
		   for(int i : heights){
			   System.out.print(i+ " ");
		   }
		   
		   
		   return cnt; 
	    }
	   
	   //정렬이 필요없음
	   //카운팅 정렬(계수 정렬)
	   public static int func001(int[] heights) {
		   
		   int[] heighToFreq=new int[101]; 
		   
		   
		   for(int h : heights){
			   heighToFreq[h]++; 
		   }
		   
		   int result=0; 
		   int curHeight=0; 
		   
		   for(int i=0; i<heights.length; i++){
			   while(heighToFreq[curHeight] == 0){
				   curHeight++;
			   }
			   
			   if(curHeight != heights[i]){
				   result++;
			   }
			   
			   heighToFreq[curHeight]--;
			
		   }
		   

		   
		  //
		   return result; 
	   }
	   
	   
	
	public static void main(String[] args) {

		int[] arr={5,1,2,3,4};
		int c = func001(arr); 
		System.out.println(c);
	}

}
