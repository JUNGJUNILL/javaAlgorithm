package programmers_level02;

import java.util.Queue;
import java.util.Stack;

public class P009_�ùٸ���ȣ {

	
	//https://programmers.co.kr/learn/courses/30/lessons/12909
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������ �̿��� ��������.. 
		//202111���� Ǯ���� �����ε�... ������ �ȳ��� 
		String s = "()()"; 
		Stack<Character> stack=new Stack<>();
		for(int i=0; i<s.length(); i++){
		
			if(s.charAt(i)=='('){
				stack.push(s.charAt(i)); 
			}else{
				
				if(s.charAt(i)==')'){
					
					if(stack.isEmpty()){
						stack.push(s.charAt(i));
						break; 
					}else{
						stack.pop();
					}
					
				}
				
				
			}
			
			
		}
		
		System.out.println(stack.size());

		
		//��������
		//�����������
		
		//��������
		//�������� 
	
		
		
	}
}