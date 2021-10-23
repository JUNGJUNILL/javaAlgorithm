package datastructure_Stack;import java.beans.DefaultPersistenceDelegate;

interface Stack01{
	boolean isEmpty(); 
	void push(char item); 
	char pop(); 
	void delete(); 
	char peek(); 
}

class StackNode01 {
	char data; 
	StackNode01 link; 
}

class LinkedStack01 implements Stack01{
	
	
	private StackNode01 top; 
	
	

	@Override
	public boolean isEmpty() {
		return (top==null); 
	}
	
	@Override
	public void push(char item) {
		StackNode01 newNode = new StackNode01(); 
		newNode.data = item; 
		newNode.link =top; 
		top = newNode; 
		System.out.println("Insert item : "+ item);
	}

	@Override
	public char pop() {
		if(isEmpty()){
			System.out.println("delete fail! Linked Stack is empty!!");
			return 0; 
		}else{
			char item = top.data; 
			top = top.link; 
			return item; 
		}
	}

	@Override
	public void delete() {
		if(isEmpty()){
			System.out.println("delete fail! Linked Stack si empty!!");
		}else{
			top=top.link; 
		}
	}
	

	@Override
	public char peek() {
		
		if(isEmpty()){
			System.out.println("Peeking is fail! Linked Stack is Empty!");
			return 0; 
		}else{
			return top.data; 
		}
		
	}
	
	public void printStack(){
		if(isEmpty()){
			System.out.printf("Linked Stack is empty! %n %n");
		}else{
			StackNode01 temp = top; 
			System.out.printf("Linked Stack>> ");
			
			while(temp!=null){
				System.out.printf("\t %c \n",temp.data);
				temp=temp.link; 
			}
			System.out.println();		
		}
	}
}

public class P002_LinkedStack {

	public static void main(String[] args) {
		
		char delteItem; 
		LinkedStack01 LS = new LinkedStack01(); 
		
		LS.push('A');
		LS.push('B');
		LS.push('C');
		LS.printStack();
		
		delteItem=LS.pop(); 
		System.out.println(delteItem);
		
		
		
	}

}
