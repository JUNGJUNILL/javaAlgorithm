package Algorithm_nano;

import java.util.*;

public class P002_�������ڸ������ϱ� {

	public static void main(String[] args) {

		//�ϴ� ������ �̿��Ѵ�. 
		Stack<Integer> stack = new Stack<>();
		Queue<Integer> q = new LinkedList<Integer>(); 
		
		int number01 = 12345;
		int number02 = 12345;
		int num     =0; 

		while(number01>0){
			q.add(number01 % 10); 
			number01 =number01 /10; 
			 
		}
		while(!q.isEmpty()){
			System.out.print(q.poll());
		}
		System.out.println();
		
		while(number02>0){
			stack.push(number02 % 10); 
			number02 = number02 / 10; 
		}
		
		
		while(!stack.isEmpty()){
			System.out.print(stack.pop());
		}
		
		
	}

}
