import java.math.BigInteger;
import java.util.*;
import java.util.concurrent.SynchronousQueue;

import javax.swing.text.Position;

import Algorithm_basic_Top10.DFS;

public class Hello {

	
	static int factorial(int x){
		
		if(x==0)return 1; 
		return x*factorial(x-1); 
		
	}
	public static void main(String[] args) {

		System.out.println(factorial(5));
		
	}
}
