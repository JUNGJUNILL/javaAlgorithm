package basicAlgorithm;

import java.util.Scanner;
import java.util.Stack;

public class P019_괄호 {

	//https://www.acmicpc.net/problem/9012
	public static void main(String[] args) {
		
		//stack은 후입선출이다. d
		
		//String str = "))"; 
		
		Scanner sc = new Scanner(System.in); 
		int number = sc.nextInt(); 
		StringBuffer bf=new StringBuffer(); 
		
		for(int i=0; i<number; i++){
			
			String str = sc.next(); 
			Stack<Character> stack =new Stack<>(); 
			
			for(int j=0; j<str.length(); j++){
				
				if(str.charAt(j)=='('){
					stack.push(str.charAt(j)); 
				
				}else{
					if(str.isEmpty()){break;}
					if(str.charAt(j)==')' && !stack.isEmpty()){
						 stack.pop();
					}else if(str.charAt(j)==')' && stack.isEmpty()){
						stack.push(')'); 
						break;
					}					
				}
				
			}
	
			
			if(stack.isEmpty()){
				bf.append("YES\n"); 
			}else{
				bf.append("NO\n"); 
			}
		}
		
		
		System.out.println(bf.toString());
			
		
	}
		

//		Stack<Character> stack =new Stack<>(); 
//		StringBuffer bf=new StringBuffer(); 
//		
//		for(int i=0; i<str.length(); i++){
//			
//			
//			
//			if(str.charAt(i)=='('){
//				stack.push(str.charAt(i)); 
//			
//			}else{
//			
//				if(str.charAt(i)==')' && !stack.isEmpty()){
//					 stack.pop();
//				}else if(str.charAt(i)==')' && stack.isEmpty()){
//					stack.push(')'); 
//					break;
//				}					
//			}
//		}
//		
//		if(stack.isEmpty()){
//			bf.append("YES\n"); 
//		}else{
//			bf.append("NO\n"); 
//		}
//		
//		System.out.println(bf.toString());
		


}
