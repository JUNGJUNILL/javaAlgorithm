import java.util.*;


public class Practice {
	
	
	static int binarySearch(int[] array, int key){
		
		int start=0; 
		int end = array.length-1;
		//1,2,3,4,5
		/*
		 start=0; 
		 end=4 
		 
		 0<=4 true 
		 mid = 2
		 
		 array[2]==3 > 2 true end=mid-1, end=1
		 
		  0<=1 true
		  mid = 0
		  array[0]=1 > 2 false 
		  array[0]=1 < 2 true start=mid+1 , start=1 
		  
		  1<=1 true
		  mid =1
		  
		  array[1]==2 > 2 false 
		  array[1]==2 < 2 true 
		  return mid=1 
		  
		  
		 
		 */
		
		while(start<=end){
			int mid = (start+end) / 2; 
			
			//중간에서 해당 키가 왼쪽에 있는 경우 
			if(array[mid] > key){
				end = mid-1; 
				
				
			//중간에서 해당 키가 오른쪽에 있는 경우 
			}else if(array[mid] < key){
				start = mid+1; 
				
			}else{
				return mid;
			}
			
			
		}
		
		
		return -1; 
	}
	

	public static void main(String[] args) {
		
		int[] array ={1,2,3,4,5}; 
		
		if(binarySearch(array, 2)>=0){
			System.out.println(binarySearch(array, 99));
			System.out.println("있음");
		}else{
			System.out.println("없음");
		}
		

	}
}




