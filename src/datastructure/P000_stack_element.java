package datastructure;


class ClassName<E> {
	
	private E element; 
	void set(E element){
		this.element = element; 
	}
	
	E get(){
		return element; 
	}
	
}

public class P000_stack_element {
	//stack ���� �� �˾ƾ��� �͵� ���׸� Ŭ����.. 
	
	
	public static void main(String[] args) {
		
		ClassName<String> a =new ClassName<String>();
		a.set("world");
		System.out.println(a.get());
		
		
		
		
	}

}
