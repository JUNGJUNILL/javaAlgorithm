
import java.util.*;
import java.util.concurrent.SynchronousQueue; 


public class Practice {

	public static void main(String[] args) {
		
		String[] records ={
				 "05:34 5961 IN", 
				 "06:00 0000 IN", 
				 "06:34 0000 OUT", 
				 "07:59 5961 OUT", 
				 "07:59 0148 IN", 
				 "18:59 0000 IN", 
				 "19:09 0148 OUT", 
				 "22:59 5961 IN", 
				 "23:00 5961 OUT"
				 };
	
		  Queue<String> q=new LinkedList<>(); 
		  int number=0; 
		   for(int i=0; i<records.length; i++){
		       	if(!q.contains(records[i].split(" ")[1])){
	        		q.add(records[i].split(" ")[1]); 
	        		number++;
	        	}
	        }
		   String[] array = new String[number]; 
		   for(int i=0; i<number; i++){
			   String index=  q.poll(); 
			   array[i]=index;
		   }
		   
		   for(String i : array){
			   System.out.println("¾ÆÀÌ="+i);
		   }
		


		   
		

	}
}