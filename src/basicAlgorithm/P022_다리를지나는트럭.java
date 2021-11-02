package basicAlgorithm;
import java.util.*;

public class P022_�ٸ���������Ʈ�� {

	public static void main(String[] args) {
		
		Solution s = new Solution();
		int[] arr = {7,4,5,6}; 
		
		System.out.println(s.solution(2, 10, arr));

	}

}

class Solution{
	
	class Truck{
		
		int weight; 
		int move; 
		
		public Truck(int weight){
			this.weight = weight; 
			this.move   = 1; 
		}
		
		public void moving(){
			move++; 
		}
	}
	
	
	public int solution(int bridgeLength , int weight, int[] truckWeights){
		
		Queue<Truck> waitQ = new LinkedList<>();
		Queue<Truck> moveQ = new LinkedList<>();
			
		for(int t : truckWeights){
			waitQ.offer(new Truck(t)); 
		}
		
		int answer=0; 
		int curWeight=0; 
		
		while( !waitQ.isEmpty() || !moveQ.isEmpty() ){
			answer++; 
			
			if(moveQ.isEmpty()){
				Truck t = waitQ.poll(); 
				curWeight += t.weight;
				moveQ.offer(t); 
				continue; 
			}
			
			for(Truck t : moveQ){
				t.moving();
				
			}
			
			if(moveQ.peek().move > bridgeLength){
				Truck t =moveQ.poll(); 
				curWeight-=t.weight; 
			}
			
			if( !waitQ.isEmpty() && curWeight + waitQ.peek().weight <= weight ){
				Truck t = waitQ.poll(); 
				curWeight += t.weight; 
				moveQ.offer(t); 
			}	
		}
		
		return answer; 
	}
	
	
	
	
}