package datastructure_����Ž��_��Ʈ��ŷ;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P021_����_���̾��1 {

	 
	
	//https://www.acmicpc.net/problem/1748
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in); 
		int N= sc.nextInt(); 
		int count=0; 
		int temp=0; 
	
		for(int i=1; i<=N; i++){
			int hello=0;
			while(i>0){
				int index =i%10;
				i=i/10;
				hello++;
			}
			
			int index = (i-hello); 
			hello=0;
			temp=i-index; //10�϶� temp�� 2�� ���������Ѵ�.
	
			count+=temp; 
			System.out.println(i+":"+index+":"+temp);
		
		}
		
		System.out.println(count);
		


	

	}

}
