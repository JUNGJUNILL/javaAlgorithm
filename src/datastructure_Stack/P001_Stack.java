package datastructure_Stack;

import java.util.Arrays;

interface Stack{
	boolean isEmpty(); 
	void push(char item); 
	char pop(); 
	void delete(); 
	char peek(); 
}

class ArrayStack implements Stack{
	
	public int top; 
	private int stackSize; 
	private char[] itemArray; 
	
	public ArrayStack(int stackSize) {
		
		top = -1; 
		this.stackSize = stackSize; 
		itemArray = new char[this.stackSize]; 
		
	}
	
	public boolean isEmpty(){
		return (top== -1); 
	}
	
	public boolean isFull(){
		return (top==this.stackSize-1); 
	}
	
	
	@Override
	public void push(char item){
		
		if(isFull()){
			System.out.println("���� ����! ������ �� á���ϴ�.");
			
		}else{
			itemArray[++top] = item; 
			System.out.println("������ ���� : "+ item+" top="+top) ;
		}
	}
	
	@Override
	public char pop(){
		if(isEmpty()){
			System.out.println("���� ����! ������ ������ϴ�.");
			return 0; 
		}else{
			return itemArray[top--]; 
		}
	}
	
	@Override
	public void delete(){
		if(isEmpty()){
			System.out.println("���� ����! ������ ������ϴ�.");
		}else{
			top--; 
		}
		
	}
	
	@Override
	public char peek(){
		if(isEmpty()){
			System.out.println("���� ����! ������ ������ϴ�.");
			return 0; 
		}else{
			return itemArray[top]; 
		}
		
	}
	
	public void printStack(){
		if(isEmpty()){
			System.out.printf("�迭�� ������ϴ�!! %n %n");			
		}else{
			System.out.printf("Array Stack>> ");
			for(int i=0; i<=top; i++){
				System.out.printf("%c ",itemArray[i]);
			}
			System.out.println();

		}
		
		
	}
	
}


public class P001_Stack {

	public static void main(String[] args) {

		int stackSize=5; 
		char deleteItem; 
		ArrayStack S = new ArrayStack(stackSize); 
		
		
		for(int i=0; i<stackSize; i++){
			S.push((char)(i+65));
		}
		S.printStack();

		
		
		//stack �����͸� �� ���� ����
		for(int i=0; i<stackSize; i++){
			 
			System.out.println(S.pop()+ " : " + S.top);
		}

		
//		deleteItem = S.pop(); //top 4
//		
//		if(deleteItem != 0){
//			System.out.println("deleteItem=  "+deleteItem);
//			
//		}
//		S.printStack();
//		
//		
	}

}
