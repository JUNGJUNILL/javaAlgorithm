package datastructure_Queue;

import javax.rmi.ssl.SslRMIClientSocketFactory;

interface Queue01{
	boolean isEmpty(); 
	void enQueue(char item); 
	char deQueue(); 
	void delete(); 
	char peek();
}

class ArrayQueue01 implements Queue01{
	
	private int front; 
	private int rear; 
	private int queueSize; 
	private char[] itemArray; 
	
	public ArrayQueue01(int queueSize) {
		front = -1; 
		rear  =-1; 
		this.queueSize = queueSize; 
		itemArray = new char[this.queueSize]; 
		
	}
	
	@Override
	public boolean isEmpty(){
		return (front==rear); 
	}
	
	public boolean isFull(){
		return (rear == this.queueSize-1); 
	}
	
	
	@Override
	public void enQueue(char item){
		if(isFull()){
			System.out.println("Inserting fail! Array Queue is full!!");
		}else{
			itemArray[++rear]=item; 
			System.out.println("Inserting Item : "+item);
		}
	}
	
	@Override
	public char deQueue(){
		if(isEmpty()){
			System.out.println("Deleting fail!! Array Queue is empty");
			return 0; 
		}else{
			return itemArray[++front]; 
		}
		
	}
	
	@Override
	public void delete(){
		if(isEmpty()){
			System.out.println("Deleting fail! Array Queue is empty");
		}else{
			++front; 
		}
		
	}
	
	
	@Override
	public char peek(){
		if(isEmpty()){
			System.out.println("Peeking fail! Array Queue is empty!");
			return 0; 
		}else{
			return itemArray[front+1]; 
		}
	
	}
	
	public void printQueue(){
		if(isEmpty()){
			System.out.printf("Array Queue is Empty!! %n %n");
		}else{
			System.out.printf("Array Queue >> ");
			
			for(int i=front+1; i<=rear; i++){
				System.out.printf("%c " ,itemArray[i]);
			}
			System.out.println();
		}
	}
	
	
	
}

public class P001_Queue {

	public static void main(String[] args) {
		
		int qSize= 3; 
		char deleteItem; 
		ArrayQueue01 Q=new ArrayQueue01(qSize); 
		
		Q.enQueue('A');
		
		Q.enQueue('B');
		
		Q.enQueue('C');
		
		Q.printQueue();
		
	
		//front 3인 상태, rear도 3인 상태 
		
		
		
//		deleteItem = Q.deQueue(); 
//		if(deleteItem !=0){
//			System.out.println("delete Item : " + deleteItem);
//		}
//		Q.printQueue();
//		
//		Q.enQueue('C');
//		Q.printQueue();
//		
//		deleteItem = Q.deQueue(); 
//		if(deleteItem !=0){
//			System.out.println("delete Item : " + deleteItem);
//		}
//		Q.printQueue();
//		
//		deleteItem = Q.deQueue(); 
//		if(deleteItem != 0 ){
//			System.out.println("deleted Item : " + deleteItem);
//		}
//		Q.printQueue();

	}

}
