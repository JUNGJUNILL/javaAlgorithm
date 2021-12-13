package datastructure_완전탐색_백트레킹;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P021_백준_수이어쓰기1 {

	
	static int count(int x){
		int count=0;
		while(x>0){
			x/=10;
			count++;
		}
		return count; 
		
	}

	//https://www.acmicpc.net/problem/1748
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in); 
		int N= sc.nextInt(); 
//		int count=0; 
//		int temp=0; 
//	
//		for(int i=1; i<=N; i++){
//		
//			int length = count(i); 
//			int index = (i-length); 
//			
//			temp=i-index; //10일때 temp를 2로 만들어줘야한다.
//	
//			count+=temp; 
//		
//		}
//		
//		System.out.println(count);
		
		

//		int cnt=1; 
//		int temp=0; 
//		int length=10; 
//		
//		for(int i=1; i<=N; i++){
//
//			if(i==length){
//				System.out.println(length);
//
//				cnt++;
//				length*=10;
//
//			}
//			temp+=cnt; 
//			
//			
//		}
//		
//		System.out.println(temp);

		
		int ans=0; 
		
		for(int i=1; i<=N; i++){
			int len=1; 
			int a=i; 
			
			//10의 자리
			//100의 자리
			//1000의 자리 ...
			while(a/10 !=0){
				len+=1; 
				a=a/10; 
			}
			ans+=len; 
		}
		
		System.out.println(ans);
	

	}

}
