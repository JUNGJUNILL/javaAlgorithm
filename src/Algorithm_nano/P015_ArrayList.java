package Algorithm_nano;

import java.util.ArrayList;

public class P015_ArrayList {
	
	public static ArrayList<Integer>[] list02; 

	public static void main(String[] args) {

		ArrayList<Integer> list=new ArrayList<>(); 
		list.add(0); 
		list.add(1); 
		list.add(2); 
	
		//���� for���� ����� �� �ִ�. 
		for(int i : list){
			System.out.println(i);
		}
		System.out.println("---------------------------");
		
		//�̷������� ArrayList �迭�� ���� �� �ִ�.
		list02=new ArrayList[2];
		list02[0] = new ArrayList<Integer>(); 
		list02[0].add(1);
		list02[0].add(2);
		list02[0].add(3);
		
		for(int i : list02[0]){
			System.out.println("����="+i);
		}
		System.out.println("---------------------------");

		ArrayList<Integer>[] list03=new ArrayList[4]; 
		list03[0].add(2); 
		list03[3].add(2); 
		list03[3].add(1);
		list03[0].add(1); 
		
	}
}
