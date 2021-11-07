package datastructure_Tree;

class MinHeap{
	
	private int   heapSize; 
	public int[] itemHeap ; 
	
	
	public MinHeap(){
		heapSize = 0; 
		itemHeap =new int [50]; 		
	}

	
	//INSERT
	public void insertMinHeap(int item){
		int i = heapSize = heapSize+1;
		
						  //삽입한 키 값과 부모노의 키값을 비교하여
						  //삽입한 값이 부모노드보다 작으면 둘의 위치를 바꾸는 로직
		while( (i !=1) && (item < itemHeap[i/2]) ){
			itemHeap[i] = itemHeap[i/2];
			i=i/2;
		}

		itemHeap[i] =item;
		
	}
	
	
	
	//DELETE
	public int deleteMinHeap(){
		int parent , child; 
		int item, temp; 
		
		item = itemHeap[1]; 
		temp = itemHeap[heapSize--];
		//후위 얀신지
		//후위 연산자는 다른 변수에 현재 값을 저장하고 변수 값을 1 증가/감소하고 이전에 저장된 값을 반환한다.
		//int a=1; 
		//int temp = a; 
		//a=a-1 
		//a-- --> return 1; 반환
		
		
		parent = 1; child = 2; 
		
		while(child <= heapSize){
						
			if( (child < heapSize) && (itemHeap[child]>itemHeap[child+1]) ){
				child = child +1;
			}
			
			if(temp <= itemHeap[child]){break;}
			
			itemHeap[parent] =itemHeap[child]; 
			parent = child; 
			child = child*2;	
		}
		
		itemHeap[parent]=temp;
		return item;
	
	}
	
	
	public int getHeapSize(){
		return this.heapSize;
	}
	
	
	public void printHeap(){
		System.out.printf("\nHeap >>> ");
		for(int i=1; i<=heapSize; i++){
			System.out.printf("[%d] ",itemHeap[i]);
		}
		System.out.println();
	}
	
}


public class P004_MinHeap {

	public static void main(String[] args) {
		int n , item;
		MinHeap h= new MinHeap(); 
		for(int i=5; i>=1; i--){
			h.insertMinHeap(i);
		}
		h.printHeap();		
		System.out.println("min heap="+h.deleteMinHeap());
		
		h.printHeap();
		System.out.println("min heap="+h.deleteMinHeap());
		
		h.printHeap();
		System.out.println("min heap="+h.deleteMinHeap());
		
		h.printHeap();
		System.out.println("min heap="+h.deleteMinHeap());
		
		h.printHeap();
		System.out.println("min heap="+h.deleteMinHeap());

		
	}

}
