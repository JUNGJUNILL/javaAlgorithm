package programmers_level01;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class P010_�Ű����ޱ� {

	//java Collections framework �� �����ؾ߰ڴ�...
	public static void main(String[] args) {
		//List 
		//�������� o 
		//�ߺ����� o 
		
		//Set
		//�ߺ����� x 
		
		//Map
		//key, value�� ���� 
		//key �ߺ� x , value �ߺ� o
		
		String[] id_list={"muzi", "frodo", "apeach", "neo"}; 		
		String[] report = {"muzi frodo",
								 "apeach frodo",
								 "frodo neo",
								 "muzi neo",
								 "apeach muzi"};
		int k=2;
		
		//HashMap 
		//�񵿱� 
		//key  �ߺ�  x, value �ߺ� o ,  
		//null ��� 
		//�������� x 
		
		HashMap<String,Integer> hashMap= new HashMap<>();
	
		
		int n = id_list.length; 
		HashSet<Integer>[] s=new HashSet[n]; 
		
		for(int i=0; i<n; i++){
			s[i]=new HashSet<>(); 
		}
		
		int[] answer=new int[n]; 
		/*
		 	String[] report = {"muzi frodo",
								 "apeach frodo",
								 "frodo neo",
								 "muzi neo",
								 "apeach muzi"};
		 */
		for(int i=0; i<n; i++){
			hashMap.put(id_list[i], i); 
		}
		 
		//�� ����ں��� 
		//���� �Ű��� ����� �������, �������� �������� 
		for(String rep : report){
			String[] idlist=rep.split(" "); 
			int id1 = hashMap.get(idlist[0]);
			int id2 = hashMap.get(idlist[1]);
			s[id2].add(id1); 
		}

	
		
		for(int i=0; i<n; i++){
			if(s[i].size() < k) {
				continue; 
			}
			for(int x : s[i]){
				answer[x]=answer[x]+1;  
			}
		}
		
		for(int i : answer){
			System.out.println(i);
		}
		

		
	}

}
