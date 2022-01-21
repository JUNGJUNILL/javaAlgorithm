package programmers_level01;

import java.util.Arrays;

public class P007_제일작은수제거하기 {
	
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
		//가장 작은 수를 뽑으려면 일단 배열의 모든 요소를 검사해야해.. 
		System.out.println(min);
		
	}
}
