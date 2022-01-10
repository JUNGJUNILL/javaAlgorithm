
import java.util.*; 


public class Practice {

	public static void main(String[] args) {
		
		int[] arr = {20,7,23,19,10,15,25,8,13};  
		
		
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
		
				if(140 - arr[i]-arr[j] ==100){	
					System.out.println(arr[i]+" : "+arr[j]);
				}
			}
		}
	}
}