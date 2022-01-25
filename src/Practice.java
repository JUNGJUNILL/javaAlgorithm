
import java.util.*;


public class Practice {

	public static void main(String[] args) {
		
		
		String[] id_list={"muzi", "frodo", "apeach", "neo"}; 		
		String[] report = {"muzi frodo",
								 "apeach frodo",
								 "frodo neo",
								 "muzi neo",
								 "apeach muzi"};
	
		int k=2;
		HashMap<String,Integer> hashMap= new HashMap<>();
		int n = id_list.length; 

		HashSet<Integer>[] s=new HashSet[n]; 
		
		for(int i=0; i<n; i++){
			s[i]=new HashSet<>();
		}
		int[] answer=new int[n]; 

		for(int i=0; i<n; i++){
			hashMap.put(id_list[i], i); 
		}
		
		
	}
}