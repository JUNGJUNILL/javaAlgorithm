package programmers_level01;

import java.util.Arrays;

public class P007_���������������ϱ� {
	
    public static int[] solution(int[] arr) {
        int[] answer =new int[arr.length-1]; 
    	int min = Integer.MAX_VALUE; 
		for(int i : arr){
			min = min > i ? i : min; 
		}
	
	
 
      
      return answer;   
        
    }
	
	//https://programmers.co.kr/learn/courses/30/lessons/12935
	public static void main(String[] args) {
		
		int[] arr={10};
		int min = Integer.MAX_VALUE; 
		for(int i : arr){
			min = min > i ? i : min; 
		}
		//���� ���� ���� �������� �ϴ� �迭�� ��� ��Ҹ� �˻��ؾ���.. 
		System.out.println(min);
		
	}
}
