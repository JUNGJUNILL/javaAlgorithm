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
		//stack�� �̿��ؼ�.. 
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
