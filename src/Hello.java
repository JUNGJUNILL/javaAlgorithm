import java.math.BigInteger;
import java.util.*;
import java.util.concurrent.SynchronousQueue;

import javax.swing.text.Position;

import Algorithm_basic_Top10.DFS;

public class Hello {
	

	static boolean[] broken=new boolean[10]; 

	static int possible(int c){
		
		
		int len=0; 
		//104 
		//4 broken[4]==false len+=1
		//0 broken[0]==false len+=1
		//1 broken[1]==false len+=1
		//len==1; 
		
		//5455
		//5 broken[5]==false
		//4 broken[4]==false
		//5 broken[5]==false
		//5 broken[5]==false
		//len=4 
		
		//4>0 true
		//int press= 5455-5457=-2
		//-2 < 0 true
		//press=2; 
		//ans = 5357
		//5357 > 4+2 true
		//ans = 4+2 6
		
		
		while(c>0){
			
			
			if(broken[c % 10]){
				return 0; 
			}
			len+=1;
			c/=10; 
			
			
		}
		return len;
	}
	
	
	public static void main(String[] args) {

		int num=5457;
		broken[6]=true;
		broken[7]=true;
		broken[8]=true;
		

		System.out.println(possible(99));
		
		//99
		
	}
}
