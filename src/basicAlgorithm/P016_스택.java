package basicAlgorithm;

import java.util.Scanner;

public class P016_Ω∫≈√ {

	public static void main(String[] args) {

		
		Scanner in = new Scanner(System.in);
		LinkedStack02 LS =new LinkedStack02(); 
		StringBuffer bf = new StringBuffer(); 

		int num = in.nextInt(); 
		
		for(int i=1; i<=num; i++){
			
			String str=in.next();
			 
			if(str.equals("push")){
				LS.push(in.nextInt());
			}else if(str.equals("top")){
				bf.append(LS.top()+"\n"); 
			}else if(str.equals("size")){
				bf.append(LS.stackSize+"\n"); 
			}else if(str.equals("pop")){
				bf.append(LS.pop()+"\n"); 	
			}else if(str.equals("empty")){
				bf.append(LS.isEmpty()+"\n"); 
			}
		}
		
		System.out.println(bf.toString());

		
		
		
	}

}



class LinkedStack02{
		
		class StackNode{
			int data; 
			StackNode link;  	
		}
		
		
		public int stackSize=0; 
		StackNode top; 
		
		
		public int isEmpty(){
			if(top==null){
				return 1; 
			}else{
				return 0; 
			}
	 
		}
		
		
		public void push(int item){
			StackNode newNode=new StackNode(); 
			newNode.data =item; 
			newNode.link = top; 
			top =newNode; 
			++stackSize; 
		}
		
		public int pop(){
			
			
			if(isEmpty()==1){
				return -1; 
			}else{
				int num = top.data; 
				top = top.link;
				--stackSize; 
				return num;
			}
		
			
		}
		
		public int top(){
			if(isEmpty()==1){
				return -1; 
			}else{
				return top.data; 
			}
		}
	
}

