package codeUpbasic100;

import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.SynchronousQueue;

public class P024_1027������Է¹޾����Ĺٲ�����ϱ�_�� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); 
		StringBuffer bf = new StringBuffer(); 
		Stack<String> stack =new Stack<>(); 
		
		String str = sc.next(); 
		String[] strArr = str.split("\\.");
		
		for(String s : strArr){
			stack.push(s); 
		}
		
		
		while(!stack.isEmpty()){
			if(stack.size() == 1){
				bf.append(stack.pop()); 
			}else{
				bf.append(stack.pop()+"-"); 	
			}	
		}
		
		System.out.println(bf.toString());
		
	
	}

}
