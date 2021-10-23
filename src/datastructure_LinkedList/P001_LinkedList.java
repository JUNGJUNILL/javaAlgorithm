package datastructure_LinkedList;

class ListNode01{
	private String data; 
	public ListNode01 link; 
	public ListNode01(){
		this.data=null; 
		this.link=null; 
	}
	
	public ListNode01(String data){
		this.data=data; 
		this.link=null; 
	
	}
	
	public ListNode01(String data, ListNode01 link){
		this.data=data; 
		this.link=link; 
	}
	
	public String getData(){
		return this.data;
	}
	
}

class LinkedList01{
	private ListNode01 head; 
	public LinkedList01(){
		head=null; 
	}
	
	public void insertMiddleNode(ListNode01 pre, String data){
		ListNode01 newNode=new ListNode01(data); 
		newNode.link = pre.link; 
		pre.link = newNode; 
	}
	
	public void insertLastNode(String data){
		
		ListNode01 newNode = new ListNode01(data); 
		
		if(head==null){
			this.head = newNode; 
		}else{
			ListNode01 tmp = head;
			while(tmp.link != null){
				tmp = tmp.link; 
			}
			tmp.link=newNode;
		}
	}
	
	
	
	
	
	
	
}

public class P001_LinkedList {

	public static void main(String[] args) {

	}

}
