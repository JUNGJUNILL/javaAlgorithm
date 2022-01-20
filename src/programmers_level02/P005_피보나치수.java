package programmers_level02;

import java.util.ArrayList;

public class P005_피보나치수 {

	//1 1 2 3 5 8 13 21 34 55 

	static ArrayList<Integer> list = new ArrayList<>(); 
	
	static int solution(int n){
		list.add(0,1);
		list.add(1,1);
		list.add(2,1); 
		
		for(int i=3; i<=n; i++){
			int sum = (list.get(i-1)+list.get(i-2))%1234567;
			list.add(i,sum); 
		}
		return list.get(n);
	
	}
	
	//https://programmers.co.kr/learn/courses/30/lessons/12945
	public static void main(String[] args) {
		
		System.out.println(solution(100));
	}

}
