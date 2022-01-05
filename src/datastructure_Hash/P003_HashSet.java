package datastructure_Hash;

import java.util.HashSet;
import java.util.Iterator;

public class P003_HashSet {

	public static void main(String[] args) {

		//중복 저장 안함 
		//저장 순서가 유지 되지 않음
		HashSet<Integer> set =new HashSet<Integer>(); 
	
		set.add(1); 
		set.add(2); 
		set.add(3);
		
		Iterator<Integer> iter = set.iterator(); 
		
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		
	
		
	}

}
