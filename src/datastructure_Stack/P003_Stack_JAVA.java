package datastructure_Stack;

import java.util.Stack;

public class P003_Stack_JAVA {

	public static void main(String[] args) {
		
		//Stack ���Լ��� �ٽ��ѹ� ���Ѵ�. ���Լ��� 
		Stack<Character> st = new Stack<Character>(); 
		
		st.push('A');
		st.push('B');
		st.push('C');
		
	
		while(!st.isEmpty()){
			System.out.println(st.pop());
		}
		
	}

}
