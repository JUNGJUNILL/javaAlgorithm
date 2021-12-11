import java.math.BigInteger;
import java.util.*;

import Algorithm_basic_Top10.DFS;

public class Hello {
	

	
	public static void main(String[] args) {

		int num=10;
		for(int i=1; i<=10000; i++){
			
			if(i==num){
				System.out.println(i);
				num*=10; 
			}
			
		}
		
	}
}
