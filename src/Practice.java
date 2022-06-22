
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
public class Practice {
	
	//1 2 3 5 2 5return false; 
	  public static boolean validMountainArray(int[] A) {
		  
		  if(A==null || A.length <3) return false; 
		  
		  boolean result = A[0] < A[1]; 
		  if(!result) return result;  
		  		  
		  for(int i=1; i<A.length; i++){
			  
			  if(A[i] == A[i-1]) return false; //연속된 수가 나올 경우 
		
			  if(result){
				  
				  if(A[i] < A[i-1]) result=false; 
				  //i==1 
				  //a[1]=2 < a[0]=1 false
				
				  //i==2 
				  //a[2]=3 < a[1]=2 false
				  
				  //i==3
				  //a[3]=5 < a[2]=3 false 
				  
				  //i==4
				  //a[4]=2 < a[3]=5 true -> result=false;
	
				  
			  }else{
				
				  if(A[i] > A[i-1]) return false; 
				  //i==5 
				  //a[5]=5 > a[4]=2 return false; 종료
				  
			  }
			  
			  
			  
		  }
		  
		  return !result; 
	  }

	public static void main(String[] args) {

	
		
	}
}