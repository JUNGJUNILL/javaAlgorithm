package datastructure_Tree;

class Heap{
	
	private int   heapSize; 
	public int[] itemHeap ; 
	
	
	public Heap(){
		heapSize = 0; 
		itemHeap =new int [50]; 
		
	}

	
	//INSERT
	public void insertHeap(int item){
		int i = heapSize = heapSize+1;
		
						  //������ Ű ���� �θ���� Ű���� ���Ͽ�
						  //������ Ű���� �θ��庸�� Ŭ ��� ��ġ�� �ٲٴ� ����
		while( (i !=1) && (item > itemHeap[i/2]) ){
			itemHeap[i] = itemHeap[i/2];
			i=i/2;
		}

		itemHeap[i] =item;
		
	}
	
	//INSERT
	public void insertMinHeap(int item){
		int i = heapSize = heapSize+1;
		
						  //������ Ű ���� �θ���� Ű���� ���Ͽ�
						  //������ ���� �θ��庸�� ������ ���� ��ġ�� �ٲٴ� ����
		while( (i !=1) && (item < itemHeap[i/2]) ){
			itemHeap[i] = itemHeap[i/2];
			i=i/2;
		}

		itemHeap[i] =item;
		
	}
	
	
	
	//DELETE
	//heap�� �� �������� - �������� �� �Ŀ� heap�� ���� �ؾ��ϴ� ���� 
	public int deleteHeap(){
		int parent , child; 
		int item, temp; 
		
		item = itemHeap[1]; 
		temp = itemHeap[heapSize--];
		//���� �����
		//���� �����ڴ� �ٸ� ������ ���� ���� �����ϰ� ���� ���� 1 ����/�����ϰ� ������ ����� ���� ��ȯ�Ѵ�.
		//int a=1; 
		//int temp = a; 
		//a=a-1 
		//a-- --> return 1; ��ȯ
		
		
		parent = 1; child = 2; 
		
		while(child <= heapSize){
						
			if( (child < heapSize) && (itemHeap[child]<itemHeap[child+1]) ){
				child = child +1;
			}
			
			if(temp >= itemHeap[child]){break;}
			
			itemHeap[parent] =itemHeap[child]; 
			parent = child; 
			child = child*2;	
		}
		
		itemHeap[parent]=temp;
		return item;
	
	}
	
	public int deleteMinHeap(){
		int parent , child; 
		int item, temp; 
		
		item = itemHeap[1]; 
		temp = itemHeap[heapSize--];
		//���� �����
		//���� �����ڴ� �ٸ� ������ ���� ���� �����ϰ� ���� ���� 1 ����/�����ϰ� ������ ����� ���� ��ȯ�Ѵ�.
		//int a=1; 
		//int temp = a; 
		//a=a-1 
		//a-- --> return 1; ��ȯ
		
		
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

public class P003_Heap {

	public static void main(String[] args) {

		
			int n , item;
			Heap h= new Heap(); 
			
			for(int i=1; i<=5; i++){
				
				h.insertHeap(i);
			}
	

			h.printHeap();
			
			System.out.println("max heap="+h.deleteHeap());

			
	
			
	}

}
