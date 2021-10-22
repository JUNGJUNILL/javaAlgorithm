package codility;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class P003_P002_Array_정답 {

	public static void main(String[] args) {

		//중복 데이터를 넣을 수 없는 HashSet 자료구조를 이용한다. 
		int[] A =new int[7]; 
		
		A[0]=9;
		A[1]=3;
		A[2]=9;
		A[3]=3;
		A[4]=9;
		A[5]=7;
		A[6]=9; 
		
		
		int anwer=0; 
		HashSet<Integer> hs = new HashSet<Integer>(); 
		for(int i=0; i<A.length; i++){
			if(hs.contains(A[i])){
				hs.remove(A[i]); 
			}else{
				hs.add(A[i]); 
			}
		}
		
		Iterator<Integer> itor=hs.iterator(); 
		while(itor.hasNext()){
			anwer=itor.next(); 
		}
		System.out.println("anwer="+anwer);
		ArrayList<Integer> al = new ArrayList<>(hs);
		
		System.out.println("al.get(0)="+al.get(0));
		
		//뭐 비트연산자? 이걸로 된다고 하는데 오늘 공부할 예정이다.
		//https://jobjava00.github.io/algorithm/codility/lesson2/OddOccurrencesInArray/
		
	}

}
