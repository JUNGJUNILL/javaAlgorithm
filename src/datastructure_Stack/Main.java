package datastructure_Stack;

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
		return (front==null); 
	}
	
	
	public void enQueue(int item){
			
		QNode newNode=new QNode(); 
		newNode.data = item; 
		newNode.link = null; 
	
		if(isEmpty()){			
			
			//front와 rear는 같은 객체를 참조 하고 있으므로... 
			front = newNode;
			rear  = newNode;
			System.out.println("front.link==rea.link="+(front.link==rear.link));
		}else{
			rear.link = newNode;
			System.out.println("front.link==rear.link="+(front.link==rear.link) + " item="+item);
			rear      = newNode;
		

		}
	
	}
	
	public int deQueue(){
		
		
		if(isEmpty()){
			System.out.print("Deleting fail! Linked Queue is empty!!    ");
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




class StackNode{
	int data; 
	StackNode link;
}

class LinkedStack{
	StackNode top; 
	
	
	public boolean isEmpty(){
		return(top == null); 
	}
	
	public void push(int item){
		StackNode newNode = new StackNode(); 
		newNode.data = item; 
		newNode.link = top; 
		top  = newNode; 
	}
	
	public int pop(){
		if(isEmpty()){
			System.out.printf("Deleting fail!   ");
			return 0; 
			
		}else{
			int item = top.data; 
			top = top.link; 
			return item; 
			
		}
	}
	
}


public class Main {

	public static void main(String[] args) {
		
		LinkedStack linkstack = new LinkedStack(); 
		LinkedQueue linkQueue = new LinkedQueue(); 
		
		linkstack.push(1);
		linkstack.push(2);
		linkstack.push(3);
		
		System.out.println(linkstack.pop());
		System.out.println(linkstack.pop());
		System.out.println(linkstack.pop());
		
		System.out.println(linkstack.pop());

		System.out.println("========================");
		linkQueue.enQueue(1);
		linkQueue.enQueue(2);
		linkQueue.enQueue(3);
		linkQueue.enQueue(4);

		
		System.out.println(linkQueue.deQueue());
		System.out.println(linkQueue.deQueue());
		System.out.println(linkQueue.deQueue());
		
		System.out.println(linkQueue.deQueue());

		

	
	}

}
