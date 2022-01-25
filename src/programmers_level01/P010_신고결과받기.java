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
		//중복포함 x 
		
		String[] id_list={"muzi", "frodo", "apeach", "neo"}; 		
		String[] report = {"muzi frodo",
								 "apeach frodo",
								 "frodo neo",
								 "muzi neo",
								 "apeach muzi"};
		int k=2;
		
		//HashMap 
		//비동기 
		//중복값 o , key  중복  x 
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
		 
		for(String rep : report){
			String[] idlist=rep.split(" "); 
			int id1 = hashMap.get(idlist[0]);
			int id2 = hashMap.get(idlist[1]);
			s[id2].add(id1); 
		}
		
		System.out.println("s[0].size()="+s[0].size());
		System.out.println("s[1].size()="+s[1].size());
		System.out.println("s[2].size()="+s[2].size());
		System.out.println("s[3].size()="+s[3].size());
		
		
		for(int i=0; i<s.length; i++){
			for(int j=0; j<s[i].size(); j++){
				Iterator iter = s[i].iterator();
				while(iter.hasNext()){
					//System.out.println("hello="+"i="+i+" "+iter.next());
				}
			}
			System.out.println("--------------");
		}
		
		
		for(int i=0; i<n; i++){
			if(s[i].size() < k) {
				System.out.println("i="+i);
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
