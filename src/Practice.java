
import java.util.*;


public class Practice {

	public static void main(String[] args) {
		
		HashSet<Integer> set=new HashSet<>(); 
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(4);
		set.add(4);

	System.out.println("set.size()="+set.size());
		
		HashMap<Integer,String> hashMap=new HashMap<>(); 
		hashMap.put(1, "���");
		hashMap.put(2, "����");
		hashMap.put(3, "����");
		hashMap.put(3, "����");
		hashMap.put(3, "����");
		
		for(int i=0; i<hashMap.size(); i++){

			System.out.println(hashMap.get(i+1));
		}
		
	}
}