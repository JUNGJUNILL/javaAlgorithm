
import java.util.*;


public class Practice02 {

	public static void main(String[] args) throws Exception {
		
		List<Integer> list1 = new ArrayList<>(Arrays.asList(2, 3, 4));
		List<Integer> list2 = new ArrayList<>(Arrays.asList(2, 3, 4));
		// ���ؼ� �ߺ��� ã��
		list1.retainAll(list2);
		// ��� ���
		System.out.println(list1); // [2, 3]
		
		for(int i=0; i<list1.size(); i++){
			System.out.println(list1.get(i));
		}
		System.out.println(list2); // [2, 3, 4]

	}
}