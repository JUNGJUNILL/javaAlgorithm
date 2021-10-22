package datastructure; 


class P001_stack {
	public static void main(String[] args) {
		//STACK은 후입선출
		
		int stackSize=5; 
		char deletetedItem; 
		ArrayStack S =new ArrayStack(stackSize); 
		S.push('A');
		S.printStack(); 
		
		S.push('B');
		S.printStack(); 
		
		
		S.push('C');
		S.printStack(); 
		
		//System.out.printf("S.peek()  %c",S.peek());
		
		deletetedItem = S.pop(); 
		if(deletetedItem !=0){
			System.out.println("deleted Item : "  + deletetedItem);
			S.printStack();
		}
		
		
		
	}
	
}



interface Stack{
	
	boolean isEmpty(); 
	void push(char item); 
	char pop(); 
	void delete(); 
	char peek(); 
	
}



class ArrayStack implements Stack{
	
	private int top; 
	private int stackSize; 
	private char[] itemArray; 
	
	public ArrayStack(int stackSize){
		top = -1;
		this.stackSize = stackSize; 
		itemArray = new char[this.stackSize]; 
	}
	
	@Override
	public boolean isEmpty(){
		return (top == -1); 
	}
	
	public boolean isFull(){
		return (top == this.stackSize-1); 
	}
	
	@Override
	public void push(char item){
		if(isFull()){
			System.out.println("삽입실패, 스택이 꽉 찼습니다.");
		}else{
			itemArray[top=top+1]=item; 
			System.out.println("insert Item : "+item);
		}
	}
	
	@Override
	public char pop(){
		if(isEmpty()){
			System.out.println("스택을 삭제할 수 없습니다, 스택이 비어있습니다.");
			return 0; 
		}else{
			return itemArray[top=top-1]; 
		}
	}
	
	@Override
	public void delete(){
		if(isEmpty()){
			System.out.println("스택을 삭제할 수 없습니다, 스택이 비어있습니다.");

		}else{
			top=top-1; 
		}
	}
	
	@Override
	public char peek(){
		if(isEmpty()){
			System.out.println("스택을 삭제할 수 없습니다, 스택이 비어있습니다.");
			return 0; 
		}else{
			return itemArray[top]; 
		}
		
	}
	
	public void printStack(){
		if(isEmpty()){
			System.out.printf("Array stack is empty!! %n %n");
			
		}else{
			System.out.println("Array stack>>" + " top : " + top);
			for(int i=0; i<=top; i++){
				System.out.printf("%c ",itemArray[i]);
				System.out.println();
				System.out.println();
			}
		}
	}
	
	
	
	
}
