package basicAlgorithm;

import java.util.Stack;

public class P019_��ȣ {

	//https://www.acmicpc.net/problem/9012
	public static void main(String[] args) {
		
		//stack�� ���Լ����̴�. 
		
		String str = "()"; 

		Stack<Character> stack =new Stack<>(); 
		StringBuffer bf=new StringBuffer(); 
		
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i)=='('){
				stack.push(str.charAt(i)); 
			
			}else{
				
					if(str.charAt(i)==')' && stack.pop()=='('){
						
					}else{
						
					}
					
					if(stack.isEmpty()){bf.append("NO\n"); break;}
			}
		
		}
		
		System.out.println(bf.toString());
		
		
		
	}

}
