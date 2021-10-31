package basicAlgorithm;

import java.util.Scanner;

class Heap01 {

	 private int heapSize; 
	 public int[] itemHeap; 
	 
	 public Heap01(){
		 heapSize = 0; 
		 itemHeap = new int[100001]; 
		 
	 }
	 
	 public void insertHeap(int item){
		 
		 int i = ++heapSize; 
		 
		 if((i != 1)&&(item>itemHeap[i/2])){
			 
			 itemHeap[i] = itemHeap[i/2]; 
			 i= i/2; 
			 
		 }
		 itemHeap[i] = item;  
		 
		 
	 }
	 
	 public int deleteHeap(){
		 
		 	if(heapSize <=0){
		 		return 0; 
		 	}
		 
		 	int parent, child; 
		 	int temp , item; 
		 	
		 	item = itemHeap[1]; 
		 	temp = itemHeap[heapSize--]; 
		 	
		 	parent = 1; 
		 	child   = 2; 
		 	
		 	while(child<=heapSize){
		 		
		 		if( (child<heapSize) &&
		 			(itemHeap[child]<itemHeap[child+1])	
		 		  ){
		 			++child; 
		 		}
		 		
		 		if(temp>=itemHeap[child]){
		 			break; 
		 		}
		 		
		 		itemHeap[parent] = itemHeap[child]; 
		 		parent = child; 
		 		child = child*2; 
	
		 		
		 	}
		 	
		 	itemHeap[parent] = temp;
		 	return item; 
		 	
		 	
		 
	 }
	 	

	 
	 
	 
	 
	
	
}

public class P020_ÃÖ´ëÈü {

	public static void main(String[] args) {

		
		Heap01 h = new Heap01(); 
		StringBuffer bf = new StringBuffer();
		Scanner sc = new Scanner(System.in); 
		int  num= Integer.parseInt(sc.nextLine());  
		
		for(int i=0; i<num; i++){
			
		
			int number = Integer.parseInt(sc.nextLine());  
			
			if(number==0){
				bf.append(h.deleteHeap()); 
			}else{
				h.insertHeap(number); 
			}

		}
		
		for(int i=0; i<bf.toString().length(); i++){
			System.out.println(bf.toString().charAt(i));
		}
		
	
		
	}

}
