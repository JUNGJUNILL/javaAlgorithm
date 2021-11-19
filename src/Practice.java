import java.util.*;

public class Practice {
	


	public static void main(String[] args) throws Exception{

		int[] arr={1,2,3,4,5};
		int k=1; 
		int[] arr01=new int[arr.length]; 
		//2,3,4,5,1
		
		int[] arr02=new int[arr.length]; 
		//5,1,2,3,4
		
		for(int i=0; i<arr.length; i++){
			int index = (k+i) % arr.length; 
			//1,2,3,4,0
			arr01[i] = arr[index]; 
			arr02[index] = arr[i]; 
			
		}
		
		for(int n : arr01){
			System.out.print(n);
		}
		System.out.println();
		for(int n : arr02){
			System.out.print(n);
		}
		
		
		
		
	}
}

