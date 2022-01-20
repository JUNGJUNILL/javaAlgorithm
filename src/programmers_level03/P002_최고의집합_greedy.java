package programmers_level03;

import java.util.*;

public class P002_�ְ�������_greedy {
	
	
	
	//���� s�� n���� ���� ���� ũ���� 
	//n���� ���ڰ� s / n �� ����� ���ڿ��� �Ѵ�.
	
	//s�� n���� ���� �������� rset , ���� value ��� �� ��, 
	//������ �� �ִ밡 �Ƿ��� rset�� ��ŭ value+1�� ���ڰ� �����ϰ�,
	//������ ������ value�� �����ϸ� �ȴ�. 
	
    public static int[] solution(int n, int s) {
    	if(n>s){
    		return new int[]{-1}; 
    	}
    	
        int[] answer=new int[n]; 
        int value=s / n; 
        int reset=s % n; 
        
        for(int i=0; i<n-reset; i++){
        	answer[i]=value; 
        }
        
        for(int i=n-reset; i<n; i++){
        	answer[i]=value+1;
        }
      
        	 return answer; 	
        }

	
	//https://programmers.co.kr/learn/courses/30/lessons/12938
	public static void main(String[] args) {

	 
		for(int i : solution(3,11)){
			System.out.println(i);
		}
	        
	}
}
