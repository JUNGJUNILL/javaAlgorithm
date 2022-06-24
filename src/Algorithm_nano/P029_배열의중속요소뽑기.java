package Algorithm_nano;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class P029_배열의중속요소뽑기 {

	public static void main(String[] args) {
		
		//배열의 중복요소만 뽑기(신기하네)
		int[] arr1 ={0,0,1,1,1,2,2,3,3,4}; 
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
		System.out.println("set.size="+set.size());
		while(iter.hasNext()){
			System.out.print(iter.next()+ " ");
		}
		
		
		System.out.println();
		System.out.println("----------------------------");
		
		
		//배열에 중복 요소가 있는지 없는지?
		int[] arr2 ={1,1,2,2,3,4,4,5,5,5,6,6,7,7,7,7,8}; 
		int len = arr2.length-1; 
		boolean result=false;
		ArrayList<Integer> list = new ArrayList<>(); 
		
		for(int i=0; i<len; i++){
			
			if(arr2[i] == arr2[i+1]){
				result=true; 
				list.add(arr2[i]); 
			}

		}
		
		System.out.println(result);
		
		//배열에 중복 요소가 있다면...
		if(result){
			Queue<Integer> q=new LinkedList<Integer>(); 
			for(int i : list){
				
				if(!q.contains(i)){
					q.add(i); 
				}
				
			}
			
			while(!q.isEmpty()){
				System.out.print(q.poll()+" ");
			}
			
		}
		

		
		
		
		
		
		

	}

}
