package Algorithm_nano;

import java.util.*;

public class P002_정수의자리수구하기 {

	public static void main(String[] args) {
		//https://velog.io/@hyeon930/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-124-%EB%82%98%EB%9D%BC%EC%9D%98-%EC%88%AB%EC%9E%90-Java
		String[] numArray={"4","1","2"};
		String answer=""; 
		int n=10; 
		
		while(n>0){
			
		answer = numArray[n%3] + answer; 
		//이 부분이 가장 핵심이네;;
		n = (n-1) /3; 
			
		}
		System.out.println(answer);
		
		
		
		
		//일단 스택을 이용한다. 
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
		System.out.println();
		
		int numbers=123456789; 
		int count=0; 
		while(numbers>0){
			numbers =numbers/10; 
			count++;
			
		}
		System.out.println("count="+count);
	
		
		
	}

}
