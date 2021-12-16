package Algorithm_nano;

import java.util.ArrayList;

public class P015_ArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> list=new ArrayList<>(); 
		list.add(0); 
		list.add(1); 
		list.add(2); 
	
		//향상된 for문을 사용할 수 있다. 
		for(int i : list){
			System.out.println(i);
		}
		
	}
}
