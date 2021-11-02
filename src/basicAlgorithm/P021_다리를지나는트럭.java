package basicAlgorithm;

import java.util.LinkedList;
import java.util.Queue;

//https://programmers.co.kr/learn/courses/30/lessons/42583
//https://minhamina.tistory.com/241
public class P021_다리를지나는트럭 {
	static int sum=0;
	static int time=0; 
	public static int solution(int bridge_length, int weight, int[] truck_weights){
		
		Queue<Integer> q = new LinkedList<>();
	
		for(int i=0; i<truck_weights.length; i++){
			
			int truck = truck_weights[i]; 
	
			while(true){
				
				if(q.isEmpty()){//큐에 아무것도 없는 경우 
					q.add(truck); 
					sum = sum+truck; 
					time++; 	//다리에 오를 때만 시간 추가 
					break; 
					
				}else if(q.size() == bridge_length){//큐에 다리 길이만큼 트럭이 다 찬 경우 					
					sum = sum-q.poll(); 
					
				}else{//다리 길이만큼 큐가 차지않았음 
					if(sum + truck <= weight){
						
						q.add(truck); 
						sum = sum+truck;  
						time++; 
						break; 
					}else{
						q.add(0); 
						time++; 
					}	
				}
			}
		}
		
		return time + bridge_length; 
	}

	public static void main(String[] args) {

		int[] arr={7,4,5,6};
		System.out.println(solution(2,10,arr));
	
	}

}
