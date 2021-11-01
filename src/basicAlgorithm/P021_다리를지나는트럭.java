package basicAlgorithm;

import java.util.LinkedList;
import java.util.Queue;

//https://programmers.co.kr/learn/courses/30/lessons/42583
public class P021_다리를지나는트럭 {

	public static void main(String[] args) {

		
		//큐는 선입선출입니다. 
		Queue<Integer> q = new LinkedList<>(); 
		
		int temp=0; 
		
		
		int[] array = new int[4];
		array[0]=7;
		array[1]=4;
		array[2]=5;
		array[3]=6;

		int bridge_length =2; 
		
		int[] bridgeArray = new int[bridge_length]; 
		int weight =10;
		
		for(int i=0; i<array.length; i++){
			q.add(array[i]); 
		}
		
		
		int checkWeight=0;
		int check=0; 

		
		while(!q.isEmpty()){
		
		
		}
	}

}
