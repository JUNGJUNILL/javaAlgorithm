package datastructure_Hash;

import java.util.*;

public class P001_map {

	public static void main(String[] args) {
		
		//Map 중복 데이트 넣을 수 없다.
		//중복인 경우 덮어쓰여진다.
		Map<String,String> map1=new HashMap<>(); 
		map1.put("a", "A");
		map1.put("a", "AA");
		map1.put("b", "B");
		System.out.println(map1.get("a"));
		System.out.println(map1.get("b"));
		System.out.println(map1.get("A"));
		System.out.println(map1.keySet());
		
		//키에 해당하는 값만 가질 경우 
		for(String key : map1.keySet()){
			System.out.println(map1.get(key));
		}
		
		//키와 밸류 둘다 필요할 경우 
		for(Map.Entry<String, String> book : map1.entrySet()){
			System.out.println("key="+book.getKey()+" value="+book.getValue());
		}
		System.out.println("====================");
		
		   List<String> list = new ArrayList<>();
		    list.add("a");
		    list.add("b");
		    list.add("c");
		    list.add("c");
		    list.add("c");
		    list.add("d");
		    Map<String, Integer> map = new HashMap<>();

		    for (String temp : list) {
		    	Integer count = map.get(temp); 
		    	map.put(temp , (count==null) ? 1:  count+1); 
	    	}
		    
		    //뭔진 모르지만, 1이상인 경우는 중복된 경우의 수인 것이다
			for(String key : map.keySet()){
				System.out.println(map.get(key));
			}

		  //중복데이터만 걸러진다.
		  for (Map.Entry<String, Integer> entry : map.entrySet()) {
			  	if(Integer.parseInt(entry.getValue().toString()) > 1  ){
			  		System.out.println("Element : " + entry.getKey() + " Count : " + entry.getValue());	
			  	}
		    }
			
		
//		    Map<String, Integer> map = new HashMap<>();
//	
//		    }
		
	}

}
