package leetCode.Recursion;

import java.util.Stack;

//Reverse String
//https://leetcode.com/explore/learn/card/recursion-i/250/principle-of-recursion/1440/
public class P001 {
  

		//stack
	   public static void reverseString(char[] s) {
	        
		  Stack<Character> stack=new Stack<>();
		  
		  for(char c : s){
			  stack.push(c); 
		  }
		  
		  for(int i=0; i<s.length; i++){
			  s[i] = stack.pop(); 
		  }
		  
		  	for(char aa : s){
		  		System.out.println(aa);
		  	}
		  
	    }
	   
	   //투포인터
	   public static void func001(char[] s){
		   
		   int start=0;
		   int end = s.length-1; 
		   		   
		   while(start<end){
			   char first = s[start];
			   s[start] = s[end]; 
			   s[end] = first; 
			   
			   start++;
			   end--;
		   }
		   //1 2 3 4
		   //start=0, end 3 
		   //start < end true 
		   // first = 1
		   // s[0] = s[3] 
		   // s[3] = first (1)
		   //4 2 3 1
		   //start=1, end=2 
		   
		   //4 2 3 1
		   //start=1 , end=2
		   //start < end true 
		   // first = 2
		   // s[1] = s[2]
		   // s[2] = first (2)
		   // 4 3 2 1
		   // start=2 , end=1 
		   
		   //start <  end false 종료
		
		   
		  	for(char aa : s){
		  		System.out.println(aa);
		  	}
		   
		   
	   }
	   
	   
	   
	public static void main(String[] args) {

		  char[] newChar1= {'1','2','3','4'};
		  //D B C D
		  char[] newChar2= {'D','C','B','A'};
	
		  
		  reverseString(newChar2); 
		  System.out.println("---------------");
		  func001(newChar1); 
	}	

}
