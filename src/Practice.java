import java.util.Scanner;


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
			System.out.println("������ ���� : "+ item);
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




public class Practice {
	
	public static void main(String[] args) {
		

		int[] array = new int[7]; 
		array[0]=9;
		array[1]=3;
		array[2]=9;
		array[3]=3;
		array[4]=9;
		array[5]=7;
		array[6]=9;
		
		int temp=0; 
		for(int i=0; i<array.length; i++){
			temp=temp^array[i];
			System.out.println("temp="+temp + " : " +(temp^array[i]));
		}
		System.out.println(temp);
		
		
	}
}

