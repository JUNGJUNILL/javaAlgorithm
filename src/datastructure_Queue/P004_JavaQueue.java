package datastructure_Queue;

import java.util.*;

public class P004_JavaQueue {

	public static void main(String[] args) {
		
		Queue<Integer> q= new LinkedList<Integer>(); 
		
		Scanner in = new Scanner(System.in);
		StringBuffer bf = new StringBuffer(); 

		int num = in.nextInt(); 
		for(int i=1; i<=num; i++){
				
				String str=in.next();
				 
				if(str.equals("push")){
					q.add(in.nextInt()); 
					
				}else if(str.equals("empty")){
					if(!q.isEmpty()){
						bf.append(0+"\n");
					}else{
						bf.append(1+"\n");
					}
				}else if(str.equals("pop")){
					if(!q.isEmpty()){
						bf.append(q.poll()+"\n"); 						
					}else{
						bf.append(-1+"\n"); 
					}
					
				}else if(str.equals("size")){
					bf.append(q.size()+"\n"); 
					
				}else if(str.equals("front")){
					if(!q.isEmpty()){
						bf.append(q.peek()+"\n"); 
					}else{
						bf.append(-1+"\n"); 
					}
				}else if(str.equals("back")){
					
					if(!q.isEmpty()){
						int temp=0; 
						Iterator<Integer> itor = q.iterator(); 
						while(itor.hasNext()){
							temp=itor.next();
						}
						bf.append(temp+"\n"); 
					}else{
						bf.append(-1+"\n");
					}
					
				}
				
			}
		
		System.out.println(bf.toString());
		
	
	}
	

}
