package codeUpbasic100;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class P022_1025����1���Է¹޾Ƴ���������ϱ�_�� {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in); 
//		int number = sc.nextInt(); 
		
		
		//� ������ ���ڸ������� ���ϴ� ����� �ִ°�?
		
		//https://www.delftstack.com/ko/howto/java/how-to-get-the-separate-digits-of-an-int-number/
		int number = 75254; 

		Stack<Integer> q = new Stack<Integer>(); 
		int num=0; 
		
		while(number > 0){
			
			q.add(number % 10); 
			number = number / 10; 
			num++;
		}
		
		while(!q.isEmpty()){
			System.out.printf("[%d]",q.pop());
			System.out.println();
		}
		System.out.println(num);
		

		
	}
}
