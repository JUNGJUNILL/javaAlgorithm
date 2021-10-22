package datastructure;


class P002_queue {
	public static void main(String[] args) {

		int queueSize=3; 
		char deletedItem; 
		ArrayQueue Q =new ArrayQueue(queueSize); 
		Q.enQueue('A');
		Q.printQueue();
		
		
		Q.enQueue('B');
		Q.printQueue();
		
		Q.enQueue('C');
		Q.printQueue();
		
		Q.delete();
		
		
	}
	
	

	
	

}



interface Queue{
	boolean isEmpty(); 
	void enQueue(char item);
	char deQueue(); 
	void delete(); 
	
}

class ArrayQueue implements Queue{
	private int front; 
	private int rear; 
	private int queueSize; 
	private char itemArray[]; 
	
	public ArrayQueue(int queueSize){
		front=-1;
		rear =-1; 
		this.queueSize=queueSize;
		itemArray=new char[this.queueSize]; 
		
	}
	
	@Override
	public boolean isEmpty(){
		return (front == rear); 
		
	}
	
	public boolean isFull(){
		return (rear == this.queueSize-1); 
	}
	
	@Override
	public void enQueue(char item){
		if(isFull()){
			System.out.println("Inserting fail! Array Queue is full!!");
		}else{
			itemArray[rear=rear+1]=item;  
			System.out.println("Inserted Item : "  + item);
		}
	}
	
	@Override
	public char deQueue(){
		if(isEmpty()){
			System.out.println("Deleting fall! Array Queue is empty");
			return 0; 
		}else {
			return itemArray[front=front+1];
		}
	}
	
	
	@Override
	public void delete(){
		if(isEmpty()){
			System.out.println("Deleting fail !! Array Queue is empty!!");
		}else{
			front = front+1; 
		}
	}
	
	public char peek(){
		if(isEmpty()){
			System.out.println("Peeking fail! Array Queue is Empty");
			return 0; 
		}else{
			return itemArray[front=front+1]; 
		}
	}
	
	public void printQueue(){
		if(isEmpty()){
			System.out.printf("Array Queue is empty!! %n %n");
		}else{
			System.out.println("Array Queue>> ");
			for(int i=front+1; i<=rear; i++){
				System.out.printf("%c ",itemArray[i]);
				System.out.println();
				System.out.println();
			}
		}
	}
	
	
}


