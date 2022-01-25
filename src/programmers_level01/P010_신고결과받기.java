package programmers_level01;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class P010_신고결과받기 {

	//java Collections framework 좀 공부해야겠다...
	public static void main(String[] args) {
		//List 
		//순서유지 o 
		//중복포함 o 
		
		//Set
		//중복포함 x 
		
		//Map
		//key, value로 구성 
		//key 중복 x , value 중복 o
		
		String[] id_list={"muzi", "frodo", "apeach", "neo"}; 		
		String[] report = {"muzi frodo",
								 "apeach frodo",
								 "frodo neo",
								 "muzi neo",
								 "apeach muzi"};
		int k=2;
		
		//HashMap 
		//비동기 
		//key  중복  x, value 중복 o ,  
		//null 허용 
		//순서유지 x 
		
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
		 
		//각 사용자별로 
		//나를 신고한 사람이 몇명인지, 누구인지 재정의함 
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
