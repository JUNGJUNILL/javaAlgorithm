package Algorithm_nano;

import java.util.ArrayList;

public class P015_ArrayList {
	
	public static ArrayList<Integer>[] list02; 

	public static void main(String[] args) {

		ArrayList<Integer> list=new ArrayList<>(); 
		list.add(0); 
		list.add(1); 
		list.add(2); 
	
		//향상된 for문을 사용할 수 있다. 
		for(int i : list){
			System.out.println(i);
		}
		System.out.println("---------------------------");
		
		//이런식으로 ArrayList 배열을 만들 수 있다. 
		list02[0] = new ArrayList<Integer>(); 
		
		
	}
}
