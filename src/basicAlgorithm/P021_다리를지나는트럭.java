package basicAlgorithm;

import java.util.LinkedList;
import java.util.Queue;

//https://programmers.co.kr/learn/courses/30/lessons/42583
//https://minhamina.tistory.com/241
public class P021_�ٸ���������Ʈ�� {
	static int sum=0;
	static int time=0; 
	public static int solution(int bridge_length, int weight, int[] truck_weights){
		
		Queue<Integer> q = new LinkedList<>();
	
		for(int i=0; i<truck_weights.length; i++){
			
			int truck = truck_weights[i]; 
	
			while(true){
				
				if(q.isEmpty()){//ť�� �ƹ��͵� ���� ��� 
					q.add(truck); 
					sum = sum+truck; 
					time++; 	//�ٸ��� ���� ���� �ð� �߰� 
					break; 
					
				}else if(q.size() == bridge_length){//ť�� �ٸ� ���̸�ŭ Ʈ���� �� �� ��� 					
					sum = sum-q.poll(); 
					
				}else{//�ٸ� ���̸�ŭ ť�� �����ʾ��� 
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
