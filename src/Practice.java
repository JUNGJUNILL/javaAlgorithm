import java.util.*;


public class Practice {
	
	
	
	public static void main(String[] args) throws Exception{

		int[] arr = {1,2,3,4,5}; 
		
		int k =1; 
		//2,3,4,5,1 
		int[] newArr01 = new int[arr.length]; 
		
		//5,1,2,3,4
		int[] newArr02 =new int[arr.length];		
		
		
		for(int i=0; i<arr.length; i++){
			
			int index = (i+k) % arr.length; 
			//1 2 3 4 0 
			newArr01[i] = arr[index]; 
			newArr02[index] = arr[i]; 
			
		}
		
		for(int n : newArr01){
			System.out.print(n);
		}
		System.out.println();
		for(int n : newArr02){
			System.out.print(n);
		}
		
		
		}
}

