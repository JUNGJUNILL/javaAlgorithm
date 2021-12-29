

package datastructure_Hash;

import java.util.*;

public class P002_map {
	
	static ArrayList<String> func(ArrayList<String> list){
		
		ArrayList<String> aList=new ArrayList<>(); 
	    Map<String, Integer> map = new HashMap<>();
	    for (String temp : list) {
	    	Integer count = map.get(temp); 
	    	map.put(temp , (count==null) ? 1:  count+1); 
    	}
	    
		  for (Map.Entry<String, Integer> entry : map.entrySet()) {
			  	if(Integer.parseInt(entry.getValue().toString()) > 1  ){
			  		aList.add("품목코드 : "+entry.getKey().toString()+" , "+entry.getValue().toString()+" 건의 중복자료 발견");
			  	}
		    }
		  aList.add("엑셀 자료를 다시 확인 하시기 바랍니다.");
		  Collections.sort(aList);

		
		return aList; 
	}

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>(); 
		list.add("1001");
		list.add("1001");
		list.add("1002");
		list.add("1002");
		list.add("1002");
		list.add("1002");
		list.add("1003");
		list.add("1004");
		list.add("1005");
		list.add("1005");
		list.add("1005");
		
		func(list); 
		
		if(func(list).size()>0){
			for(String str : func(list)){
				System.out.println(str);
			}
		}
		
		
	}
	
}