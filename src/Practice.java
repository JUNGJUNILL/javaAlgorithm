
import java.util.*;


public class Practice {

	//https://programmers.co.kr/learn/courses/30/lessons/12933
	public static void main(String[] args) {
		
		String str=""; 
		
		str="정"+str; //정""
		str="준"+str; //정""+"준"+정""
		//준정 
		System.out.println(str);

		String answer=""; 
		int n=10; 
		String[] number={"4","1","2"}; 
		
		while(n>0){
			answer = number[n % 3] + answer; 
			//answer = number[1] + answer; 
			//answer = "1"+""; 
			//answer = "1"
			
			//answer = number[0] + answer; 
			//answer = "4"+"1"+""
			//answer = 41 
			
			
			n= (n-1) / 3; 	
			//n = 9 / 3
			//n=3 
			
			//n = 2 / 3; 
			//n = 0 
			//end of while
			
			
		}
		
		
		
	}
}