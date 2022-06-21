package Algorithm_nano;

import java.util.HashSet;
import java.util.Iterator;

public class P028_배열의중복값제거 {

	public static void main(String[] args) {

		int[] arr ={1,1,2,2,3,4,4,5,5,5,6,6,7,7,7,7,8}; 

		
		int len = arr.length-1;
		int count=1; 
		
		for(int i=0; i<len; i++){
			
			if(arr[i] != arr[i+1]){
				arr[count++] = arr[i+1]; 
			}
		}
		
		
		for(int i=0; i<count; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		
		
		//배열의 중복요소 뽑기(신기하네)
		int[] arr1 ={1,1,2,2,3,4,4,5,5,5,6,7,7,7,7,8}; 
		HashSet<Integer> set = new HashSet<>(); 

		
		for(int i=0; i<arr1.length; i++){
				
				for(int j=0; j<arr1.length; j++){
					
					//i == 0 -> arr1[1], arr1[2], arr1[3] 
					//i == 1 -> arr1[0], arr1[2], arr1[3] 
					//i == 2 -> arr1[0], arr1[1], arr1[3] 
					//i == 3 -> arr1[0], arr1[1], arr1[2] 
					if(i != j){
						if(arr1[i] == arr1[j]){
						   set.add(arr1[i]); 
						
						}
					}

				}
			}
		
		Iterator<Integer> iter = set.iterator(); 
		
		while(iter.hasNext()){
			System.out.print(iter.next()+ " ");
		}
		

		
		
		
		
	}
	
	
	
	

}
