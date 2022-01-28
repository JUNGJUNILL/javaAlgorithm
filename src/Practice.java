
import java.util.*;


public class Practice {

	static int isPrime(int x){
		if(x<2) return 0; 
		if(x==2) return x; 
		
		for(int i=2; i<x; i++){
			if(x % i==0) return 0;
		}
		return x; 
	}
	static int value; 
	static int[] array=new int[value+1]; 
	
	static int isPrime02(int x){
		value=x; 
		int answer=0; 
		int[] array=new int[x+1]; 
		
		for(int i=2; i<=x; i++){
			
			if(array[i]==0){
				
				for(int j=2; j*i<=x; j++){
					array[j*i]=j; 
				}
				//System.out.println(i);
				answer++; 
			}
			
		}
		
		return answer; 
		
		
	}
	public static void main(String[] args) {

		System.out.println(isPrime02(10));
		
		for(int i=0; i<array.length; i++){
			if(array[i]==0){
				System.out.println(i);
			}
		}
		
		
		
		
	}
}