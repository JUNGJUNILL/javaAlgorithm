package datastructure_Queue;

import javax.print.DocFlavor.READER;

class QNode{
	int data; 
	QNode link; 
}

class LinkedQueue{
	QNode front; 
	QNode rear;
	
	public LinkedQueue(){
		front = null; 
		rear  = null; 
	}
	
	public boolean isEmpty(){
		return (front == null); 
	}
	
	public void enQueue(int item){
		QNode newNode =new QNode(); 
		newNode.data = item; 
		newNode.link = null; 
		
		
		if(isEmpty()){
			
			front = newNode; 
			rear  = newNode; 
		}else{
			rear.link = newNode; 
			rear      = newNode; 
			
		}
		
	}
	
	public int deQueue(){
		if(isEmpty()){
			System.out.println("Deleting fail! Linked Queue is empty!! ");
			return 0;
		}else{
			int item = front.data; 
			front    = front.link; 
			
			if(front == null){
				rear = null;
			}
			return item; 
		}
	}
	
	
	
}

public class P002_LinkedQueue {

	public static void main(String[] args) {

		LinkedQueue linkQ=new LinkedQueue(); 
		
		linkQ.enQueue(3);
		linkQ.enQueue(2);
		linkQ.enQueue(1);
		
		while(!linkQ.isEmpty()){
			System.out.println(linkQ.deQueue()
					);
		}
		
	}

}
