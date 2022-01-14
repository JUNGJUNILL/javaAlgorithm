
import java.util.*; 


public class Practice {
	
	static void Recursive(int x){
		if(x==0) return; 
		Recursive(x-1);
		System.out.println(x);
	}
	
	public static void main(String[] args) {

		Recursive(10);
		
		int a=10;
		int b=20;
		int c=30;
	}
}