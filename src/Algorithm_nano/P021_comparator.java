package Algorithm_nano;

import java.util.Arrays;
import java.util.Comparator;

public class P021_comparator {

	public static void main(String[] args) {
		
		//특정 문자열을 기준으로 정렬 할 수 있다. 
		String[] records ={
				 //time carNo flag 
				 "05:34 5961 IN", 
				 "06:00 0000 IN", 
				 "06:34 0000 OUT", 
				 "07:59 5961 OUT", 
				 "07:59 0148 IN", 
				 "18:59 0000 IN", 
				 "19:09 0148 OUT", 
				 "22:59 5961 IN", 
				 "23:00 5961 OUT"
				 };
		
		//특정 문자열을 기준으로 오름차순 해보자. 
		Arrays.sort(records, new Comparator<String>() {
			
			@Override
			public int compare(String s1, String s2) {
				return s1.split(" ")[1].compareTo(s2.split(" ")[1]); 
			}
		});

		
		for(String s : records){
			System.out.println(s);
		}
	}

}
