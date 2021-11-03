package codeUpbasic100;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class P022_1025정수1개입력받아나누어출력하기_뷁 {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in); 
//		int number = sc.nextInt(); 
		
		
		//어떤 숫자의 몇자리수인지 구하는 방법이 있는가?
		
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
