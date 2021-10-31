import java.io.BufferedReader;
import java.io.InputStreamReader;
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

public class Practice {
	
	public static void main(String[] args) throws Exception{

	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		int N = Integer.parseInt(br.readLine()); 
		Heap01 h = new Heap01(); 
		StringBuffer bf = new StringBuffer();
		for(int i=0; i<N; i++){
			int val = Integer.parseInt(br.readLine()); 
			if(val==0){
				System.out.println(h.deleteHeap());
			}else{
				h.insertHeap(val);
			}
		}
	
		
		
		
		
	}
}

