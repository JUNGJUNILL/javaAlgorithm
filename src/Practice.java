
import java.util.*;

class Model{
	private String delaerCode;
	private String materialCode;
	
	public Model(String dealerCode, String materialCode){
		this.delaerCode=dealerCode; 
		this.materialCode = materialCode; 
	}
	
	public String getDelaerCode() {
		return delaerCode;
	}
	public void setDelaerCode(String delaerCode) {
		this.delaerCode = delaerCode;
	}
	public String getMaterialCode() {
		return materialCode;
	}
	public void setMaterialCode(String materialCode) {
		this.materialCode = materialCode;
	}
	
	
	
}
public class Practice {

	

	
	public static void main(String[] args) {
		   List<String> list = new ArrayList<>();
		    list.add("a");
		    list.add("b");
		    list.add("c");
		    list.add("d");
		    list.add("b");
		    list.add("c");
		    list.add("a");
		    list.add("a");
		    list.add("a");
		    
		    for(int i=0; i<list.size(); i++){
		    	System.out.println(list.get(i)); 
		    }

		    Map<String, Integer> map = new HashMap<>();
		    for (String temp : list) {
		        Integer count = map.get(temp);
		        map.put(temp, (count == null) ? 1 : count + 1);
		    }
		    printMap(map);
		}

		private static void printMap(Map<String, Integer> map){
		    List<List<String>> secondStrings = new ArrayList<>();
		    for (Map.Entry<String, Integer> entry : map.entrySet()) {
		        System.out.println("Element : " + entry.getKey() + " Count : " + entry.getValue());
		        secondStrings.add(makeArray(entry.getKey(), entry.getValue()));
		    }
		   // System.out.println(secondStrings.toString());
		}

		private static List<String> makeArray(String key, Integer value){
		    List<String> firstStrings = new ArrayList<>();
		    for (int i = 0; i < value; i++) {
		        firstStrings.add(key);
		    }
		    return firstStrings;
		}
}




