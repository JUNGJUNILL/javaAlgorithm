package datastructure_Queue;

interface Queue02{
	boolean isEmpty(); 
	void enQueue(char item); 
	char deQueue(); 
	void delete(); 
	char peek();
}

class QNode02{
	char data; 
	QNode02 link; 
}

class LinkedQueue02 implements Queue02{
	QNode02 front; 
	QNode02 rear; 
	
	
	public LinkedQueue02(){
		front =null; 
		rear  =null; 
	}
	
	@Override
	public boolean isEmpty(){
		return (front==null); 
	}

	@Override
	public void enQueue(char item) {
		QNode02 newNode = new QNode02(); 
		newNode.data = item; 
		newNode.link =null; 
		
		if(isEmpty()){
			front = newNode; 
			rear  =newNode; 
		}else{
			rear.link = newNode; 
			rear     =newNode; 
		}
		
	}

	@Override
	public char deQueue() {
		if(isEmpty()){
			return 0 ; 
		}else{
			char item  =front.data; 
			front     = front.link; 
			
			if(front==null){
				rear = null; 
			}
			return item; 
		}
	}

	@Override
	public void delete() {
		
	}

	@Override
	public char peek() {
		
		if(isEmpty()){
			return 0; 
		}else{
			return front.data;	
		}
		 
	}
	
	
	
	
}


public class P003_LinkedQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
