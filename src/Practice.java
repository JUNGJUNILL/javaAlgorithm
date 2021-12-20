
import java.util.*;
public class Practice {


	static int binarySearch(int[] arr, int key){
		
		int start = 0; 
		int end  = arr.length-1; 
		
		while(start<=end){
			
			int mid = (start+end) / 2; 
			
			if(key<arr[mid]){
				end=mid-1; 
			}else if(key>arr[mid]){
				start=mid+1; 
			}else{
				return mid; 
			}
		}
		
		return -1; 
	}
	
	public static void main(String[] args) {

		int[] arr={1,2,3}; 
		
		for(int i=1; i<=arr.length; i++){
			if(binarySearch(arr, i)>=0){
				System.out.println(i+" ´Â ÀÖÀ½");
			}
		}
		
		
	}
}




