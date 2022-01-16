
import java.util.*;
import java.util.concurrent.SynchronousQueue; 


public class Practice {

	public static void main(String[] args) {

		String str05 = "영영영일일일이이이삼사오"; 
		Queue<Character> q=new LinkedList<Character>(); 
		
		
		for(int i=0; i<str05.length(); i++){
			
			if(!q.contains(str05.charAt(i))){
				q.add(str05.charAt(i));
			}
			
		}
		System.out.println(q.size());
		
		while(!q.isEmpty()){
			System.out.print(q.poll());
		}
		
		
	}
}