import java.io.BufferedReader;
import java.io.InputStreamReader;
class Heap{
	private int heapSize; 
	public int[] itemHeap; 
	public Heap(){
		heapSize=0; 
		itemHeap = new int[10]; 
	}
	
	public void insertHeap(int item){
		int i = ++heapSize;
		
		if( (i!=1)&&(item>itemHeap[i/2])){
			itemHeap[i] = itemHeap[i/2]; 
			i=i/2; 
		}
		itemHeap[i]=item; 
	}
	
	public int deleteHeap(){
		
		int parent , child; 
		int temp , item; 
		
		item  =itemHeap[1]; 
		temp = itemHeap[heapSize--];
		parent = 1; 
		child   = 2; 
		
		while(child<=heapSize){
			
			
			if((child < heapSize)&&(itemHeap[child] < itemHeap[child+1])){
				++child; 
			}
			
			if(temp>=itemHeap[child]){break;}
			
			itemHeap[parent] = itemHeap[child]; 
			parent = child; 
			child   =2*child; 
			
		}
		itemHeap[parent] = temp; 
		return item; 
		
		
	}
	
}
public class Practice {
	
	
	
	public static void main(String[] args) throws Exception{
		
		Heap h = new Heap(); 
		h.insertHeap(1);
		h.insertHeap(2);
		h.insertHeap(3);
		System.out.println("나머지 값 : 3%5="+3%5+" 몫 값 : 3/5="+3/5); //답 3 
		System.out.println(4%5); //답 4
		
		System.out.println(h.deleteHeap());
		System.out.println(h.deleteHeap());
		System.out.println(h.deleteHeap());
		
		System.out.println("========================");
		int x = 26 ; 
		int[] arr = new int[30001]; 
		
		for(int i=2; i<=x; i++){
			arr[i] = arr[i-1]+1; 
			
			if(i%2==0){
				arr[i] = Math.min(arr[i],arr[i/2]+1);
			}else if(i%3==0){
				arr[i] = Math.min(arr[i],arr[i/3]+1);
			}else if(i%5==0){
				arr[i] = Math.min(arr[i],arr[i/5]+1);
			}
		
		}
		System.out.println(arr[x]);
	
		
	}
}

