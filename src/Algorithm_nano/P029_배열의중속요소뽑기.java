package Algorithm_nano;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
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
		
		
		System.out.println("----------------------------");

		
		ArrayList<String> a_list=new ArrayList<>(); 
		Map<String, Integer> a_map=new HashMap<String, Integer>();
		
		a_list.add("1");
		a_list.add("1");
		a_list.add("1");
		
		a_list.add("2");
		a_list.add("2");
		a_list.add("2");
				
		a_list.add("3");
		a_list.add("3");
		
		a_list.add("4");
		a_list.add("5");
		a_list.add("6");
		
		for(String i : a_list){
			Integer count = a_map.get(i); 
			a_map.put(i, (count==null) ? 1 : count+1); 
			
			
		}
		
	  ArrayList<String> aList=new ArrayList<String>(); 
	  for (Map.Entry<String, Integer> entry : a_map.entrySet()) {
		  	if(Integer.parseInt(entry.getValue().toString()) > 1  ){
		  		aList.add("품목코드 : "+entry.getKey().toString()+" , "+entry.getValue().toString()+" 건의 중복자료 발견");
		  	}
	    }
		
		
	  for(String str : aList){
		  System.out.println(str);
	  }
		
		

	}

}
