package Algorithm_nano;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class P009_중복문자하나만남기기 {

	public static void main(String[] args) {
		String str05 = "영영영일일일이이이삼사오"; 
		//return 값 영일이삼사오 
		//contains 함수를 활용해서... 재밌다!
		
		
		
		
		
		
		
		
		
		
		
		Queue<Character> q= new LinkedList<Character>(); 
		
		for(int i=0; i<str05.length(); i++){
			
			if(q.contains(str05.charAt(i))){
				q.remove(str05.charAt(i)); 
				q.add(str05.charAt(i)); 
			}else{
				q.add(str05.charAt(i)); 
			}
		}
		
		while(!q.isEmpty()){
			System.out.print(q.poll());
		}
		
	}
	
}
