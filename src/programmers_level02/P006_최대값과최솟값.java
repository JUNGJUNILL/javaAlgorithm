package programmers_level02;

import java.util.StringTokenizer;


public class P006_최대값과최솟값 {

	
    public static String solution(String s) {
        String answer = "";
        int Max=Integer.MIN_VALUE; 
        int Min=Integer.MAX_VALUE; 
  
        String[] array = s.split(" "); 
        for(int i=0; i<array.length; i++){
        	Max =Max < Integer.parseInt(array[i]) ? Integer.parseInt(array[i]) : Max; 
        	Min =Min > Integer.parseInt(array[i]) ? Integer.parseInt(array[i]) : Min; 
        }
        answer=Min+" "+Max;
        
        return answer;
    }
	
	//https://programmers.co.kr/learn/courses/30/lessons/12939
	public static void main(String[] args) {
	
		System.out.println(solution("-1 -2 -3 -4"));

	}
}