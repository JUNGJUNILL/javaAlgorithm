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
		//stack을 이용해서.. 
		//https://www.delftstack.com/ko/howto/java/how-to-get-the-separate-digits-of-an-int-number/
//		int number = 75254;
		int number = 12345;
		String stringNumber = String.valueOf(number); 
		
		Stack<Integer> q = new Stack<Integer>(); 
		int num=0; 
		
		while(number > 0){
			q.add(number % 10); 
			number = number / 10; 
			num++;
		}
		
		String str=""; 
	
		while(!q.isEmpty()){
			
			for(int i=num; i>0; i--){
				for(int j=0; j<i; j++){
					if(j==0){
						continue; 
					}
					str=str+"0"; 
				}
				System.out.printf("[%d"+str+"]",q.pop());
				System.out.println();
				str=""; 
			}

		}
	}
}
