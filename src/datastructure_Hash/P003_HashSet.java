package datastructure_Hash;

import java.util.HashSet;
import java.util.Iterator;

public class P003_HashSet {

	public static void main(String[] args) {

		//�ߺ� ���� ���� 
		//���� ������ ���� ���� ����
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
