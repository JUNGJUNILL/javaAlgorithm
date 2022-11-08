package programmers_level02;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class P002_JadenCase문자열만들기 {

	
     static String solution(String s) {
        String answer ="";
        StringTokenizer token =new StringTokenizer(s.toLowerCase()," ",true); 
        ArrayList<String> list=new ArrayList<>(); 
        while(token.hasMoreElements()){
        	list.add(token.nextElement().toString()); 
        }
        
        for(String str : list){
        	str = 	str.substring(0,1).toUpperCase()+str.substring(1);
        	answer+=str;
        	
        }
        return answer;
    }
	
	//https://programmers.co.kr/learn/courses/30/lessons/12951
	public static void main(String[] args) {

		
    String answer = "3people unFollowed me".toLowerCase();
    System.out.println(solution(answer));
    
    System.out.println(Integer.MAX_VALUE);
    System.out.println(Long.MAX_VALUE);
   
    
    
    
    
    
		
	}

}
