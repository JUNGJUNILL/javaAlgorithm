package datastructure_Stack;

import java.util.Stack;

public class P003_Stack_JAVA {

	public static void main(String[] args) {
		
		//Stack 후입선출 다시한번 말한다. 후입선출 
		Stack<Character> st = new Stack<Character>(); 
		
		st.push('A');
		st.push('B');
		st.push('C');
		
	
		while(!st.isEmpty()){
			System.out.println(st.pop());
		}
		
	}

}
